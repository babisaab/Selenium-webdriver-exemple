package com.babi.testes;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.babi.core.BaseTeste;
import com.babi.pages.ContaPage;
import com.babi.pages.MenuPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTeste extends BaseTeste {

	MenuPage menuPage = new MenuPage();
	ContaPage contaPage = new ContaPage();
	
	@Test
	public void test1_inserirConta() {
		menuPage.acessarContas();
		contaPage.setNome("Conta Teste");
		contaPage.salvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contaPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2_alterarConta() {
		menuPage.listarContas();
		contaPage.clicarIconeAlterar("Conta Teste");
		contaPage.setNome("Conta testada");
		contaPage.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", contaPage.obterMensagemSucesso());
	}
	
	@Test
	public void test3_inserirContaMesmoNome() {
		menuPage.acessarContas();
		contaPage.setNome("Conta testada");
		contaPage.salvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", contaPage.obterMensagemErro());
	}
	

	
	
	
}
