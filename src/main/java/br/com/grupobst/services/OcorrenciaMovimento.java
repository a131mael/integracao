/**
 * OcorrenciaMovimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class OcorrenciaMovimento  implements java.io.Serializable {
    private java.lang.String dataHora;

    private java.lang.String status;

    private java.lang.String mensagem;

    private br.com.grupobst.services.CustaMovimento custas;

    private br.com.grupobst.services.ProtocoloMovimento protocolo;

    private br.com.grupobst.services.RepasseMovimento repasse;

    public OcorrenciaMovimento() {
    }

    public OcorrenciaMovimento(
           java.lang.String dataHora,
           java.lang.String status,
           java.lang.String mensagem,
           br.com.grupobst.services.CustaMovimento custas,
           br.com.grupobst.services.ProtocoloMovimento protocolo,
           br.com.grupobst.services.RepasseMovimento repasse) {
           this.dataHora = dataHora;
           this.status = status;
           this.mensagem = mensagem;
           this.custas = custas;
           this.protocolo = protocolo;
           this.repasse = repasse;
    }


    /**
     * Gets the dataHora value for this OcorrenciaMovimento.
     * 
     * @return dataHora
     */
    public java.lang.String getDataHora() {
        return dataHora;
    }


    /**
     * Sets the dataHora value for this OcorrenciaMovimento.
     * 
     * @param dataHora
     */
    public void setDataHora(java.lang.String dataHora) {
        this.dataHora = dataHora;
    }


    /**
     * Gets the status value for this OcorrenciaMovimento.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OcorrenciaMovimento.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the mensagem value for this OcorrenciaMovimento.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OcorrenciaMovimento.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the custas value for this OcorrenciaMovimento.
     * 
     * @return custas
     */
    public br.com.grupobst.services.CustaMovimento getCustas() {
        return custas;
    }


    /**
     * Sets the custas value for this OcorrenciaMovimento.
     * 
     * @param custas
     */
    public void setCustas(br.com.grupobst.services.CustaMovimento custas) {
        this.custas = custas;
    }


    /**
     * Gets the protocolo value for this OcorrenciaMovimento.
     * 
     * @return protocolo
     */
    public br.com.grupobst.services.ProtocoloMovimento getProtocolo() {
        return protocolo;
    }


    /**
     * Sets the protocolo value for this OcorrenciaMovimento.
     * 
     * @param protocolo
     */
    public void setProtocolo(br.com.grupobst.services.ProtocoloMovimento protocolo) {
        this.protocolo = protocolo;
    }


    /**
     * Gets the repasse value for this OcorrenciaMovimento.
     * 
     * @return repasse
     */
    public br.com.grupobst.services.RepasseMovimento getRepasse() {
        return repasse;
    }


    /**
     * Sets the repasse value for this OcorrenciaMovimento.
     * 
     * @param repasse
     */
    public void setRepasse(br.com.grupobst.services.RepasseMovimento repasse) {
        this.repasse = repasse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OcorrenciaMovimento)) return false;
        OcorrenciaMovimento other = (OcorrenciaMovimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataHora==null && other.getDataHora()==null) || 
             (this.dataHora!=null &&
              this.dataHora.equals(other.getDataHora()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.custas==null && other.getCustas()==null) || 
             (this.custas!=null &&
              this.custas.equals(other.getCustas()))) &&
            ((this.protocolo==null && other.getProtocolo()==null) || 
             (this.protocolo!=null &&
              this.protocolo.equals(other.getProtocolo()))) &&
            ((this.repasse==null && other.getRepasse()==null) || 
             (this.repasse!=null &&
              this.repasse.equals(other.getRepasse())));
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
        if (getDataHora() != null) {
            _hashCode += getDataHora().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getCustas() != null) {
            _hashCode += getCustas().hashCode();
        }
        if (getProtocolo() != null) {
            _hashCode += getProtocolo().hashCode();
        }
        if (getRepasse() != null) {
            _hashCode += getRepasse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OcorrenciaMovimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "ocorrencia-movimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "custa-movimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "protocolo-movimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "repasse-movimento"));
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
