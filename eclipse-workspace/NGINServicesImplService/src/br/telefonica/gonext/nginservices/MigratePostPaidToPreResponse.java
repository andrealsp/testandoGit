
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de migratePostPaidToPreResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="migratePostPaidToPreResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://telefonica.br/GONext/NGINServices}MigratePostPaidToPreOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migratePostPaidToPreResponse", propOrder = {
    "_return"
})
public class MigratePostPaidToPreResponse {

    @XmlElement(name = "return")
    protected MigratePostPaidToPreOut _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link MigratePostPaidToPreOut }
     *     
     */
    public MigratePostPaidToPreOut getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link MigratePostPaidToPreOut }
     *     
     */
    public void setReturn(MigratePostPaidToPreOut value) {
        this._return = value;
    }

}
