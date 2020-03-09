package com.babi.testes;

import org.junit.Assert;
import org.junit.Test;

import com.babi.core.BaseTeste;
import com.babi.pages.HomePage;
import com.babi.pages.MenuPage;


public class SaldoTeste extends BaseTeste {

	HomePage homePage = new HomePage();
	MenuPage menu = new MenuPage();
	
	
	@Test
	public void saldoConta() {
		menu.acessarHome();
		Assert.assertEquals("200.00", homePage.obterSaldoConta("Conta testada"));
	}
}
