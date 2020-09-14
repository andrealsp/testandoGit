
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de retrieveProfile complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="retrieveProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="RetrieveProfileIn" type="{http://telefonica.br/GONext/NGINServices}RetrieveProfileIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveProfile", propOrder = {
    "userManagementIn",
    "retrieveProfileIn"
})
public class RetrieveProfile {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "RetrieveProfileIn")
    protected RetrieveProfileIn retrieveProfileIn;

    /**
     * Obtém o valor da propriedade userManagementIn.
     * 
     * @return
     *     possible object is
     *     {@link UserManagementIn }
     *     
     */
    public UserManagementIn getUserManagementIn() {
        return userManagementIn;
    }

    /**
     * Define o valor da propriedade userManagementIn.
     * 
     * @param value
     *     allowed object is
     *     {@link UserManagementIn }
     *     
     */
    public void setUserManagementIn(UserManagementIn value) {
        this.userManagementIn = value;
    }

    /**
     * Obtém o valor da propriedade retrieveProfileIn.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveProfileIn }
     *     
     */
    public RetrieveProfileIn getRetrieveProfileIn() {
        return retrieveProfileIn;
    }

    /**
     * Define o valor da propriedade retrieveProfileIn.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveProfileIn }
     *     
     */
    public void setRetrieveProfileIn(RetrieveProfileIn value) {
        this.retrieveProfileIn = value;
    }

}
