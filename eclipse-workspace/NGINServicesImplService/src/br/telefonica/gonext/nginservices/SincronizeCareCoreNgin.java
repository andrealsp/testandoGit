
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sincronizeCareCoreNgin complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sincronizeCareCoreNgin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="SincronizeCareCoreNginIn" type="{http://telefonica.br/GONext/NGINServices}SincronizeCareCoreNginIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sincronizeCareCoreNgin", propOrder = {
    "userManagementIn",
    "sincronizeCareCoreNginIn"
})
public class SincronizeCareCoreNgin {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "SincronizeCareCoreNginIn")
    protected SincronizeCareCoreNginIn sincronizeCareCoreNginIn;

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
     * Obtém o valor da propriedade sincronizeCareCoreNginIn.
     * 
     * @return
     *     possible object is
     *     {@link SincronizeCareCoreNginIn }
     *     
     */
    public SincronizeCareCoreNginIn getSincronizeCareCoreNginIn() {
        return sincronizeCareCoreNginIn;
    }

    /**
     * Define o valor da propriedade sincronizeCareCoreNginIn.
     * 
     * @param value
     *     allowed object is
     *     {@link SincronizeCareCoreNginIn }
     *     
     */
    public void setSincronizeCareCoreNginIn(SincronizeCareCoreNginIn value) {
        this.sincronizeCareCoreNginIn = value;
    }

}
