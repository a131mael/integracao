/**
 * CustaConsultar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class CustaConsultar  implements java.io.Serializable {
    private java.lang.Double distribuidor;

    private java.lang.Double cartorio;

    private java.lang.Double gravacao;

    private java.lang.Double despesas;

    public CustaConsultar() {
    }

    public CustaConsultar(
           java.lang.Double distribuidor,
           java.lang.Double cartorio,
           java.lang.Double gravacao,
           java.lang.Double despesas) {
           this.distribuidor = distribuidor;
           this.cartorio = cartorio;
           this.gravacao = gravacao;
           this.despesas = despesas;
    }


    /**
     * Gets the distribuidor value for this CustaConsultar.
     * 
     * @return distribuidor
     */
    public java.lang.Double getDistribuidor() {
        return distribuidor;
    }


    /**
     * Sets the distribuidor value for this CustaConsultar.
     * 
     * @param distribuidor
     */
    public void setDistribuidor(java.lang.Double distribuidor) {
        this.distribuidor = distribuidor;
    }


    /**
     * Gets the cartorio value for this CustaConsultar.
     * 
     * @return cartorio
     */
    public java.lang.Double getCartorio() {
        return cartorio;
    }


    /**
     * Sets the cartorio value for this CustaConsultar.
     * 
     * @param cartorio
     */
    public void setCartorio(java.lang.Double cartorio) {
        this.cartorio = cartorio;
    }


    /**
     * Gets the gravacao value for this CustaConsultar.
     * 
     * @return gravacao
     */
    public java.lang.Double getGravacao() {
        return gravacao;
    }


    /**
     * Sets the gravacao value for this CustaConsultar.
     * 
     * @param gravacao
     */
    public void setGravacao(java.lang.Double gravacao) {
        this.gravacao = gravacao;
    }


    /**
     * Gets the despesas value for this CustaConsultar.
     * 
     * @return despesas
     */
    public java.lang.Double getDespesas() {
        return despesas;
    }


    /**
     * Sets the despesas value for this CustaConsultar.
     * 
     * @param despesas
     */
    public void setDespesas(java.lang.Double despesas) {
        this.despesas = despesas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustaConsultar)) return false;
        CustaConsultar other = (CustaConsultar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distribuidor==null && other.getDistribuidor()==null) || 
             (this.distribuidor!=null &&
              this.distribuidor.equals(other.getDistribuidor()))) &&
            ((this.cartorio==null && other.getCartorio()==null) || 
             (this.cartorio!=null &&
              this.cartorio.equals(other.getCartorio()))) &&
            ((this.gravacao==null && other.getGravacao()==null) || 
             (this.gravacao!=null &&
              this.gravacao.equals(other.getGravacao()))) &&
            ((this.despesas==null && other.getDespesas()==null) || 
             (this.despesas!=null &&
              this.despesas.equals(other.getDespesas())));
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
        if (getDistribuidor() != null) {
            _hashCode += getDistribuidor().hashCode();
        }
        if (getCartorio() != null) {
            _hashCode += getCartorio().hashCode();
        }
        if (getGravacao() != null) {
            _hashCode += getGravacao().hashCode();
        }
        if (getDespesas() != null) {
            _hashCode += getDespesas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustaConsultar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "custa-consultar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distribuidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distribuidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gravacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gravacao"));
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
