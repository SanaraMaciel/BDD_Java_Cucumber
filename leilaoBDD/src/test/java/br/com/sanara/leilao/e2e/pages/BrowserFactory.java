package br.com.sanara.leilao.e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserFactory {

//  Documentação
//	http://chromedriver.storage.googleapis.com/index.html
//	https://github.com/mozilla/geckodriver/releases	

	public WebDriver createWebDriver() {
		//String webdriver = System.getProperty("browser", "htmlunit");
		String webdriver = System.getProperty("browser", "firefox");
		switch (webdriver) {
			case "firefox":
				return initFirefoxDriver();
			case "chrome":
				return initChromeDriver();
			default:
				return new HtmlUnitDriver();
		}
	}

	private  WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\stepp\\Desktop\\curso-bdd\\workspace\\leilao\\drivers\\chromedriver.exe");
				"C:\\Users\\sanara\\Pictures\\Cursos\\BDD_Cucumber\\leilaoBDD\\drivers\\chromedriver.exe");
		return new ChromeDriver();
	}

	private  WebDriver initFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				//"C:\\Users\\stepp\\Desktop\\curso-bdd\\workspace\\leilao\\drivers\\geckodriver.exe");
				"C:\\Users\\sanara\\Pictures\\Cursos\\BDD_Cucumber\\leilaoBDD\\drivers\\geckodriver.exe");
		return new FirefoxDriver();
	}
}
