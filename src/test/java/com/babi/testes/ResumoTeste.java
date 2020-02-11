package com.babi.testes;

import org.junit.Assert;
import org.junit.Test;

import com.babi.core.BaseTeste;
import com.babi.pages.MenuPage;
import com.babi.pages.ResumoPage;

public class ResumoTeste extends BaseTeste {
	
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	
	@Test
	public void excluirMovimentacao() {
		menuPage.resumoMensal();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
