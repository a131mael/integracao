/**
 * OperacaoTituloRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class OperacaoTituloRequest  implements java.io.Serializable {
    private java.lang.String autoriza;

    private java.lang.String operacao;

    private java.lang.String justificativa;

    private br.com.grupobst.services.DevedorOperacao devedor;

    private br.com.grupobst.services.DividaOperacao divida;

    private br.com.grupobst.services.CartorioOperacaoRequest cartorio;

    public OperacaoTituloRequest() {
    }

    public OperacaoTituloRequest(
           java.lang.String autoriza,
           java.lang.String operacao,
           java.lang.String justificativa,
           br.com.grupobst.services.DevedorOperacao devedor,
           br.com.grupobst.services.DividaOperacao divida,
           br.com.grupobst.services.CartorioOperacaoRequest cartorio) {
           this.autoriza = autoriza;
           this.operacao = operacao;
           this.justificativa = justificativa;
           this.devedor = devedor;
           this.divida = divida;
           this.cartorio = cartorio;
    }


    /**
     * Gets the autoriza value for this OperacaoTituloRequest.
     * 
     * @return autoriza
     */
    public java.lang.String getAutoriza() {
        return autoriza;
    }


    /**
     * Sets the autoriza value for this OperacaoTituloRequest.
     * 
     * @param autoriza
     */
    public void setAutoriza(java.lang.String autoriza) {
        this.autoriza = autoriza;
    }


    /**
     * Gets the operacao value for this OperacaoTituloRequest.
     * 
     * @return operacao
     */
    public java.lang.String getOperacao() {
        return operacao;
    }


    /**
     * Sets the operacao value for this OperacaoTituloRequest.
     * 
     * @param operacao
     */
    public void setOperacao(java.lang.String operacao) {
        this.operacao = operacao;
    }


    /**
     * Gets the justificativa value for this OperacaoTituloRequest.
     * 
     * @return justificativa
     */
    public java.lang.String getJustificativa() {
        return justificativa;
    }


    /**
     * Sets the justificativa value for this OperacaoTituloRequest.
     * 
     * @param justificativa
     */
    public void setJustificativa(java.lang.String justificativa) {
        this.justificativa = justificativa;
    }


    /**
     * Gets the devedor value for this OperacaoTituloRequest.
     * 
     * @return devedor
     */
    public br.com.grupobst.services.DevedorOperacao getDevedor() {
        return devedor;
    }


    /**
     * Sets the devedor value for this OperacaoTituloRequest.
     * 
     * @param devedor
     */
    public void setDevedor(br.com.grupobst.services.DevedorOperacao devedor) {
        this.devedor = devedor;
    }


    /**
     * Gets the divida value for this OperacaoTituloRequest.
     * 
     * @return divida
     */
    public br.com.grupobst.services.DividaOperacao getDivida() {
        return divida;
    }


    /**
     * Sets the divida value for this OperacaoTituloRequest.
     * 
     * @param divida
     */
    public void setDivida(br.com.grupobst.services.DividaOperacao divida) {
        this.divida = divida;
    }


    /**
     * Gets the cartorio value for this OperacaoTituloRequest.
     * 
     * @return cartorio
     */
    public br.com.grupobst.services.CartorioOperacaoRequest getCartorio() {
        return cartorio;
    }


    /**
     * Sets the cartorio value for this OperacaoTituloRequest.
     * 
     * @param cartorio
     */
    public void setCartorio(br.com.grupobst.services.CartorioOperacaoRequest cartorio) {
        this.cartorio = cartorio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperacaoTituloRequest)) return false;
        OperacaoTituloRequest other = (OperacaoTituloRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoriza==null && other.getAutoriza()==null) || 
             (this.autoriza!=null &&
              this.autoriza.equals(other.getAutoriza()))) &&
            ((this.operacao==null && other.getOperacao()==null) || 
             (this.operacao!=null &&
              this.operacao.equals(other.getOperacao()))) &&
            ((this.justificativa==null && other.getJustificativa()==null) || 
             (this.justificativa!=null &&
              this.justificativa.equals(other.getJustificativa()))) &&
            ((this.devedor==null && other.getDevedor()==null) || 
             (this.devedor!=null &&
              this.devedor.equals(other.getDevedor()))) &&
            ((this.divida==null && other.getDivida()==null) || 
             (this.divida!=null &&
              this.divida.equals(other.getDivida()))) &&
            ((this.cartorio==null && other.getCartorio()==null) || 
             (this.cartorio!=null &&
              this.cartorio.equals(other.getCartorio())));
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
        if (getAutoriza() != null) {
            _hashCode += getAutoriza().hashCode();
        }
        if (getOperacao() != null) {
            _hashCode += getOperacao().hashCode();
        }
        if (getJustificativa() != null) {
            _hashCode += getJustificativa().hashCode();
        }
        if (getDevedor() != null) {
            _hashCode += getDevedor().hashCode();
        }
        if (getDivida() != null) {
            _hashCode += getDivida().hashCode();
        }
        if (getCartorio() != null) {
            _hashCode += getCartorio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperacaoTituloRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "operacaoTituloRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoriza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoriza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificativa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justificativa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-operacao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-operacao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-operacao-request"));
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
