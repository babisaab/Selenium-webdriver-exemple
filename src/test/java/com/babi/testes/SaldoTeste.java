package com.babi.testes;

import org.junit.Assert;
import org.junit.Test;

import com.babi.core.BaseTeste;
import com.babi.pages.HomePage;


public class SaldoTeste extends BaseTeste {

	HomePage homePage = new HomePage();
	
	
	@Test
	public void saldoConta() {
		Assert.assertEquals("534", homePage.obterSaldoConta("Conta para saldo"));
	}
}
