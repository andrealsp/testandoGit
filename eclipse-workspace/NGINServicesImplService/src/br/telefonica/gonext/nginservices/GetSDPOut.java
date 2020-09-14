
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GetSDPOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetSDPOut">
 *   &lt;complexContent>
 *     &lt;extension base="{http://telefonica.br/GONext/NGINServices}abstractOutputClass">
 *       &lt;sequence>
 *         &lt;element name="sdp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSDPOut", propOrder = {
    "sdp"
})
public class GetSDPOut
    extends AbstractOutputClass
{

    protected String sdp;

    /**
     * Obtém o valor da propriedade sdp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdp() {
        return sdp;
    }

    /**
     * Define o valor da propriedade sdp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdp(String value) {
        this.sdp = value;
    }

}
