package com.capacitacion2.capacitacion_2.clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatizacionPaginaWeb {

	public void interactuarGmail(){
		String ubicacionDriver = "src/main/java/resource/drivers/chromedriver";
		String urlInicioGmail = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.setProperty("webdriver.chrome.driver", ubicacionDriver);
		WebDriver driver = new ChromeDriver();
		driver.get(urlInicioGmail);
		WebElement cajaTextoEmail = driver.findElement(By.id("identifierId"));//busca la caja de texto
		cajaTextoEmail.sendKeys("prueba@prueba.com");//ingresa el valor a la caja de texto
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
}
