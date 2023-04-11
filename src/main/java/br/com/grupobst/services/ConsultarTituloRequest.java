/**
 * ConsultarTituloRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class ConsultarTituloRequest  implements java.io.Serializable {
    private br.com.grupobst.services.DevedorConsultar devedor;

    private br.com.grupobst.services.DividaConsultar divida;

    private br.com.grupobst.services.CartorioConsultarRequest cartorio;

    public ConsultarTituloRequest() {
    }

    public ConsultarTituloRequest(
           br.com.grupobst.services.DevedorConsultar devedor,
           br.com.grupobst.services.DividaConsultar divida,
           br.com.grupobst.services.CartorioConsultarRequest cartorio) {
           this.devedor = devedor;
           this.divida = divida;
           this.cartorio = cartorio;
    }


    /**
     * Gets the devedor value for this ConsultarTituloRequest.
     * 
     * @return devedor
     */
    public br.com.grupobst.services.DevedorConsultar getDevedor() {
        return devedor;
    }


    /**
     * Sets the devedor value for this ConsultarTituloRequest.
     * 
     * @param devedor
     */
    public void setDevedor(br.com.grupobst.services.DevedorConsultar devedor) {
        this.devedor = devedor;
    }


    /**
     * Gets the divida value for this ConsultarTituloRequest.
     * 
     * @return divida
     */
    public br.com.grupobst.services.DividaConsultar getDivida() {
        return divida;
    }


    /**
     * Sets the divida value for this ConsultarTituloRequest.
     * 
     * @param divida
     */
    public void setDivida(br.com.grupobst.services.DividaConsultar divida) {
        this.divida = divida;
    }


    /**
     * Gets the cartorio value for this ConsultarTituloRequest.
     * 
     * @return cartorio
     */
    public br.com.grupobst.services.CartorioConsultarRequest getCartorio() {
        return cartorio;
    }


    /**
     * Sets the cartorio value for this ConsultarTituloRequest.
     * 
     * @param cartorio
     */
    public void setCartorio(br.com.grupobst.services.CartorioConsultarRequest cartorio) {
        this.cartorio = cartorio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarTituloRequest)) return false;
        ConsultarTituloRequest other = (ConsultarTituloRequest) obj;
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
        new org.apache.axis.description.TypeDesc(ConsultarTituloRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "consultarTituloRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "devedor-consultar"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "divida-consultar"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "cartorio-consultar-request"));
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
