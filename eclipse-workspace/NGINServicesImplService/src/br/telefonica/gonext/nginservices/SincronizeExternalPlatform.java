
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sincronizeExternalPlatform complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sincronizeExternalPlatform">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="SincronizeExternalPlatformIn" type="{http://telefonica.br/GONext/NGINServices}SincronizeExternalPlatformIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sincronizeExternalPlatform", propOrder = {
    "userManagementIn",
    "sincronizeExternalPlatformIn"
})
public class SincronizeExternalPlatform {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "SincronizeExternalPlatformIn")
    protected SincronizeExternalPlatformIn sincronizeExternalPlatformIn;

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
     * Obtém o valor da propriedade sincronizeExternalPlatformIn.
     * 
     * @return
     *     possible object is
     *     {@link SincronizeExternalPlatformIn }
     *     
     */
    public SincronizeExternalPlatformIn getSincronizeExternalPlatformIn() {
        return sincronizeExternalPlatformIn;
    }

    /**
     * Define o valor da propriedade sincronizeExternalPlatformIn.
     * 
     * @param value
     *     allowed object is
     *     {@link SincronizeExternalPlatformIn }
     *     
     */
    public void setSincronizeExternalPlatformIn(SincronizeExternalPlatformIn value) {
        this.sincronizeExternalPlatformIn = value;
    }

}
