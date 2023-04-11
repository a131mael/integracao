/**
 * ProtestoNacionalInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.cra21.crasc;

public interface ProtestoNacionalInterface extends java.rmi.Remote {
    public java.lang.String desistencia(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException;
    public java.lang.String retorno(java.lang.String userArq) throws java.rmi.RemoteException;
    public java.lang.String autoriza_Desistencia(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException;
    public java.lang.String imagem(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException;
    public java.lang.String instrumento(java.lang.String userDados) throws java.rmi.RemoteException;
    public java.lang.String homologadas(java.lang.String codapres, java.lang.String cartorios) throws java.rmi.RemoteException;
    public java.lang.String confirmacao(java.lang.String userArq) throws java.rmi.RemoteException;
    public java.lang.String consulta_Slip(java.lang.String codMunicipio, java.lang.String codCartorio, java.lang.String protocolo, java.lang.String dataProtocolo) throws java.rmi.RemoteException;
    public java.lang.String remessa(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException;
    public java.lang.String autoriza_Cancelamento(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException;
    public java.lang.String cancelamento(java.lang.String userArq, java.lang.String userDados) throws java.rmi.RemoteException;
    public java.lang.String consulta(java.lang.String nossoNumero, java.lang.String numeroTitulo) throws java.rmi.RemoteException;
}
