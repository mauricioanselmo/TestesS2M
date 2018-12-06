package br.com.ibm.s2m.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PageObjectsAvailabilityEnvironment {
	public static void element_comboboxInfra(WebDriver driver) {
		try {
			Select element = new Select (driver.findElement(By.xpath(
					"/html/body/lib-common/div[1]/div/main/div/incident-management/availability/availability-tree/div/div[1]/div[1]/select[1]")));
			String selectedComboValue = element.getFirstSelectedOption().getText();
			System.out.println(selectedComboValue);
			if (selectedComboValue.contains("Infra")) {
				Assert.assertTrue(true);	
			}else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e);
		}
	}
	
	public static void element_comboboxOfensor(WebDriver driver) {
		try {
			Select element = new Select (driver.findElement(By.xpath(
					"/html/body/lib-common/div[1]/div/main/div/incident-management/availability/availability-tree/div/div[1]/div[1]/select[2]")));
			String selectedComboValue = element.getFirstSelectedOption().getText();
			System.out.println(selectedComboValue);
			if (selectedComboValue.contains("Ofensor")) {
				Assert.assertTrue(true);	
			}else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e);
		}
	}
}
