
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sincronizeExternalPlatformResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sincronizeExternalPlatformResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://telefonica.br/GONext/NGINServices}SincronizeExternalPlatformOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sincronizeExternalPlatformResponse", propOrder = {
    "_return"
})
public class SincronizeExternalPlatformResponse {

    @XmlElement(name = "return")
    protected SincronizeExternalPlatformOut _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link SincronizeExternalPlatformOut }
     *     
     */
    public SincronizeExternalPlatformOut getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link SincronizeExternalPlatformOut }
     *     
     */
    public void setReturn(SincronizeExternalPlatformOut value) {
        this._return = value;
    }

}
