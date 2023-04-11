/**
 * OperacaoTituloResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class OperacaoTituloResponse  implements java.io.Serializable {
    private br.com.grupobst.services.DevedorOperacao devedor;

    private br.com.grupobst.services.DividaOperacao divida;

    private br.com.grupobst.services.StatusOperacao status;

    private br.com.grupobst.services.StatusResponse resposta;

    public OperacaoTituloResponse() {
    }

    public OperacaoTituloResponse(
           br.com.grupobst.services.DevedorOperacao devedor,
           br.com.grupobst.services.DividaOperacao divida,
           br.com.grupobst.services.StatusOperacao status,
           br.com.grupobst.services.StatusResponse resposta) {
           this.devedor = devedor;
           this.divida = divida;
           this.status = status;
           this.resposta = resposta;
    }


    /**
     * Gets the devedor value for this OperacaoTituloResponse.
     * 
     * @return devedor
     */
    public br.com.grupobst.services.DevedorOperacao getDevedor() {
        return devedor;
    }


    /**
     * Sets the devedor value for this OperacaoTituloResponse.
     * 
     * @param devedor
     */
    public void setDevedor(br.com.grupobst.services.DevedorOperacao devedor) {
        this.devedor = devedor;
    }


    /**
     * Gets the divida value for this OperacaoTituloResponse.
     * 
     * @return divida
     */
    public br.com.grupobst.services.DividaOperacao getDivida() {
        return divida;
    }


    /**
     * Sets the divida value for this OperacaoTituloResponse.
     * 
     * @param divida
     */
    public void setDivida(br.com.grupobst.services.DividaOperacao divida) {
        this.divida = divida;
    }


    /**
     * Gets the status value for this OperacaoTituloResponse.
     * 
     * @return status
     */
    public br.com.grupobst.services.StatusOperacao getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OperacaoTituloResponse.
     * 
     * @param status
     */
    public void setStatus(br.com.grupobst.services.StatusOperacao status) {
        this.status = status;
    }


    /**
     * Gets the resposta value for this OperacaoTituloResponse.
     * 
     * @return resposta
     */
    public br.com.grupobst.services.StatusResponse getResposta() {
        return resposta;
    }


    /**
     * Sets the resposta value for this OperacaoTituloResponse.
     * 
     * @param resposta
     */
    public void setResposta(br.com.grupobst.services.StatusResponse resposta) {
        this.resposta = resposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperacaoTituloResponse)) return false;
        OperacaoTituloResponse other = (OperacaoTituloResponse) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getResposta() != null) {
            _hashCode += getResposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperacaoTituloResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "operacaoTituloResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-operacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-operacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "status-operacao"));
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
