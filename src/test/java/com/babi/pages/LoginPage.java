package com.babi.pages;

import static com.babi.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import com.babi.core.BasePage;

public class LoginPage extends BasePage {
	
	public void acessarTelaLogin() {
		System.setProperty("webdriver.chrome.driver","\\Users\\babys\\Desktop\\driver\\chromedriver.exe");
		getDriver().get("https://seubarriga.wcaquino.me/login");
	}

	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar() {
		clicarBotao(By.xpath("/html/body/div[2]/form/button"));
	}
}
