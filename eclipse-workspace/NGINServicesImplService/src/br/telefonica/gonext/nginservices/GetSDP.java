
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getSDP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getSDP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="GetSDPIn" type="{http://telefonica.br/GONext/NGINServices}GetSDPIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSDP", propOrder = {
    "userManagementIn",
    "getSDPIn"
})
public class GetSDP {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "GetSDPIn")
    protected GetSDPIn getSDPIn;

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
     * Obtém o valor da propriedade getSDPIn.
     * 
     * @return
     *     possible object is
     *     {@link GetSDPIn }
     *     
     */
    public GetSDPIn getGetSDPIn() {
        return getSDPIn;
    }

    /**
     * Define o valor da propriedade getSDPIn.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSDPIn }
     *     
     */
    public void setGetSDPIn(GetSDPIn value) {
        this.getSDPIn = value;
    }

}
