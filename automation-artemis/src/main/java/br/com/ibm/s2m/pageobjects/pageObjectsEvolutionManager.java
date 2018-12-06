package br.com.ibm.s2m.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageObjectsEvolutionManager {

	public static WebElement element_divEvolutionManager(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(
					By.xpath("/html/body/lib-common/div[1]/div/main/div/qualifier/manager-evolution-view/div"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_divEvolutionManageN2(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(
					By.xpath("/html/body/lib-common/div[1]/div/main/div/qualifier/manager-evolution-view/div/manager-evolution-card[1]/div/div[2]"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_divNoManagerGoalN1(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(
					By.xpath("/html/body/lib-common/div[1]/div/main/div/qualifier/manager-evolution-view/div/manager-evolution-card[1]/div/div[2]/manager-evolution-card[1]/div/div/div[4]/div/div/div"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_buttonShowViewN2(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(
					By.xpath("/html/body/lib-common/div[1]/div/main/div/qualifier/manager-evolution-view/div/manager-evolution-card[1]/div/div[1]/div[2]/div[2]"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
		
	}

}
