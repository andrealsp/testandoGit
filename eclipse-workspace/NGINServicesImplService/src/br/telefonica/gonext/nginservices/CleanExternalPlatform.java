
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cleanExternalPlatform complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cleanExternalPlatform">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="CleanExternalPlatformIn" type="{http://telefonica.br/GONext/NGINServices}CleanExternalPlatformIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cleanExternalPlatform", propOrder = {
    "userManagementIn",
    "cleanExternalPlatformIn"
})
public class CleanExternalPlatform {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "CleanExternalPlatformIn")
    protected CleanExternalPlatformIn cleanExternalPlatformIn;

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
     * Obtém o valor da propriedade cleanExternalPlatformIn.
     * 
     * @return
     *     possible object is
     *     {@link CleanExternalPlatformIn }
     *     
     */
    public CleanExternalPlatformIn getCleanExternalPlatformIn() {
        return cleanExternalPlatformIn;
    }

    /**
     * Define o valor da propriedade cleanExternalPlatformIn.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanExternalPlatformIn }
     *     
     */
    public void setCleanExternalPlatformIn(CleanExternalPlatformIn value) {
        this.cleanExternalPlatformIn = value;
    }

}
