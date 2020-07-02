
package phongnd.jaxb.gpu;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the phongnd.jaxb.gpu package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: phongnd.jaxb.gpu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Gpus }
     * 
     */
    public Gpus createGpus() {
        return new Gpus();
    }

    /**
     * Create an instance of {@link Gpus.Gpu }
     * 
     */
    public Gpus.Gpu createGpusGpu() {
        return new Gpus.Gpu();
    }

}
