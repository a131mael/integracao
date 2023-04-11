/**
 * ConsultarArquivoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class ConsultarArquivoResponse  implements java.io.Serializable {
    private java.lang.String codigoApresentante;

    private br.com.grupobst.services.TipoArquivo tipoArquivo;

    private java.lang.String dataArquivo;

    private java.lang.String nomeArquivo;

    private java.lang.Boolean baixado;

    private java.lang.String arquivo;

    private br.com.grupobst.services.StatusResponse resposta;

    public ConsultarArquivoResponse() {
    }

    public ConsultarArquivoResponse(
           java.lang.String codigoApresentante,
           br.com.grupobst.services.TipoArquivo tipoArquivo,
           java.lang.String dataArquivo,
           java.lang.String nomeArquivo,
           java.lang.Boolean baixado,
           java.lang.String arquivo,
           br.com.grupobst.services.StatusResponse resposta) {
           this.codigoApresentante = codigoApresentante;
           this.tipoArquivo = tipoArquivo;
           this.dataArquivo = dataArquivo;
           this.nomeArquivo = nomeArquivo;
           this.baixado = baixado;
           this.arquivo = arquivo;
           this.resposta = resposta;
    }


    /**
     * Gets the codigoApresentante value for this ConsultarArquivoResponse.
     * 
     * @return codigoApresentante
     */
    public java.lang.String getCodigoApresentante() {
        return codigoApresentante;
    }


    /**
     * Sets the codigoApresentante value for this ConsultarArquivoResponse.
     * 
     * @param codigoApresentante
     */
    public void setCodigoApresentante(java.lang.String codigoApresentante) {
        this.codigoApresentante = codigoApresentante;
    }


    /**
     * Gets the tipoArquivo value for this ConsultarArquivoResponse.
     * 
     * @return tipoArquivo
     */
    public br.com.grupobst.services.TipoArquivo getTipoArquivo() {
        return tipoArquivo;
    }


    /**
     * Sets the tipoArquivo value for this ConsultarArquivoResponse.
     * 
     * @param tipoArquivo
     */
    public void setTipoArquivo(br.com.grupobst.services.TipoArquivo tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }


    /**
     * Gets the dataArquivo value for this ConsultarArquivoResponse.
     * 
     * @return dataArquivo
     */
    public java.lang.String getDataArquivo() {
        return dataArquivo;
    }


    /**
     * Sets the dataArquivo value for this ConsultarArquivoResponse.
     * 
     * @param dataArquivo
     */
    public void setDataArquivo(java.lang.String dataArquivo) {
        this.dataArquivo = dataArquivo;
    }


    /**
     * Gets the nomeArquivo value for this ConsultarArquivoResponse.
     * 
     * @return nomeArquivo
     */
    public java.lang.String getNomeArquivo() {
        return nomeArquivo;
    }


    /**
     * Sets the nomeArquivo value for this ConsultarArquivoResponse.
     * 
     * @param nomeArquivo
     */
    public void setNomeArquivo(java.lang.String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }


    /**
     * Gets the baixado value for this ConsultarArquivoResponse.
     * 
     * @return baixado
     */
    public java.lang.Boolean getBaixado() {
        return baixado;
    }


    /**
     * Sets the baixado value for this ConsultarArquivoResponse.
     * 
     * @param baixado
     */
    public void setBaixado(java.lang.Boolean baixado) {
        this.baixado = baixado;
    }


    /**
     * Gets the arquivo value for this ConsultarArquivoResponse.
     * 
     * @return arquivo
     */
    public java.lang.String getArquivo() {
        return arquivo;
    }


    /**
     * Sets the arquivo value for this ConsultarArquivoResponse.
     * 
     * @param arquivo
     */
    public void setArquivo(java.lang.String arquivo) {
        this.arquivo = arquivo;
    }


    /**
     * Gets the resposta value for this ConsultarArquivoResponse.
     * 
     * @return resposta
     */
    public br.com.grupobst.services.StatusResponse getResposta() {
        return resposta;
    }


    /**
     * Sets the resposta value for this ConsultarArquivoResponse.
     * 
     * @param resposta
     */
    public void setResposta(br.com.grupobst.services.StatusResponse resposta) {
        this.resposta = resposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarArquivoResponse)) return false;
        ConsultarArquivoResponse other = (ConsultarArquivoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoApresentante==null && other.getCodigoApresentante()==null) || 
             (this.codigoApresentante!=null &&
              this.codigoApresentante.equals(other.getCodigoApresentante()))) &&
            ((this.tipoArquivo==null && other.getTipoArquivo()==null) || 
             (this.tipoArquivo!=null &&
              this.tipoArquivo.equals(other.getTipoArquivo()))) &&
            ((this.dataArquivo==null && other.getDataArquivo()==null) || 
             (this.dataArquivo!=null &&
              this.dataArquivo.equals(other.getDataArquivo()))) &&
            ((this.nomeArquivo==null && other.getNomeArquivo()==null) || 
             (this.nomeArquivo!=null &&
              this.nomeArquivo.equals(other.getNomeArquivo()))) &&
            ((this.baixado==null && other.getBaixado()==null) || 
             (this.baixado!=null &&
              this.baixado.equals(other.getBaixado()))) &&
            ((this.arquivo==null && other.getArquivo()==null) || 
             (this.arquivo!=null &&
              this.arquivo.equals(other.getArquivo()))) &&
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
        if (getCodigoApresentante() != null) {
            _hashCode += getCodigoApresentante().hashCode();
        }
        if (getTipoArquivo() != null) {
            _hashCode += getTipoArquivo().hashCode();
        }
        if (getDataArquivo() != null) {
            _hashCode += getDataArquivo().hashCode();
        }
        if (getNomeArquivo() != null) {
            _hashCode += getNomeArquivo().hashCode();
        }
        if (getBaixado() != null) {
            _hashCode += getBaixado().hashCode();
        }
        if (getArquivo() != null) {
            _hashCode += getArquivo().hashCode();
        }
        if (getResposta() != null) {
            _hashCode += getResposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarArquivoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarArquivoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoApresentante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoApresentante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoArquivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoArquivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "tipoArquivo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataArquivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataArquivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeArquivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeArquivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baixado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baixado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
