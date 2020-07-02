/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongnd.crawlingtools;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import phongnd.helper.JAXBHelper;
import phongnd.helper.XMLHelper;
import phongnd.jaxb.cpu.Cpus;
import phongnd.jaxb.gpu.Gpus;
import phongnd.jaxb.phone.Phone;
import phongnd.statemachine.CrawlHTML;
import phongnd.statemachine.TextUtils;

/**
 *
 * @author kazen
 */
public class CrawlingTools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String urlPage = new Scanner(System.in).nextLine();

            String html = CrawlHTML.getPageContent(urlPage);
            html = TextUtils.refineHTML(html);
            Path currentRelativePath = Paths.get("");
            String absolutePath = currentRelativePath.toAbsolutePath().toString();

            //write file
            FileWriter myWriter = new FileWriter(absolutePath + "/src/phongnd/xml/filename.xml");
            myWriter.write("<?xml version = \"1.0\" encoding = \"UTF-8\"?>\n" + html);
            myWriter.close();

            Document doc = XMLHelper.parseFileToDOM("./src/phongnd/xml/filename.xml");

            //phone
            XPath xPath = XMLHelper.getXpath();
            String exp = "//section[@class='products-view products-view-grid']/div/div/a";
            NodeList nodeL = (NodeList) xPath.evaluate(exp, doc, XPathConstants.NODESET);
            List<String> urls = new ArrayList<>();

            if (nodeL != null) {
                System.out.println(nodeL.getLength());
                exp += "//@href";
                for (int i = 0; i < nodeL.getLength(); i++) {

                    Node node = nodeL.item(i);
                    String value = node.getAttributes().getNamedItem("href").getNodeValue();
                    String url = xPath.evaluate(exp, node, XPathConstants.STRING).toString();
                    urls.add(url);
                }
            }
            String htmlItem = CrawlHTML.getPageContent("https://worldphone.vn" + urls.get(0));
            htmlItem = TextUtils.refineHTML(htmlItem);

            FileWriter myWriterItem = new FileWriter(absolutePath + "/src/phongnd/xml/phone.xml");
            myWriterItem.write("<?xml version = \"1.0\" encoding = \"UTF-8\"?>\n" + htmlItem);
            myWriterItem.close();

            JAXBHelper.transformXML("./src/phongnd/xsl/phone.xsl", "./src/phongnd/xml/phone.xml", absolutePath + "./src/phongnd/xsl/phone_output.xml");

            boolean well = XMLHelper.checkWellform("./src./phongnd./xsl./phone_output.xml");
            boolean valid = XMLHelper.checkValid("./src/phongnd/schema/phone.xsd","./src/phongnd/xsl/phone_output.xml");

            Phone phone = (Phone)JAXBHelper.unmarshall(Phone.class, new File("./src/phongnd/xsl/phone_output.xml"));
            System.out.println(phone.getName());

//            cpus

//            JAXBHelper.transformXML(absolutePath + "./src/phongnd/xsl/cpus.xsl","./src/phongnd/xml/filename.xml","./src/phongnd/xsl/cpus_output.xml");
//            boolean well = XMLHelper.checkWellform("./src/phongnd/xsl/cpus_output.xml");
//            if (well) {
//                boolean valid = XMLHelper.checkValid( "./src/phongnd/schema/cpus.xsd","./src/phongnd/xsl/cpus_output.xml");
//                if (valid) {
//                    Cpus cpus = JAXBHelper.unmarshall(Cpus.class, new File("./src/phongnd/xsl/cpus_output.xml"));
//                    List<Cpus.Cpu> cpuList = cpus.getCpu();
//                    System.out.println(cpuList.get(0).getModel());
//                }
//            }

            //gpus
            
//            JAXBHelper.transformXML("./src/phongnd/xsl/gpus.xsl", "./src/phongnd/xml/filename.xml", "./src/phongnd/xsl/gpus_output.xml");
//            boolean well = XMLHelper.checkWellform("./src/phongnd/xsl/gpus_output.xml");
//            if (well) {
//                boolean valid = XMLHelper.checkValid("./src/phongnd/schema/gpus.xsd", "./src/phongnd/xsl/gpus_output.xml");
//
//                if (valid) {
//                    Gpus gpus = JAXBHelper.unmarshall(Gpus.class, new File("./src/phongnd/xsl/gpus_output.xml"));
//                    List<Gpus.Gpu> gpuList = gpus.getGpu();
//                    System.out.println(gpuList.get(0).getModel());
//                }
//            }

//            
//            //jaxb class
//            JAXBHelper.generateClass("phongnd.jaxb.phone", new File(absolutePath + "\\src\\phongnd\\schema\\phone.xsd"), "src/");
//            JAXBHelper.generateClass("phongnd.jaxb.cpu", new File(absolutePath + "\\src\\phongnd\\schema\\cpus.xsd"), "src/");
//            JAXBHelper.generateClass("phongnd.jaxb.gpu", new File(absolutePath + "\\src\\phongnd\\schema\\gpus.xsd"), "src/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
