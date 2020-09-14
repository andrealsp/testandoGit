
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de items complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="items">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanciaDba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msisDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slrStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tipoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "items", propOrder = {
    "accountId",
    "imsi",
    "instanciaDba",
    "msisDn",
    "slrStatus",
    "slrStatusDate",
    "tipoCliente"
})
public class Items {

    protected String accountId;
    protected String imsi;
    protected String instanciaDba;
    protected String msisDn;
    protected String slrStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar slrStatusDate;
    protected String tipoCliente;

    /**
     * Obtém o valor da propriedade accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Define o valor da propriedade accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Obtém o valor da propriedade imsi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Define o valor da propriedade imsi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Obtém o valor da propriedade instanciaDba.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanciaDba() {
        return instanciaDba;
    }

    /**
     * Define o valor da propriedade instanciaDba.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanciaDba(String value) {
        this.instanciaDba = value;
    }

    /**
     * Obtém o valor da propriedade msisDn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisDn() {
        return msisDn;
    }

    /**
     * Define o valor da propriedade msisDn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisDn(String value) {
        this.msisDn = value;
    }

    /**
     * Obtém o valor da propriedade slrStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlrStatus() {
        return slrStatus;
    }

    /**
     * Define o valor da propriedade slrStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlrStatus(String value) {
        this.slrStatus = value;
    }

    /**
     * Obtém o valor da propriedade slrStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSlrStatusDate() {
        return slrStatusDate;
    }

    /**
     * Define o valor da propriedade slrStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSlrStatusDate(XMLGregorianCalendar value) {
        this.slrStatusDate = value;
    }

    /**
     * Obtém o valor da propriedade tipoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Define o valor da propriedade tipoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCliente(String value) {
        this.tipoCliente = value;
    }

}
