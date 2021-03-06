
package ru.itmo.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loyalty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loyalty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spbso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brigade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loyalty", propOrder = {
    "spbso",
    "name",
    "event",
    "cash",
    "brigade"
})
public class Loyalty {

    protected String spbso;
    protected String name;
    protected String event;
    protected String cash;
    protected String brigade;

    /**
     * Gets the value of the spbso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpbso() {
        return spbso;
    }

    /**
     * Sets the value of the spbso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpbso(String value) {
        this.spbso = value;
    }

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
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCash(String value) {
        this.cash = value;
    }

    /**
     * Gets the value of the brigade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrigade() {
        return brigade;
    }

    /**
     * Sets the value of the brigade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrigade(String value) {
        this.brigade = value;
    }

}
