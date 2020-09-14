
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveHistoryMsisdnIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveHistoryMsisdnIn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://telefonica.br/GONext/NGINServices}AbstracNgintInputClass">
 *       &lt;sequence>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveHistoryMsisdnIn", propOrder = {
    "imsi"
})
public class RetrieveHistoryMsisdnIn
    extends AbstracNgintInputClass
{

    @XmlElement(required = true)
    protected String imsi;

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

}
