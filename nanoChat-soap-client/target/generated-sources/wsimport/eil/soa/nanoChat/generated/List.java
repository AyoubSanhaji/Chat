
package eil.soa.nanoChat.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour list complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "list", propOrder = {
    "fromRevisionNumber"
})
public class List {

    protected int fromRevisionNumber;

    /**
     * Obtient la valeur de la propriété fromRevisionNumber.
     * 
     */
    public int getFromRevisionNumber() {
        return fromRevisionNumber;
    }

    /**
     * Définit la valeur de la propriété fromRevisionNumber.
     * 
     */
    public void setFromRevisionNumber(int value) {
        this.fromRevisionNumber = value;
    }

}
