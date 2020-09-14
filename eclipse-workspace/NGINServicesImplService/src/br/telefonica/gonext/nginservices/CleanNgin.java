
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cleanNgin complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cleanNgin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="CleanNginIn" type="{http://telefonica.br/GONext/NGINServices}CleanNginIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cleanNgin", propOrder = {
    "userManagementIn",
    "cleanNginIn"
})
public class CleanNgin {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "CleanNginIn")
    protected CleanNginIn cleanNginIn;

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
     * Obtém o valor da propriedade cleanNginIn.
     * 
     * @return
     *     possible object is
     *     {@link CleanNginIn }
     *     
     */
    public CleanNginIn getCleanNginIn() {
        return cleanNginIn;
    }

    /**
     * Define o valor da propriedade cleanNginIn.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanNginIn }
     *     
     */
    public void setCleanNginIn(CleanNginIn value) {
        this.cleanNginIn = value;
    }

}
