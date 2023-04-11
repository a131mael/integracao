/**
 * ProtestoInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.grupobst.services;

public interface ProtestoInterface extends java.rmi.Remote {
    public br.com.grupobst.services.ApresentanteConsultaResponse consultarApresentante(java.lang.String token, br.com.grupobst.services.ApresentanteConsultaRequest apresentante) throws java.rmi.RemoteException;
    public br.com.grupobst.services.EnviarTituloResponse[] enviarTitulo(java.lang.String token, br.com.grupobst.services.EnviarTituloRequest[] titulo) throws java.rmi.RemoteException;
    public br.com.grupobst.services.MovimentoResponse[] movimentoDiario(java.lang.String token, br.com.grupobst.services.MovimentoConsultar[] movimento) throws java.rmi.RemoteException;
    public br.com.grupobst.services.CedenteCadastroResponse[] cadastrarCedente(java.lang.String token, br.com.grupobst.services.CedenteCadastro[] cedente) throws java.rmi.RemoteException;
    public br.com.grupobst.services.ConsultarArquivoResponse[] consultarArquivo(java.lang.String token, br.com.grupobst.services.ConsultarArquivoRequest[] arquivo) throws java.rmi.RemoteException;
    public br.com.grupobst.services.OperacaoTituloResponse[] operacaoTitulo(java.lang.String token, br.com.grupobst.services.OperacaoTituloRequest[] titulo) throws java.rmi.RemoteException;
    public br.com.grupobst.services.AutenticarResponse autenticar(br.com.grupobst.services.AutenticarRequest credenciais) throws java.rmi.RemoteException;
    public br.com.grupobst.services.CedenteConsultaResponse consultarCedente(java.lang.String token, br.com.grupobst.services.CedenteConsulta cedente) throws java.rmi.RemoteException;
    public br.com.grupobst.services.ConsultarTituloResponse[] consultarTitulo(java.lang.String token, java.lang.String completa, java.lang.String instrumento, java.lang.String anuencia, br.com.grupobst.services.ConsultarTituloRequest[] titulo) throws java.rmi.RemoteException;
}
