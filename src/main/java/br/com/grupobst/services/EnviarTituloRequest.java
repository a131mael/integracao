/**
 * EnviarTituloRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class EnviarTituloRequest  implements java.io.Serializable {
    private java.lang.String alteracao;

    private br.com.grupobst.services.XmlCedente cedente;

    private br.com.grupobst.services.XmlSacador sacador;

    private br.com.grupobst.services.DevedorEnviar[] devedor;

    private br.com.grupobst.services.DividaEnviar divida;

    public EnviarTituloRequest() {
    }

    public EnviarTituloRequest(
           java.lang.String alteracao,
           br.com.grupobst.services.XmlCedente cedente,
           br.com.grupobst.services.XmlSacador sacador,
           br.com.grupobst.services.DevedorEnviar[] devedor,
           br.com.grupobst.services.DividaEnviar divida) {
           this.alteracao = alteracao;
           this.cedente = cedente;
           this.sacador = sacador;
           this.devedor = devedor;
           this.divida = divida;
    }


    /**
     * Gets the alteracao value for this EnviarTituloRequest.
     * 
     * @return alteracao
     */
    public java.lang.String getAlteracao() {
        return alteracao;
    }


    /**
     * Sets the alteracao value for this EnviarTituloRequest.
     * 
     * @param alteracao
     */
    public void setAlteracao(java.lang.String alteracao) {
        this.alteracao = alteracao;
    }


    /**
     * Gets the cedente value for this EnviarTituloRequest.
     * 
     * @return cedente
     */
    public br.com.grupobst.services.XmlCedente getCedente() {
        return cedente;
    }


    /**
     * Sets the cedente value for this EnviarTituloRequest.
     * 
     * @param cedente
     */
    public void setCedente(br.com.grupobst.services.XmlCedente cedente) {
        this.cedente = cedente;
    }


    /**
     * Gets the sacador value for this EnviarTituloRequest.
     * 
     * @return sacador
     */
    public br.com.grupobst.services.XmlSacador getSacador() {
        return sacador;
    }


    /**
     * Sets the sacador value for this EnviarTituloRequest.
     * 
     * @param sacador
     */
    public void setSacador(br.com.grupobst.services.XmlSacador sacador) {
        this.sacador = sacador;
    }


    /**
     * Gets the devedor value for this EnviarTituloRequest.
     * 
     * @return devedor
     */
    public br.com.grupobst.services.DevedorEnviar[] getDevedor() {
        return devedor;
    }


    /**
     * Sets the devedor value for this EnviarTituloRequest.
     * 
     * @param devedor
     */
    public void setDevedor(br.com.grupobst.services.DevedorEnviar[] devedor) {
        this.devedor = devedor;
    }

    public br.com.grupobst.services.DevedorEnviar getDevedor(int i) {
        return this.devedor[i];
    }

    public void setDevedor(int i, br.com.grupobst.services.DevedorEnviar _value) {
        this.devedor[i] = _value;
    }


    /**
     * Gets the divida value for this EnviarTituloRequest.
     * 
     * @return divida
     */
    public br.com.grupobst.services.DividaEnviar getDivida() {
        return divida;
    }


    /**
     * Sets the divida value for this EnviarTituloRequest.
     * 
     * @param divida
     */
    public void setDivida(br.com.grupobst.services.DividaEnviar divida) {
        this.divida = divida;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviarTituloRequest)) return false;
        EnviarTituloRequest other = (EnviarTituloRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alteracao==null && other.getAlteracao()==null) || 
             (this.alteracao!=null &&
              this.alteracao.equals(other.getAlteracao()))) &&
            ((this.cedente==null && other.getCedente()==null) || 
             (this.cedente!=null &&
              this.cedente.equals(other.getCedente()))) &&
            ((this.sacador==null && other.getSacador()==null) || 
             (this.sacador!=null &&
              this.sacador.equals(other.getSacador()))) &&
            ((this.devedor==null && other.getDevedor()==null) || 
             (this.devedor!=null &&
              java.util.Arrays.equals(this.devedor, other.getDevedor()))) &&
            ((this.divida==null && other.getDivida()==null) || 
             (this.divida!=null &&
              this.divida.equals(other.getDivida())));
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
        if (getAlteracao() != null) {
            _hashCode += getAlteracao().hashCode();
        }
        if (getCedente() != null) {
            _hashCode += getCedente().hashCode();
        }
        if (getSacador() != null) {
            _hashCode += getSacador().hashCode();
        }
        if (getDevedor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevedor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevedor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDivida() != null) {
            _hashCode += getDivida().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnviarTituloRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "enviarTituloRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alteracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alteracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cedente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cedente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlCedente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sacador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sacador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "xmlSacador"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-enviar"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-enviar"));
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
