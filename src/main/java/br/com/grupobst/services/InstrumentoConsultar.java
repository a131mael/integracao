/**
 * InstrumentoConsultar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class InstrumentoConsultar  implements java.io.Serializable {
    private java.lang.String dataProtestado;

    private java.lang.String chaveUnica;

    private java.lang.String validador;

    private java.lang.String arquivo;

    private java.lang.String mensagem;

    public InstrumentoConsultar() {
    }

    public InstrumentoConsultar(
           java.lang.String dataProtestado,
           java.lang.String chaveUnica,
           java.lang.String validador,
           java.lang.String arquivo,
           java.lang.String mensagem) {
           this.dataProtestado = dataProtestado;
           this.chaveUnica = chaveUnica;
           this.validador = validador;
           this.arquivo = arquivo;
           this.mensagem = mensagem;
    }


    /**
     * Gets the dataProtestado value for this InstrumentoConsultar.
     * 
     * @return dataProtestado
     */
    public java.lang.String getDataProtestado() {
        return dataProtestado;
    }


    /**
     * Sets the dataProtestado value for this InstrumentoConsultar.
     * 
     * @param dataProtestado
     */
    public void setDataProtestado(java.lang.String dataProtestado) {
        this.dataProtestado = dataProtestado;
    }


    /**
     * Gets the chaveUnica value for this InstrumentoConsultar.
     * 
     * @return chaveUnica
     */
    public java.lang.String getChaveUnica() {
        return chaveUnica;
    }


    /**
     * Sets the chaveUnica value for this InstrumentoConsultar.
     * 
     * @param chaveUnica
     */
    public void setChaveUnica(java.lang.String chaveUnica) {
        this.chaveUnica = chaveUnica;
    }


    /**
     * Gets the validador value for this InstrumentoConsultar.
     * 
     * @return validador
     */
    public java.lang.String getValidador() {
        return validador;
    }


    /**
     * Sets the validador value for this InstrumentoConsultar.
     * 
     * @param validador
     */
    public void setValidador(java.lang.String validador) {
        this.validador = validador;
    }


    /**
     * Gets the arquivo value for this InstrumentoConsultar.
     * 
     * @return arquivo
     */
    public java.lang.String getArquivo() {
        return arquivo;
    }


    /**
     * Sets the arquivo value for this InstrumentoConsultar.
     * 
     * @param arquivo
     */
    public void setArquivo(java.lang.String arquivo) {
        this.arquivo = arquivo;
    }


    /**
     * Gets the mensagem value for this InstrumentoConsultar.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this InstrumentoConsultar.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstrumentoConsultar)) return false;
        InstrumentoConsultar other = (InstrumentoConsultar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataProtestado==null && other.getDataProtestado()==null) || 
             (this.dataProtestado!=null &&
              this.dataProtestado.equals(other.getDataProtestado()))) &&
            ((this.chaveUnica==null && other.getChaveUnica()==null) || 
             (this.chaveUnica!=null &&
              this.chaveUnica.equals(other.getChaveUnica()))) &&
            ((this.validador==null && other.getValidador()==null) || 
             (this.validador!=null &&
              this.validador.equals(other.getValidador()))) &&
            ((this.arquivo==null && other.getArquivo()==null) || 
             (this.arquivo!=null &&
              this.arquivo.equals(other.getArquivo()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem())));
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
        if (getDataProtestado() != null) {
            _hashCode += getDataProtestado().hashCode();
        }
        if (getChaveUnica() != null) {
            _hashCode += getChaveUnica().hashCode();
        }
        if (getValidador() != null) {
            _hashCode += getValidador().hashCode();
        }
        if (getArquivo() != null) {
            _hashCode += getArquivo().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstrumentoConsultar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "instrumento-consultar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProtestado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataProtestado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaveUnica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chaveUnica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arquivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arquivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagem"));
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
