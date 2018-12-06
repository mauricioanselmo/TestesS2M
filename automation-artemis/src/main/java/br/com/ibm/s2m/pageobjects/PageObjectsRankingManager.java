package br.com.ibm.s2m.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsRankingManager {
	public static WebElement element_headerRankingManager(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/incident-management/tickets-management/reduction-goal-overview/div/div[1]"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;

	}
}
