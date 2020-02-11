package com.babi.suites;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.babi.core.DriverFactory;
import com.babi.pages.LoginPage;
import com.babi.testes.ContaTeste;
import com.babi.testes.MovimentacaoTeste;
import com.babi.testes.Remover;
import com.babi.testes.ResumoTeste;
import com.babi.testes.SaldoTeste;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTeste.class,
	MovimentacaoTeste.class,
	Remover.class,
	SaldoTeste.class,
	ResumoTeste.class
})
public class SuiteGeral {

	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa() {
		page.acessarTelaLogin();
		page.setEmail("ssantanasaab@yahoo.com.br");
		page.setSenha("babi123");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}
	
	
	
	
	
	
	
	
	
}
