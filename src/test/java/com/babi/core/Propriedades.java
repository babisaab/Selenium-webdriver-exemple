package com.babi.core;


public class Propriedades {
	
	public static boolean FECHAR_BROWSER = false;
	
	public static Browsers browser = Browsers.CHROME;
	
	public static String NOME_DA_CONTA_ALTERADA = "Conta testada" + System.nanoTime();
	
	public enum Browsers {
		CHROME,
		FIREFOX
	}

}