package com.babi.testes;

import org.junit.Assert;
import org.junit.Test;

import com.babi.core.BaseTeste;
import com.babi.pages.ContaPage;
import com.babi.pages.MenuPage;



public class ContaTeste extends BaseTeste {

	MenuPage menuPage = new MenuPage();
	ContaPage contaPage = new ContaPage();
	
	@Test
	public void inserirConta() {
		menuPage.acessarContas();
		contaPage.setNome("Conta Teste");
		contaPage.salvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contaPage.obterMensagemSucesso());
	}
	
	@Test
	public void alterarConta() {
		menuPage.listarContas();
		contaPage.clicarIconeAlterar("Conta Teste");
		contaPage.setNome("Conta testada");
		contaPage.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", contaPage.obterMensagemSucesso());
	}
	
	@Test
	public void inserirContaMesmoNome() {
		menuPage.acessarContas();
		contaPage.setNome("Conta testada");
		contaPage.salvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", contaPage.obterMensagemErro());
	}
	
	@Test
	public void excluirConta() {
		menuPage.listarContas();
		
		contaPage.clicarRemoverConta("Conta com movimentacao");
		
		Assert.assertEquals("Conta em uso na movimentações", contaPage.obterMensagemErro());
		
	}
	
	
	
}
