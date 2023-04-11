package br.com.aaf.integracao.cartorio;

import java.io.File;

public class Util {

	
	public static int projeto = 2;
	public static String PROJETO_ADONAI = "adonai";
	public static String PROJETO_FAVO = "favo";
	private static String usuario = "servidor";
	private static String pasta = "contratos";
	
	public static String PATH_CONTRATOS_ADONAI = File.separator+"home"+File.separator+usuario + File.separator + pasta + File.separator +PROJETO_ADONAI + File.separator ;
	//public static String PATH_CONTRATOS_FAVO = File.separator+"home"+File.separator+usuario + File.separator + pasta + File.separator +PROJETO_FAVO + File.separator ;
	
	//TODO TESTE LOCAL
	
	public static String PATH_CONTRATOS_FAVO = "C:\\Users\\Abimael Fidencio\\Pictures\\Scan\\";
	 
	
}
