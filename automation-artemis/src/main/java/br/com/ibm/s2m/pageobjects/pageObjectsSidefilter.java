package br.com.ibm.s2m.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class pageObjectsSidefilter {

	public static WebElement element_buttonSidefilter(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/incident-management/incident-menu-bar/div/nav/div/ul/li[3]/side-filter-button/button"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
    //Radio e Check do sidefilter
	public static void element_radioCheckButtonSidefilter(WebDriver driver, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 400);
		try {
			List<WebElement> options = driver.findElements(By.tagName("span"));
			for (WebElement option : options) {
				String optTxt = option.getText();
				if (optTxt.contains(text)) {
					option.click();
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	//Combo gestorde entrega N1
	public static void element_comboBoxDeliveryManagerN1(WebDriver driver, int amount) {
		WebDriverWait wait = new WebDriverWait(driver, 400);
		try {
			Select element = (Select) new Select(driver.findElement(By.tagName("select")));
			List<WebElement> l = element.getOptions();
			int size = l.size();
			if ((amount == size)) {
				System.out.println("A quantidade de gestores N1 está correta");
				Assert.assertTrue(true);
			} else {
				System.out.println("A quantidade de gestores N1 está incorreta. Quantidade informada: " + amount);
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	//Combo gestor de entrega
	public static void element_comboBoxDeliveryManagerN1N2(WebDriver driver, int amount) {
		WebDriverWait wait = new WebDriverWait(driver, 400);
		try {
			Select element = (Select) new Select(driver.findElement(By.tagName("select")));
			List<WebElement> l = element.getOptions();
			int size = l.size();
			if ((amount == size)) {
				System.out.println("A quantidade de gestores N1/N2 está correta");
				Assert.assertTrue(true);
			} else {
				System.out.println("A quantidade de gestores N1/N2 está incorreta. Quantidade informada: " + amount);
				System.out.println("Quantidade do combo " + size );
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
		public static WebElement element_divSidefilter(WebDriver driver) {
			WebElement element = null;
			try {
				element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/incident-management/incident-menu-bar/div/side-filter/div/div[1]/div[2]"));

			} catch (Exception e) {
				e.getMessage();
			}
			return element;
	
	}
}
