package br.com.grupobst.services;

public class ProtestoInterfaceProxy implements br.com.grupobst.services.ProtestoInterface {
  private String _endpoint = null;
  private br.com.grupobst.services.ProtestoInterface protestoInterface = null;
  
  public ProtestoInterfaceProxy() {
    _initProtestoInterfaceProxy();
  }
  
  public ProtestoInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProtestoInterfaceProxy();
  }
  
  private void _initProtestoInterfaceProxy() {
    try {
      protestoInterface = (new br.com.grupobst.services.ServicesLocator()).getProtestoPort();
      if (protestoInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)protestoInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)protestoInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (protestoInterface != null)
      ((javax.xml.rpc.Stub)protestoInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.grupobst.services.ProtestoInterface getProtestoInterface() {
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface;
  }
  
  public br.com.grupobst.services.ApresentanteConsultaResponse consultarApresentante(java.lang.String token, br.com.grupobst.services.ApresentanteConsultaRequest apresentante) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.consultarApresentante(token, apresentante);
  }
  
  public br.com.grupobst.services.EnviarTituloResponse[] enviarTitulo(java.lang.String token, br.com.grupobst.services.EnviarTituloRequest[] titulo) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.enviarTitulo(token, titulo);
  }
  
  public br.com.grupobst.services.MovimentoResponse[] movimentoDiario(java.lang.String token, br.com.grupobst.services.MovimentoConsultar[] movimento) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.movimentoDiario(token, movimento);
  }
  
  public br.com.grupobst.services.CedenteCadastroResponse[] cadastrarCedente(java.lang.String token, br.com.grupobst.services.CedenteCadastro[] cedente) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.cadastrarCedente(token, cedente);
  }
  
  public br.com.grupobst.services.ConsultarArquivoResponse[] consultarArquivo(java.lang.String token, br.com.grupobst.services.ConsultarArquivoRequest[] arquivo) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.consultarArquivo(token, arquivo);
  }
  
  public br.com.grupobst.services.OperacaoTituloResponse[] operacaoTitulo(java.lang.String token, br.com.grupobst.services.OperacaoTituloRequest[] titulo) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.operacaoTitulo(token, titulo);
  }
  
  public br.com.grupobst.services.AutenticarResponse autenticar(br.com.grupobst.services.AutenticarRequest credenciais) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.autenticar(credenciais);
  }
  
  public br.com.grupobst.services.CedenteConsultaResponse consultarCedente(java.lang.String token, br.com.grupobst.services.CedenteConsulta cedente) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.consultarCedente(token, cedente);
  }
  
  public br.com.grupobst.services.ConsultarTituloResponse[] consultarTitulo(java.lang.String token, java.lang.String completa, java.lang.String instrumento, java.lang.String anuencia, br.com.grupobst.services.ConsultarTituloRequest[] titulo) throws java.rmi.RemoteException{
    if (protestoInterface == null)
      _initProtestoInterfaceProxy();
    return protestoInterface.consultarTitulo(token, completa, instrumento, anuencia, titulo);
  }
  
  
}