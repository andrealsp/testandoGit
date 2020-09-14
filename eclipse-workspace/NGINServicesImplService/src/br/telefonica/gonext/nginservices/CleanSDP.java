
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cleanSDP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cleanSDP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="CleanSDPIn" type="{http://telefonica.br/GONext/NGINServices}CleanSDPIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cleanSDP", propOrder = {
    "userManagementIn",
    "cleanSDPIn"
})
public class CleanSDP {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "CleanSDPIn")
    protected CleanSDPIn cleanSDPIn;

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
     * Obtém o valor da propriedade cleanSDPIn.
     * 
     * @return
     *     possible object is
     *     {@link CleanSDPIn }
     *     
     */
    public CleanSDPIn getCleanSDPIn() {
        return cleanSDPIn;
    }

    /**
     * Define o valor da propriedade cleanSDPIn.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanSDPIn }
     *     
     */
    public void setCleanSDPIn(CleanSDPIn value) {
        this.cleanSDPIn = value;
    }

}
