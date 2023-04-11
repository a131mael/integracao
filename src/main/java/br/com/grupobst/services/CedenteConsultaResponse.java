/**
 * CedenteConsultaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class CedenteConsultaResponse  implements java.io.Serializable {
    private int total;

    private br.com.grupobst.services.CedenteResponse[] cedente;

    private br.com.grupobst.services.StatusResponse resposta;

    public CedenteConsultaResponse() {
    }

    public CedenteConsultaResponse(
           int total,
           br.com.grupobst.services.CedenteResponse[] cedente,
           br.com.grupobst.services.StatusResponse resposta) {
           this.total = total;
           this.cedente = cedente;
           this.resposta = resposta;
    }


    /**
     * Gets the total value for this CedenteConsultaResponse.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this CedenteConsultaResponse.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the cedente value for this CedenteConsultaResponse.
     * 
     * @return cedente
     */
    public br.com.grupobst.services.CedenteResponse[] getCedente() {
        return cedente;
    }


    /**
     * Sets the cedente value for this CedenteConsultaResponse.
     * 
     * @param cedente
     */
    public void setCedente(br.com.grupobst.services.CedenteResponse[] cedente) {
        this.cedente = cedente;
    }

    public br.com.grupobst.services.CedenteResponse getCedente(int i) {
        return this.cedente[i];
    }

    public void setCedente(int i, br.com.grupobst.services.CedenteResponse _value) {
        this.cedente[i] = _value;
    }


    /**
     * Gets the resposta value for this CedenteConsultaResponse.
     * 
     * @return resposta
     */
    public br.com.grupobst.services.StatusResponse getResposta() {
        return resposta;
    }


    /**
     * Sets the resposta value for this CedenteConsultaResponse.
     * 
     * @param resposta
     */
    public void setResposta(br.com.grupobst.services.StatusResponse resposta) {
        this.resposta = resposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CedenteConsultaResponse)) return false;
        CedenteConsultaResponse other = (CedenteConsultaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.total == other.getTotal() &&
            ((this.cedente==null && other.getCedente()==null) || 
             (this.cedente!=null &&
              java.util.Arrays.equals(this.cedente, other.getCedente()))) &&
            ((this.resposta==null && other.getResposta()==null) || 
             (this.resposta!=null &&
              this.resposta.equals(other.getResposta())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getTotal();
        if (getCedente() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCedente());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCedente(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResposta() != null) {
            _hashCode += getResposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CedenteConsultaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-consulta-response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "statusResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
