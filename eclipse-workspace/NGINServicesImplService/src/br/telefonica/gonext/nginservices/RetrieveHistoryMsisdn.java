
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de retrieveHistoryMsisdn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="retrieveHistoryMsisdn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userManagementIn" type="{http://telefonica.br/GONext/NGINServices}UserManagementIn" minOccurs="0"/>
 *         &lt;element name="RetrieveHistoryMsisdnIn" type="{http://telefonica.br/GONext/NGINServices}RetrieveHistoryMsisdnIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveHistoryMsisdn", propOrder = {
    "userManagementIn",
    "retrieveHistoryMsisdnIn"
})
public class RetrieveHistoryMsisdn {

    protected UserManagementIn userManagementIn;
    @XmlElement(name = "RetrieveHistoryMsisdnIn")
    protected RetrieveHistoryMsisdnIn retrieveHistoryMsisdnIn;

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
     * Obtém o valor da propriedade retrieveHistoryMsisdnIn.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveHistoryMsisdnIn }
     *     
     */
    public RetrieveHistoryMsisdnIn getRetrieveHistoryMsisdnIn() {
        return retrieveHistoryMsisdnIn;
    }

    /**
     * Define o valor da propriedade retrieveHistoryMsisdnIn.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveHistoryMsisdnIn }
     *     
     */
    public void setRetrieveHistoryMsisdnIn(RetrieveHistoryMsisdnIn value) {
        this.retrieveHistoryMsisdnIn = value;
    }

}
