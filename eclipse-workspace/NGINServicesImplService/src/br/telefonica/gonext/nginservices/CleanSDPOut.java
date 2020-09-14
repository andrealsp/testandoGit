
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CleanSDPOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CleanSDPOut">
 *   &lt;complexContent>
 *     &lt;extension base="{http://telefonica.br/GONext/NGINServices}abstractOutputClass">
 *       &lt;sequence>
 *         &lt;element name="scriptData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleanSDPOut", propOrder = {
    "scriptData"
})
public class CleanSDPOut
    extends AbstractOutputClass
{

    protected String scriptData;

    /**
     * Obtém o valor da propriedade scriptData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptData() {
        return scriptData;
    }

    /**
     * Define o valor da propriedade scriptData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptData(String value) {
        this.scriptData = value;
    }

}
