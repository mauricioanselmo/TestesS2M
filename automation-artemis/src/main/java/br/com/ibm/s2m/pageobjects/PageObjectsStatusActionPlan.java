package br.com.ibm.s2m.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObjectsStatusActionPlan {
	public static WebElement element_linkMenuActionPlan(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.linkText("Status Planos de Ação"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_FilterIndexActionPlan(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/nav/div/ul/li[3]/side-filter-button/button"));
		
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
		
	public static WebElement element_UserFilterActionPlanGestorAplicacao(WebDriver driver) {
		WebElement element = null;
		try {
			 element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/side-filter/div/div[1]/div[2]/ng-component/div/div[1]/select"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_UserFilterActionPlanGestorResponsavel(WebDriver driver) {
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
			element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/side-filter/div/div[1]/div[2]/div/button[2]"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_DivResultActionPlan(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/action-plan-status-view/section/div[1]"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	
	
	
	
	
}


// 