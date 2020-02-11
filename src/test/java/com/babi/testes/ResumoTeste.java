package com.babi.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.babi.core.BaseTeste;
import com.babi.core.DriverFactory;
import com.babi.pages.MenuPage;
import com.babi.pages.ResumoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTeste extends BaseTeste {
	
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	
	@Test
	public void teste1_excluirMovimentacao() {
		menuPage.resumoMensal();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
		
	}
	
	@Test
	public void teste2_resumoMensal() {
		menuPage.resumoMensal();

		Assert.assertEquals("Seu Barriga - Extrato", DriverFactory.getDriver().getTitle());

		//try {
		List<WebElement> elementosEncontrados = 
			DriverFactory.getDriver().findElements(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
			Assert.assertEquals(0, elementosEncontrados.size());
		
		//Assert.fail();	
		//} catch (NoSuchElementException e) {

		}
	}
