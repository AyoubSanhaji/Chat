
package eil.soa.nanoChat.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listMessagesResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="listMessagesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{http://server.nanoChat.soa.eil/}messagesResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="revisionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listMessagesResponse", propOrder = {
    "messages",
    "revisionNumber"
})
public class ListMessagesResponse {

    @XmlElement(nillable = true)
    protected List<MessagesResponse> messages;
    protected int revisionNumber;

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessagesResponse }
     * 
     * 
     */
    public List<MessagesResponse> getMessages() {
        if (messages == null) {
            messages = new ArrayList<MessagesResponse>();
        }
        return this.messages;
    }

    /**
     * Obtient la valeur de la propriété revisionNumber.
     * 
     */
    public int getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Définit la valeur de la propriété revisionNumber.
     * 
     */
    public void setRevisionNumber(int value) {
        this.revisionNumber = value;
    }

}
