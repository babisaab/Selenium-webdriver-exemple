package com.babi.pages;

import org.openqa.selenium.By;

import com.babi.core.BasePage;

public class ContaPage extends BasePage {

	
	public void setNome(String nome) {
		escrever("nome", nome);
	}
	
	public void salvar() {
		clicarBotaoPorTexto("Salvar");
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public void clicarIconeAlterar(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
		.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}
	
	public String obterMensagemErro() {
		return obterTexto(By.xpath(".//*[@class='alert alert-danger']"));
	}
}
