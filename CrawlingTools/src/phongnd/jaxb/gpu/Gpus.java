
package phongnd.jaxb.gpu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpu" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shaders" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="coreSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="openGL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="iceStrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ogl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="es" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gpu"
})
@XmlRootElement(name = "gpus")
public class Gpus {

    @XmlElement(required = true)
    protected List<Gpus.Gpu> gpu;

    /**
     * Gets the value of the gpu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gpu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGpu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gpus.Gpu }
     * 
     * 
     */
    public List<Gpus.Gpu> getGpu() {
        if (gpu == null) {
            gpu = new ArrayList<Gpus.Gpu>();
        }
        return this.gpu;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shaders" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="coreSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="openGL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="iceStrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ogl" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="es" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "model",
        "architecture",
        "shaders",
        "coreSpeed",
        "openGL",
        "iceStrom",
        "gfx",
        "ogl",
        "es"
    })
    public static class Gpu {

        @XmlElement(required = true)
        protected String model;
        @XmlElement(required = true)
        protected String architecture;
        @XmlElement(required = true)
        protected String shaders;
        @XmlElement(required = true)
        protected String coreSpeed;
        @XmlElement(required = true)
        protected String openGL;
        @XmlElement(required = true)
        protected String iceStrom;
        @XmlElement(required = true)
        protected String gfx;
        @XmlElement(required = true)
        protected String ogl;
        @XmlElement(required = true)
        protected String es;

        /**
         * Gets the value of the model property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModel() {
            return model;
        }

        /**
         * Sets the value of the model property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModel(String value) {
            this.model = value;
        }

        /**
         * Gets the value of the architecture property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArchitecture() {
            return architecture;
        }

        /**
         * Sets the value of the architecture property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArchitecture(String value) {
            this.architecture = value;
        }

        /**
         * Gets the value of the shaders property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShaders() {
            return shaders;
        }

        /**
         * Sets the value of the shaders property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShaders(String value) {
            this.shaders = value;
        }

        /**
         * Gets the value of the coreSpeed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoreSpeed() {
            return coreSpeed;
        }

        /**
         * Sets the value of the coreSpeed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoreSpeed(String value) {
            this.coreSpeed = value;
        }

        /**
         * Gets the value of the openGL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpenGL() {
            return openGL;
        }

        /**
         * Sets the value of the openGL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpenGL(String value) {
            this.openGL = value;
        }

        /**
         * Gets the value of the iceStrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIceStrom() {
            return iceStrom;
        }

        /**
         * Sets the value of the iceStrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIceStrom(String value) {
            this.iceStrom = value;
        }

        /**
         * Gets the value of the gfx property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGfx() {
            return gfx;
        }

        /**
         * Sets the value of the gfx property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGfx(String value) {
            this.gfx = value;
        }

        /**
         * Gets the value of the ogl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOgl() {
            return ogl;
        }

        /**
         * Sets the value of the ogl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOgl(String value) {
            this.ogl = value;
        }

        /**
         * Gets the value of the es property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEs() {
            return es;
        }

        /**
         * Sets the value of the es property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEs(String value) {
            this.es = value;
        }

    }

}
