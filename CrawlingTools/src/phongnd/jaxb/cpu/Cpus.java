
package phongnd.jaxb.cpu;

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
 *         &lt;element name="cpu" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="mhzTurbo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="coresThread" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bit64" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bit32Single" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bit32Multi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bit64Single4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bit64Multi4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bit64Single5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bit64Multi5" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cpu"
})
@XmlRootElement(name = "cpus")
public class Cpus {

    @XmlElement(required = true)
    protected List<Cpus.Cpu> cpu;

    /**
     * Gets the value of the cpu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cpus.Cpu }
     * 
     * 
     */
    public List<Cpus.Cpu> getCpu() {
        if (cpu == null) {
            cpu = new ArrayList<Cpus.Cpu>();
        }
        return this.cpu;
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
     *         &lt;element name="codename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="mhzTurbo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="coresThread" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bit64" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bit32Single" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bit32Multi" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bit64Single4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bit64Multi4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bit64Single5" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bit64Multi5" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "codename",
        "mhzTurbo",
        "coresThread",
        "architecture",
        "bit64",
        "bit32Single",
        "bit32Multi",
        "bit64Single4",
        "bit64Multi4",
        "bit64Single5",
        "bit64Multi5"
    })
    public static class Cpu {

        @XmlElement(required = true)
        protected String model;
        @XmlElement(required = true)
        protected String codename;
        @XmlElement(required = true)
        protected String mhzTurbo;
        @XmlElement(required = true)
        protected String coresThread;
        @XmlElement(required = true)
        protected String architecture;
        @XmlElement(required = true)
        protected String bit64;
        @XmlElement(required = true)
        protected String bit32Single;
        @XmlElement(required = true)
        protected String bit32Multi;
        @XmlElement(required = true)
        protected String bit64Single4;
        @XmlElement(required = true)
        protected String bit64Multi4;
        @XmlElement(required = true)
        protected String bit64Single5;
        @XmlElement(required = true)
        protected String bit64Multi5;

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
         * Gets the value of the codename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodename() {
            return codename;
        }

        /**
         * Sets the value of the codename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodename(String value) {
            this.codename = value;
        }

        /**
         * Gets the value of the mhzTurbo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMhzTurbo() {
            return mhzTurbo;
        }

        /**
         * Sets the value of the mhzTurbo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMhzTurbo(String value) {
            this.mhzTurbo = value;
        }

        /**
         * Gets the value of the coresThread property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoresThread() {
            return coresThread;
        }

        /**
         * Sets the value of the coresThread property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoresThread(String value) {
            this.coresThread = value;
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
         * Gets the value of the bit64 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBit64() {
            return bit64;
        }

        /**
         * Sets the value of the bit64 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBit64(String value) {
            this.bit64 = value;
        }

        /**
         * Gets the value of the bit32Single property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBit32Single() {
            return bit32Single;
        }

        /**
         * Sets the value of the bit32Single property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBit32Single(String value) {
            this.bit32Single = value;
        }

        /**
         * Gets the value of the bit32Multi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBit32Multi() {
            return bit32Multi;
        }

        /**
         * Sets the value of the bit32Multi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBit32Multi(String value) {
            this.bit32Multi = value;
        }

        /**
         * Gets the value of the bit64Single4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBit64Single4() {
            return bit64Single4;
        }

        /**
         * Sets the value of the bit64Single4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBit64Single4(String value) {
            this.bit64Single4 = value;
        }

        /**
         * Gets the value of the bit64Multi4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBit64Multi4() {
            return bit64Multi4;
        }

        /**
         * Sets the value of the bit64Multi4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBit64Multi4(String value) {
            this.bit64Multi4 = value;
        }

        /**
         * Gets the value of the bit64Single5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBit64Single5() {
            return bit64Single5;
        }

        /**
         * Sets the value of the bit64Single5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBit64Single5(String value) {
            this.bit64Single5 = value;
        }

        /**
         * Gets the value of the bit64Multi5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBit64Multi5() {
            return bit64Multi5;
        }

        /**
         * Sets the value of the bit64Multi5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBit64Multi5(String value) {
            this.bit64Multi5 = value;
        }

    }

}
