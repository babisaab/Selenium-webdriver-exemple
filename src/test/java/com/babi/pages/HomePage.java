package com.babi.pages;



import com.babi.core.BasePage;

public class HomePage extends BasePage {

	
	public String obterSaldoConta(String string) {
		return obterCelula("Conta", string, "Saldo", "tabelaSaldo").getText();
	}
}

