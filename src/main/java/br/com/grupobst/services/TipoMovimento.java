/**
 * TipoMovimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public class TipoMovimento implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoMovimento(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _GERADO = "GERADO";
    public static final java.lang.String _ENVIADO = "ENVIADO";
    public static final java.lang.String _CONFIRMADO = "CONFIRMADO";
    public static final java.lang.String _PAGO = "PAGO";
    public static final java.lang.String _CANCELADO = "CANCELADO";
    public static final java.lang.String _DEVOLVIDO = "DEVOLVIDO";
    public static final java.lang.String _PROTESTADO = "PROTESTADO";
    public static final java.lang.String _RETIRADO = "RETIRADO";
    public static final java.lang.String _SUSTADO = "SUSTADO";
    public static final java.lang.String _SUSTADO_DEFINITIVO = "SUSTADO_DEFINITIVO";
    public static final java.lang.String _SUSPENSO = "SUSPENSO";
    public static final TipoMovimento GERADO = new TipoMovimento(_GERADO);
    public static final TipoMovimento ENVIADO = new TipoMovimento(_ENVIADO);
    public static final TipoMovimento CONFIRMADO = new TipoMovimento(_CONFIRMADO);
    public static final TipoMovimento PAGO = new TipoMovimento(_PAGO);
    public static final TipoMovimento CANCELADO = new TipoMovimento(_CANCELADO);
    public static final TipoMovimento DEVOLVIDO = new TipoMovimento(_DEVOLVIDO);
    public static final TipoMovimento PROTESTADO = new TipoMovimento(_PROTESTADO);
    public static final TipoMovimento RETIRADO = new TipoMovimento(_RETIRADO);
    public static final TipoMovimento SUSTADO = new TipoMovimento(_SUSTADO);
    public static final TipoMovimento SUSTADO_DEFINITIVO = new TipoMovimento(_SUSTADO_DEFINITIVO);
    public static final TipoMovimento SUSPENSO = new TipoMovimento(_SUSPENSO);
    public java.lang.String getValue() { return _value_;}
    public static TipoMovimento fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoMovimento enumeration = (TipoMovimento)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoMovimento fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoMovimento.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupobst.com.br/services", "tipoMovimento"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
