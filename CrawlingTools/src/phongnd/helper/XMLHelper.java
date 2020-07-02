/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongnd.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import phongnd.stax.DTDReplacer;

/**
 *
 * @author YiyilookDuy
 */
public class XMLHelper implements Serializable {

    public static Document parseFileToDOM(String xmlFilePatch) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFilePatch);

        return doc;
    }

    public static XPath getXpath() {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();

        return xpath;
    }

    public static void TransformDOMToFile(Node node, String xmlPath) throws TransformerConfigurationException, TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        Source src = new DOMSource(node);

        Result result = new StreamResult(xmlPath);

        transformer.transform(src, result);
    }

    public static void ParseXMLToSax(String xmlFilePath, DefaultHandler handler) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser sax = factory.newSAXParser();
        sax.parse(xmlFilePath, handler);
    }

    public static XMLStreamReader parseXMLToStax(InputStream stream) throws XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = factory.createXMLStreamReader(stream);
        return reader;
    }

    public static String getTextContent(String elementName, XMLStreamReader reader) throws XMLStreamException {
        if (elementName == null) {
            return null;
        }
        if (elementName.trim().isEmpty()) {
            return null;
        }

        if (reader == null) {
            return null;
        }

        while (reader.hasNext()) {
            int currentCursor = reader.getEventType();

            if (currentCursor == XMLStreamConstants.START_ELEMENT) {
                String tagName = reader.getLocalName();

                if (elementName.equals(tagName)) {
                    reader.next();//value
                    String result = reader.getText();
                    reader.nextTag();//end element
                    return result;
                }
            }

            reader.next();
        }
        return null;
    }

    public static boolean checkWellform(String xmlPath) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return false;
        }
        builder.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) throws SAXException {
                System.out.println("warning: " + exception);
            }

            @Override
            public void error(SAXParseException exception) throws SAXException {
                System.out.println("error: " + exception);
            }

            @Override
            public void fatalError(SAXParseException exception) throws SAXException {
                System.out.println("fatal: " + exception);
            }
        });
        try {
            builder.parse(xmlPath);
            return true;
        } catch (SAXException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void addDTDToXML(String dtdPath, String xmlPath, String outputPath) throws XMLStreamException, TransformerConfigurationException, TransformerException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent dtd = eventFactory
                .createDTD("<!DOCTYPE phone SYSTEM \"" + dtdPath + "\">");

        XMLInputFactory inFactory = XMLInputFactory.newInstance();
        XMLOutputFactory outFactory = XMLOutputFactory.newInstance();
        XMLEventReader reader = inFactory
                .createXMLEventReader(new StreamSource(
                        xmlPath));
        reader = new DTDReplacer(reader, dtd);
        Path currentRelativePath = Paths.get("");
        String absolutePath = currentRelativePath.toAbsolutePath().toString();
        try {
            FileOutputStream fos = new FileOutputStream(outputPath);

            XMLEventWriter writer = outFactory.createXMLEventWriter(fos, "UTF-8");
            writeEvents(reader, writer);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void writeEvents(XMLEventReader reader, XMLEventWriter writer) throws XMLStreamException {
        while (reader.hasNext()) {
            XMLEvent event = reader.nextEvent();
            writer.add(event);
        }
        writer.close();
        reader.close();
    }
    
    public static boolean checkValid(String schemaPath, String xmlPath){
        File schemaFile = new File(schemaPath);
        Source xmlFile = new StreamSource(new File(xmlPath));
        
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try{
            Schema schema = factory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(xmlFile);
            return true;
        }catch(IOException |SAXException e){
            e.printStackTrace();
            return false;
        }
                
                
    }
}
