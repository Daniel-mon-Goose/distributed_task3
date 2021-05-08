package osm.model.generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="tag" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="k" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="changeset" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="lon" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "tag"
})
@XmlRootElement(name = "node")
public class Node {

    @XmlElement(required = true)
    protected List<Tag> tag;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "version")
    protected Integer version;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "uid")
    protected Integer uid;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "changeset")
    protected Integer changeset;
    @XmlAttribute(name = "lat")
    protected Double lat;
    @XmlAttribute(name = "lon")
    protected Double lon;

    /**
     * Gets the value of the tag property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tag }
     */
    public List<Tag> getTag() {
        if (tag == null) {
            tag = new ArrayList<Tag>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the timestamp property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the uid property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setUid(Integer value) {
        this.uid = value;
    }

    /**
     * Gets the value of the user property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the changeset property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getChangeset() {
        return changeset;
    }

    /**
     * Sets the value of the changeset property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setChangeset(Integer value) {
        this.changeset = value;
    }

    /**
     * Gets the value of the lat property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setLat(Double value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lon property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setLon(Double value) {
        this.lon = value;
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
     *       &lt;attribute name="k" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Tag {

        @XmlAttribute(name = "k")
        protected String k;
        @XmlAttribute(name = "v")
        protected String v;

        /**
         * Gets the value of the k property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getK() {
            return k;
        }

        /**
         * Sets the value of the k property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setK(String value) {
            this.k = value;
        }

        /**
         * Gets the value of the v property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getV() {
            return v;
        }

        /**
         * Sets the value of the v property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setV(String value) {
            this.v = value;
        }

    }

}