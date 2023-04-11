/**
 * CustasConsultar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class CustasConsultar  implements java.io.Serializable {
    private java.lang.Double confirmacao;

    private java.lang.Double retorno;

    private java.lang.Double despesas;

    private java.lang.Double gravacao_eletronica;

    private java.lang.Double distribuicao_confirmacao;

    private java.lang.Double distribuicao_retorno;

    public CustasConsultar() {
    }

    public CustasConsultar(
           java.lang.Double confirmacao,
           java.lang.Double retorno,
           java.lang.Double despesas,
           java.lang.Double gravacao_eletronica,
           java.lang.Double distribuicao_confirmacao,
           java.lang.Double distribuicao_retorno) {
           this.confirmacao = confirmacao;
           this.retorno = retorno;
           this.despesas = despesas;
           this.gravacao_eletronica = gravacao_eletronica;
           this.distribuicao_confirmacao = distribuicao_confirmacao;
           this.distribuicao_retorno = distribuicao_retorno;
    }


    /**
     * Gets the confirmacao value for this CustasConsultar.
     * 
     * @return confirmacao
     */
    public java.lang.Double getConfirmacao() {
        return confirmacao;
    }


    /**
     * Sets the confirmacao value for this CustasConsultar.
     * 
     * @param confirmacao
     */
    public void setConfirmacao(java.lang.Double confirmacao) {
        this.confirmacao = confirmacao;
    }


    /**
     * Gets the retorno value for this CustasConsultar.
     * 
     * @return retorno
     */
    public java.lang.Double getRetorno() {
        return retorno;
    }


    /**
     * Sets the retorno value for this CustasConsultar.
     * 
     * @param retorno
     */
    public void setRetorno(java.lang.Double retorno) {
        this.retorno = retorno;
    }


    /**
     * Gets the despesas value for this CustasConsultar.
     * 
     * @return despesas
     */
    public java.lang.Double getDespesas() {
        return despesas;
    }


    /**
     * Sets the despesas value for this CustasConsultar.
     * 
     * @param despesas
     */
    public void setDespesas(java.lang.Double despesas) {
        this.despesas = despesas;
    }


    /**
     * Gets the gravacao_eletronica value for this CustasConsultar.
     * 
     * @return gravacao_eletronica
     */
    public java.lang.Double getGravacao_eletronica() {
        return gravacao_eletronica;
    }


    /**
     * Sets the gravacao_eletronica value for this CustasConsultar.
     * 
     * @param gravacao_eletronica
     */
    public void setGravacao_eletronica(java.lang.Double gravacao_eletronica) {
        this.gravacao_eletronica = gravacao_eletronica;
    }


    /**
     * Gets the distribuicao_confirmacao value for this CustasConsultar.
     * 
     * @return distribuicao_confirmacao
     */
    public java.lang.Double getDistribuicao_confirmacao() {
        return distribuicao_confirmacao;
    }


    /**
     * Sets the distribuicao_confirmacao value for this CustasConsultar.
     * 
     * @param distribuicao_confirmacao
     */
    public void setDistribuicao_confirmacao(java.lang.Double distribuicao_confirmacao) {
        this.distribuicao_confirmacao = distribuicao_confirmacao;
    }


    /**
     * Gets the distribuicao_retorno value for this CustasConsultar.
     * 
     * @return distribuicao_retorno
     */
    public java.lang.Double getDistribuicao_retorno() {
        return distribuicao_retorno;
    }


    /**
     * Sets the distribuicao_retorno value for this CustasConsultar.
     * 
     * @param distribuicao_retorno
     */
    public void setDistribuicao_retorno(java.lang.Double distribuicao_retorno) {
        this.distribuicao_retorno = distribuicao_retorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustasConsultar)) return false;
        CustasConsultar other = (CustasConsultar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.confirmacao==null && other.getConfirmacao()==null) || 
             (this.confirmacao!=null &&
              this.confirmacao.equals(other.getConfirmacao()))) &&
            ((this.retorno==null && other.getRetorno()==null) || 
             (this.retorno!=null &&
              this.retorno.equals(other.getRetorno()))) &&
            ((this.despesas==null && other.getDespesas()==null) || 
             (this.despesas!=null &&
              this.despesas.equals(other.getDespesas()))) &&
            ((this.gravacao_eletronica==null && other.getGravacao_eletronica()==null) || 
             (this.gravacao_eletronica!=null &&
              this.gravacao_eletronica.equals(other.getGravacao_eletronica()))) &&
            ((this.distribuicao_confirmacao==null && other.getDistribuicao_confirmacao()==null) || 
             (this.distribuicao_confirmacao!=null &&
              this.distribuicao_confirmacao.equals(other.getDistribuicao_confirmacao()))) &&
            ((this.distribuicao_retorno==null && other.getDistribuicao_retorno()==null) || 
             (this.distribuicao_retorno!=null &&
              this.distribuicao_retorno.equals(other.getDistribuicao_retorno())));
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
        if (getConfirmacao() != null) {
            _hashCode += getConfirmacao().hashCode();
        }
        if (getRetorno() != null) {
            _hashCode += getRetorno().hashCode();
        }
        if (getDespesas() != null) {
            _hashCode += getDespesas().hashCode();
        }
        if (getGravacao_eletronica() != null) {
            _hashCode += getGravacao_eletronica().hashCode();
        }
        if (getDistribuicao_confirmacao() != null) {
            _hashCode += getDistribuicao_confirmacao().hashCode();
        }
        if (getDistribuicao_retorno() != null) {
            _hashCode += getDistribuicao_retorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustasConsultar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "custas-consultar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("despesas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "despesas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gravacao_eletronica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gravacao_eletronica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distribuicao_confirmacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distribuicao_confirmacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distribuicao_retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distribuicao_retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
