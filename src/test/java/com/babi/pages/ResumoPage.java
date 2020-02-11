package com.babi.pages;

import org.openqa.selenium.By;

import com.babi.core.BasePage;

public class ResumoPage extends BasePage {

	public void excluirMovimentacao() {
		clicarBotao(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[6]/a/span"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
}
