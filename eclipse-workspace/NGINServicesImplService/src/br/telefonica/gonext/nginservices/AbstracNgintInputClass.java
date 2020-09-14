
package br.telefonica.gonext.nginservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AbstracNgintInputClass complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AbstracNgintInputClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstracNgintInputClass", propOrder = {
    "msisdn"
})
@XmlSeeAlso({
    GetSDPIn.class,
    CleanSDPIn.class,
    MigratePostPaidToPreIn.class,
    RetrieveProfileIn.class,
    SincronizeCareCoreNginIn.class,
    CleanNginIn.class,
    SincronizeExternalPlatformIn.class,
    RetrieveHistoryMsisdnIn.class,
    CleanExternalPlatformIn.class
})
public abstract class AbstracNgintInputClass {

    @XmlElement(required = true)
    protected String msisdn;

    /**
     * Obtém o valor da propriedade msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Define o valor da propriedade msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

}
