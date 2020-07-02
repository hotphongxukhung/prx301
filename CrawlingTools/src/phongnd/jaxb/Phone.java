
package phongnd.jaxb;

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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="screen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="screenSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cameraFront" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cameraBack" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operatingSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="battery" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "name",
    "screen",
    "resolution",
    "screenSize",
    "cameraFront",
    "cameraBack",
    "operatingSystem",
    "cpu",
    "gpu",
    "ram",
    "rom",
    "battery"
})
@XmlRootElement(name = "phone")
public class Phone {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String screen;
    @XmlElement(required = true)
    protected String resolution;
    @XmlElement(required = true)
    protected String screenSize;
    @XmlElement(required = true)
    protected String cameraFront;
    @XmlElement(required = true)
    protected String cameraBack;
    @XmlElement(required = true)
    protected String operatingSystem;
    @XmlElement(required = true)
    protected String cpu;
    @XmlElement(required = true)
    protected String gpu;
    @XmlElement(required = true)
    protected String ram;
    @XmlElement(required = true)
    protected String rom;
    @XmlElement(required = true)
    protected String battery;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the screen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreen() {
        return screen;
    }

    /**
     * Sets the value of the screen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreen(String value) {
        this.screen = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the screenSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenSize() {
        return screenSize;
    }

    /**
     * Sets the value of the screenSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenSize(String value) {
        this.screenSize = value;
    }

    /**
     * Gets the value of the cameraFront property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraFront() {
        return cameraFront;
    }

    /**
     * Sets the value of the cameraFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraFront(String value) {
        this.cameraFront = value;
    }

    /**
     * Gets the value of the cameraBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraBack() {
        return cameraBack;
    }

    /**
     * Sets the value of the cameraBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraBack(String value) {
        this.cameraBack = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the cpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpu(String value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the gpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpu() {
        return gpu;
    }

    /**
     * Sets the value of the gpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpu(String value) {
        this.gpu = value;
    }

    /**
     * Gets the value of the ram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRam() {
        return ram;
    }

    /**
     * Sets the value of the ram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRam(String value) {
        this.ram = value;
    }

    /**
     * Gets the value of the rom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRom() {
        return rom;
    }

    /**
     * Sets the value of the rom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRom(String value) {
        this.rom = value;
    }

    /**
     * Gets the value of the battery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBattery() {
        return battery;
    }

    /**
     * Sets the value of the battery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBattery(String value) {
        this.battery = value;
    }

}
