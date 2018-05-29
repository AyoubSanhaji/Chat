
package eil.soa.nanoChat.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour messagesResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="messagesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instant" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messagesResponse", propOrder = {
    "author",
    "clientUuid",
    "instant",
    "text"
})
public class MessagesResponse {

    protected String author;
    protected String clientUuid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar instant;
    protected String text;

    /**
     * Obtient la valeur de la propri�t� author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * D�finit la valeur de la propri�t� author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Obtient la valeur de la propri�t� clientUuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUuid() {
        return clientUuid;
    }

    /**
     * D�finit la valeur de la propri�t� clientUuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUuid(String value) {
        this.clientUuid = value;
    }

    /**
     * Obtient la valeur de la propri�t� instant.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstant() {
        return instant;
    }

    /**
     * D�finit la valeur de la propri�t� instant.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstant(XMLGregorianCalendar value) {
        this.instant = value;
    }

    /**
     * Obtient la valeur de la propri�t� text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * D�finit la valeur de la propri�t� text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
