package teste_seleniumturma2;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class primeiraclasse_selenium {
	@Test
	public void testelogin() {
		
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com.br/");
	

	}
	
}
