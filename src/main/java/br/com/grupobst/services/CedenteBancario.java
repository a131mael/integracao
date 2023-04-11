/**
 * CedenteBancario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class CedenteBancario  implements java.io.Serializable {
    private java.lang.String banco;

    private java.lang.String agencia;

    private java.lang.String conta;

    private java.lang.String operacao;

    public CedenteBancario() {
    }

    public CedenteBancario(
           java.lang.String banco,
           java.lang.String agencia,
           java.lang.String conta,
           java.lang.String operacao) {
           this.banco = banco;
           this.agencia = agencia;
           this.conta = conta;
           this.operacao = operacao;
    }


    /**
     * Gets the banco value for this CedenteBancario.
     * 
     * @return banco
     */
    public java.lang.String getBanco() {
        return banco;
    }


    /**
     * Sets the banco value for this CedenteBancario.
     * 
     * @param banco
     */
    public void setBanco(java.lang.String banco) {
        this.banco = banco;
    }


    /**
     * Gets the agencia value for this CedenteBancario.
     * 
     * @return agencia
     */
    public java.lang.String getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this CedenteBancario.
     * 
     * @param agencia
     */
    public void setAgencia(java.lang.String agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the conta value for this CedenteBancario.
     * 
     * @return conta
     */
    public java.lang.String getConta() {
        return conta;
    }


    /**
     * Sets the conta value for this CedenteBancario.
     * 
     * @param conta
     */
    public void setConta(java.lang.String conta) {
        this.conta = conta;
    }


    /**
     * Gets the operacao value for this CedenteBancario.
     * 
     * @return operacao
     */
    public java.lang.String getOperacao() {
        return operacao;
    }


    /**
     * Sets the operacao value for this CedenteBancario.
     * 
     * @param operacao
     */
    public void setOperacao(java.lang.String operacao) {
        this.operacao = operacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CedenteBancario)) return false;
        CedenteBancario other = (CedenteBancario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.banco==null && other.getBanco()==null) || 
             (this.banco!=null &&
              this.banco.equals(other.getBanco()))) &&
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.conta==null && other.getConta()==null) || 
             (this.conta!=null &&
              this.conta.equals(other.getConta()))) &&
            ((this.operacao==null && other.getOperacao()==null) || 
             (this.operacao!=null &&
              this.operacao.equals(other.getOperacao())));
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
        if (getBanco() != null) {
            _hashCode += getBanco().hashCode();
        }
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getConta() != null) {
            _hashCode += getConta().hashCode();
        }
        if (getOperacao() != null) {
            _hashCode += getOperacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CedenteBancario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cedente-bancario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "banco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
