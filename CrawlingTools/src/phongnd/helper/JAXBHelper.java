/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongnd.helper;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.api.ErrorListener;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.SchemaCompiler;
import com.sun.tools.xjc.api.XJC;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
/**
 *
 * @author kazen
 */
public class JAXBHelper implements Serializable {

    public static void generateClass(String packageName, File file, String outputPath) throws SAXException, IOException {
        SchemaCompiler sc = XJC.createSchemaCompiler();
        sc.setErrorListener(new ErrorListener() {
            @Override
            public void error(SAXParseException saxpe) {
                System.out.println("error: " + saxpe);
            }

            @Override
            public void fatalError(SAXParseException saxpe) {
                System.out.println("fatal: " + saxpe);
            }

            @Override
            public void warning(SAXParseException saxpe) {
                System.out.println("warning: " + saxpe);
            }

            @Override
            public void info(SAXParseException saxpe) {
                System.out.println("info: " + saxpe);
            }
        });
        
        sc.forcePackageName(packageName);
        InputSource is = new InputSource(file.toURI().toString());
        sc.parseSchema(is);
        
        S2JJAXBModel model = sc.bind();
        JCodeModel code = model.generateCode(null, null);
        code.build(new File(outputPath));
    }

    public static <T> T unmarshall(Class<T> obj, File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(obj);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return obj.cast(unmarshaller.unmarshal(xmlFile));
    }

    public static <T> void marshall(T obj, File xmlFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(obj, xmlFile);
    }

    //TrAX 
    public static void transformXML(String xslPath, String xmlPath, String outputPath)
            throws IOException, TransformerConfigurationException, TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource xsltFile = new StreamSource(xslPath);
        Templates template = transformerFactory.newTemplates(xsltFile);
        Transformer transformer = template.newTransformer();
        StreamSource xmlFile = new StreamSource(xmlPath);
        StreamResult output = new StreamResult(new FileOutputStream(outputPath));
        transformer.transform(xmlFile, output);
    }

}
