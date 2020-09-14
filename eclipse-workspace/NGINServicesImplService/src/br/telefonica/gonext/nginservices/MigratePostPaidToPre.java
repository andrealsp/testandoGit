
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de migratePostPaidToPre complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="migratePostPaidToPre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="MigratePostPaidToPreIn" type="{http://telefonica.br/GONext/NGINServices}MigratePostPaidToPreIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migratePostPaidToPre", propOrder = {
    "userManagementIn",
    "migratePostPaidToPreIn"
})
public class MigratePostPaidToPre {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "MigratePostPaidToPreIn")
    protected MigratePostPaidToPreIn migratePostPaidToPreIn;

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
     * Obtém o valor da propriedade migratePostPaidToPreIn.
     * 
     * @return
     *     possible object is
     *     {@link MigratePostPaidToPreIn }
     *     
     */
    public MigratePostPaidToPreIn getMigratePostPaidToPreIn() {
        return migratePostPaidToPreIn;
    }

    /**
     * Define o valor da propriedade migratePostPaidToPreIn.
     * 
     * @param value
     *     allowed object is
     *     {@link MigratePostPaidToPreIn }
     *     
     */
    public void setMigratePostPaidToPreIn(MigratePostPaidToPreIn value) {
        this.migratePostPaidToPreIn = value;
    }

}
