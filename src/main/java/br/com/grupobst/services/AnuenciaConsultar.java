/**
 * AnuenciaConsultar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class AnuenciaConsultar  implements java.io.Serializable {
    private java.lang.String operacao;

    private java.lang.String quemPagaCustas;

    private java.lang.String dataSolicitado;

    private java.lang.String statusSolicitacao;

    private java.lang.String mensagemSolicitacao;

    private java.lang.String dataStatusCartorio;

    private java.lang.String statusCartorio;

    private java.lang.String mensagemCartorio;

    private java.lang.String arquivo;

    public AnuenciaConsultar() {
    }

    public AnuenciaConsultar(
           java.lang.String operacao,
           java.lang.String quemPagaCustas,
           java.lang.String dataSolicitado,
           java.lang.String statusSolicitacao,
           java.lang.String mensagemSolicitacao,
           java.lang.String dataStatusCartorio,
           java.lang.String statusCartorio,
           java.lang.String mensagemCartorio,
           java.lang.String arquivo) {
           this.operacao = operacao;
           this.quemPagaCustas = quemPagaCustas;
           this.dataSolicitado = dataSolicitado;
           this.statusSolicitacao = statusSolicitacao;
           this.mensagemSolicitacao = mensagemSolicitacao;
           this.dataStatusCartorio = dataStatusCartorio;
           this.statusCartorio = statusCartorio;
           this.mensagemCartorio = mensagemCartorio;
           this.arquivo = arquivo;
    }


    /**
     * Gets the operacao value for this AnuenciaConsultar.
     * 
     * @return operacao
     */
    public java.lang.String getOperacao() {
        return operacao;
    }


    /**
     * Sets the operacao value for this AnuenciaConsultar.
     * 
     * @param operacao
     */
    public void setOperacao(java.lang.String operacao) {
        this.operacao = operacao;
    }


    /**
     * Gets the quemPagaCustas value for this AnuenciaConsultar.
     * 
     * @return quemPagaCustas
     */
    public java.lang.String getQuemPagaCustas() {
        return quemPagaCustas;
    }


    /**
     * Sets the quemPagaCustas value for this AnuenciaConsultar.
     * 
     * @param quemPagaCustas
     */
    public void setQuemPagaCustas(java.lang.String quemPagaCustas) {
        this.quemPagaCustas = quemPagaCustas;
    }


    /**
     * Gets the dataSolicitado value for this AnuenciaConsultar.
     * 
     * @return dataSolicitado
     */
    public java.lang.String getDataSolicitado() {
        return dataSolicitado;
    }


    /**
     * Sets the dataSolicitado value for this AnuenciaConsultar.
     * 
     * @param dataSolicitado
     */
    public void setDataSolicitado(java.lang.String dataSolicitado) {
        this.dataSolicitado = dataSolicitado;
    }


    /**
     * Gets the statusSolicitacao value for this AnuenciaConsultar.
     * 
     * @return statusSolicitacao
     */
    public java.lang.String getStatusSolicitacao() {
        return statusSolicitacao;
    }


    /**
     * Sets the statusSolicitacao value for this AnuenciaConsultar.
     * 
     * @param statusSolicitacao
     */
    public void setStatusSolicitacao(java.lang.String statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }


    /**
     * Gets the mensagemSolicitacao value for this AnuenciaConsultar.
     * 
     * @return mensagemSolicitacao
     */
    public java.lang.String getMensagemSolicitacao() {
        return mensagemSolicitacao;
    }


    /**
     * Sets the mensagemSolicitacao value for this AnuenciaConsultar.
     * 
     * @param mensagemSolicitacao
     */
    public void setMensagemSolicitacao(java.lang.String mensagemSolicitacao) {
        this.mensagemSolicitacao = mensagemSolicitacao;
    }


    /**
     * Gets the dataStatusCartorio value for this AnuenciaConsultar.
     * 
     * @return dataStatusCartorio
     */
    public java.lang.String getDataStatusCartorio() {
        return dataStatusCartorio;
    }


    /**
     * Sets the dataStatusCartorio value for this AnuenciaConsultar.
     * 
     * @param dataStatusCartorio
     */
    public void setDataStatusCartorio(java.lang.String dataStatusCartorio) {
        this.dataStatusCartorio = dataStatusCartorio;
    }


    /**
     * Gets the statusCartorio value for this AnuenciaConsultar.
     * 
     * @return statusCartorio
     */
    public java.lang.String getStatusCartorio() {
        return statusCartorio;
    }


    /**
     * Sets the statusCartorio value for this AnuenciaConsultar.
     * 
     * @param statusCartorio
     */
    public void setStatusCartorio(java.lang.String statusCartorio) {
        this.statusCartorio = statusCartorio;
    }


    /**
     * Gets the mensagemCartorio value for this AnuenciaConsultar.
     * 
     * @return mensagemCartorio
     */
    public java.lang.String getMensagemCartorio() {
        return mensagemCartorio;
    }


    /**
     * Sets the mensagemCartorio value for this AnuenciaConsultar.
     * 
     * @param mensagemCartorio
     */
    public void setMensagemCartorio(java.lang.String mensagemCartorio) {
        this.mensagemCartorio = mensagemCartorio;
    }


    /**
     * Gets the arquivo value for this AnuenciaConsultar.
     * 
     * @return arquivo
     */
    public java.lang.String getArquivo() {
        return arquivo;
    }


    /**
     * Sets the arquivo value for this AnuenciaConsultar.
     * 
     * @param arquivo
     */
    public void setArquivo(java.lang.String arquivo) {
        this.arquivo = arquivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnuenciaConsultar)) return false;
        AnuenciaConsultar other = (AnuenciaConsultar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operacao==null && other.getOperacao()==null) || 
             (this.operacao!=null &&
              this.operacao.equals(other.getOperacao()))) &&
            ((this.quemPagaCustas==null && other.getQuemPagaCustas()==null) || 
             (this.quemPagaCustas!=null &&
              this.quemPagaCustas.equals(other.getQuemPagaCustas()))) &&
            ((this.dataSolicitado==null && other.getDataSolicitado()==null) || 
             (this.dataSolicitado!=null &&
              this.dataSolicitado.equals(other.getDataSolicitado()))) &&
            ((this.statusSolicitacao==null && other.getStatusSolicitacao()==null) || 
             (this.statusSolicitacao!=null &&
              this.statusSolicitacao.equals(other.getStatusSolicitacao()))) &&
            ((this.mensagemSolicitacao==null && other.getMensagemSolicitacao()==null) || 
             (this.mensagemSolicitacao!=null &&
              this.mensagemSolicitacao.equals(other.getMensagemSolicitacao()))) &&
            ((this.dataStatusCartorio==null && other.getDataStatusCartorio()==null) || 
             (this.dataStatusCartorio!=null &&
              this.dataStatusCartorio.equals(other.getDataStatusCartorio()))) &&
            ((this.statusCartorio==null && other.getStatusCartorio()==null) || 
             (this.statusCartorio!=null &&
              this.statusCartorio.equals(other.getStatusCartorio()))) &&
            ((this.mensagemCartorio==null && other.getMensagemCartorio()==null) || 
             (this.mensagemCartorio!=null &&
              this.mensagemCartorio.equals(other.getMensagemCartorio()))) &&
            ((this.arquivo==null && other.getArquivo()==null) || 
             (this.arquivo!=null &&
              this.arquivo.equals(other.getArquivo())));
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
        if (getOperacao() != null) {
            _hashCode += getOperacao().hashCode();
        }
        if (getQuemPagaCustas() != null) {
            _hashCode += getQuemPagaCustas().hashCode();
        }
        if (getDataSolicitado() != null) {
            _hashCode += getDataSolicitado().hashCode();
        }
        if (getStatusSolicitacao() != null) {
            _hashCode += getStatusSolicitacao().hashCode();
        }
        if (getMensagemSolicitacao() != null) {
            _hashCode += getMensagemSolicitacao().hashCode();
        }
        if (getDataStatusCartorio() != null) {
            _hashCode += getDataStatusCartorio().hashCode();
        }
        if (getStatusCartorio() != null) {
            _hashCode += getStatusCartorio().hashCode();
        }
        if (getMensagemCartorio() != null) {
            _hashCode += getMensagemCartorio().hashCode();
        }
        if (getArquivo() != null) {
            _hashCode += getArquivo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnuenciaConsultar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "anuencia-consultar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quemPagaCustas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quemPagaCustas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSolicitado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSolicitado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataStatusCartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataStatusCartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemCartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemCartorio"));
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
