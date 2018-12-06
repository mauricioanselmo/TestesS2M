package br.com.ibm.s2m.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsStatusComboGestorResponsavel {
	public static WebElement element_linkMenuActionPlanGR(WebDriver driver) {
		WebElement element = null;
		try {
			//
			element = driver.findElement(By.linkText("Status Planos de Ação"));
												   
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_FilterIndexActionPlanGR(WebDriver driver) {
		WebElement element = null;
		try {
			//clica no Filtro superior direito.
			element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/nav/div/ul/li[3]/side-filter-button/button"));
		
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
		
			//clica no Gestor Responsável, nada irá acontecer pq é necessário que o combo gestor da aplicação seja clicado antes.
	public static WebElement element_UserFilterActionPlanGR(WebDriver driver) {
		WebElement element = null;
		try {
			 element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/side-filter/div/div[1]/div[2]/ng-component/div/div[2]/select"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_ApplyButonActionPlan(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/main/div/enterprise-architecture/div/incident-menu-bar/div/side-filter/div/div[1]/div[2]/div/button[2]"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
		
}


// 