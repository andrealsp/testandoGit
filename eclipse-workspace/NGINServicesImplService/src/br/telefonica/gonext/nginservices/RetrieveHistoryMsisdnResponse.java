
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de retrieveHistoryMsisdnResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="retrieveHistoryMsisdnResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://telefonica.br/GONext/NGINServices}RetrieveHistoryMsisdnOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveHistoryMsisdnResponse", propOrder = {
    "_return"
})
public class RetrieveHistoryMsisdnResponse {

    @XmlElement(name = "return")
    protected RetrieveHistoryMsisdnOut _return;

    /**
     * Obt�m o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveHistoryMsisdnOut }
     *     
     */
    public RetrieveHistoryMsisdnOut getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveHistoryMsisdnOut }
     *     
     */
    public void setReturn(RetrieveHistoryMsisdnOut value) {
        this._return = value;
    }

}
