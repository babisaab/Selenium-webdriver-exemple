package com.babi.testes;

import org.junit.Assert;
import org.junit.Test;

import com.babi.core.BaseTeste;
import com.babi.pages.ContaPage;
import com.babi.pages.MenuPage;

public class Remover extends BaseTeste {

	private MenuPage menuPage = new MenuPage();
	private ContaPage contaPage = new ContaPage();
	
    

@Test
public void excluirConta() {
	menuPage.listarContas();
	
	contaPage.clicarRemoverConta("Conta com movimentacao");
	
	Assert.assertEquals("Conta em uso na movimentações", contaPage.obterMensagemErro());
	
}
}