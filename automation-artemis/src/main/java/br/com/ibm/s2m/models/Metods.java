package br.com.ibm.s2m.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metods extends TestBase {
    //Esperando elemento link visao geral da home
	public static void waitElementOverviewLink(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Visão Geral")));
		}catch (Exception e){
			e.getMessage();
		}	
	}
	
	public static void waitElementFilterIndexActionPlanGR(WebDriver driver) {
		try {
			System.out.println("entrei metodo jon");
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app/div[1]/div/main/div/enterprise-architecture/div")));
		}catch (Exception e){
			e.getMessage();
		}	
	}

	public static void waitElementDivStatusActionPlan(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/action-plan-status-view/section")));
		}catch (Exception e){
			e.getMessage();
		}	
	}
	
}