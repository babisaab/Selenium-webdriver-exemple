package com.babi.pages;

import com.babi.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarContas() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void listarContas() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void criarMovimentacao() {
		clicarLink("Criar Movimentação");
	}
	
	public void resumoMensal() {
		clicarLink("Resumo Mensal");
	}
}
