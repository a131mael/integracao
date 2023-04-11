/**
 * EnviarTituloResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class EnviarTituloResponse  implements java.io.Serializable {
    private br.com.grupobst.services.DevedorEnviar devedor;

    private br.com.grupobst.services.DividaEnviar divida;

    private br.com.grupobst.services.StatusResponse resposta;

    public EnviarTituloResponse() {
    }

    public EnviarTituloResponse(
           br.com.grupobst.services.DevedorEnviar devedor,
           br.com.grupobst.services.DividaEnviar divida,
           br.com.grupobst.services.StatusResponse resposta) {
           this.devedor = devedor;
           this.divida = divida;
           this.resposta = resposta;
    }


    /**
     * Gets the devedor value for this EnviarTituloResponse.
     * 
     * @return devedor
     */
    public br.com.grupobst.services.DevedorEnviar getDevedor() {
        return devedor;
    }


    /**
     * Sets the devedor value for this EnviarTituloResponse.
     * 
     * @param devedor
     */
    public void setDevedor(br.com.grupobst.services.DevedorEnviar devedor) {
        this.devedor = devedor;
    }


    /**
     * Gets the divida value for this EnviarTituloResponse.
     * 
     * @return divida
     */
    public br.com.grupobst.services.DividaEnviar getDivida() {
        return divida;
    }


    /**
     * Sets the divida value for this EnviarTituloResponse.
     * 
     * @param divida
     */
    public void setDivida(br.com.grupobst.services.DividaEnviar divida) {
        this.divida = divida;
    }


    /**
     * Gets the resposta value for this EnviarTituloResponse.
     * 
     * @return resposta
     */
    public br.com.grupobst.services.StatusResponse getResposta() {
        return resposta;
    }


    /**
     * Sets the resposta value for this EnviarTituloResponse.
     * 
     * @param resposta
     */
    public void setResposta(br.com.grupobst.services.StatusResponse resposta) {
        this.resposta = resposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviarTituloResponse)) return false;
        EnviarTituloResponse other = (EnviarTituloResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.devedor==null && other.getDevedor()==null) || 
             (this.devedor!=null &&
              this.devedor.equals(other.getDevedor()))) &&
            ((this.divida==null && other.getDivida()==null) || 
             (this.divida!=null &&
              this.divida.equals(other.getDivida()))) &&
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
        if (getDevedor() != null) {
            _hashCode += getDevedor().hashCode();
        }
        if (getDivida() != null) {
            _hashCode += getDivida().hashCode();
        }
        if (getResposta() != null) {
            _hashCode += getResposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnviarTituloResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "enviarTituloResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-enviar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-enviar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
