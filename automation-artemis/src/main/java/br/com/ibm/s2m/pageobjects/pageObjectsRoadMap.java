package br.com.ibm.s2m.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObjectsRoadMap {

	public static WebElement element_titleRoadMap(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath(
					"/html/body/app/div[1]/div/main/div/delivery-roadmap-view/delivery-" + "roadmap-header/div/div"));
			
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_date(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/main/div/delivery-roadmap-view/delivery-"
					+ "roadmap-header/div/div/div[1]/div[1]/select"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_listProjectRoadmap(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/main/div/delivery-roadmap-view/delivery-"
					+ "roadmap-list/div/div/div[2]"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_listProjectRoadmapItem(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/main/div/delivery-roadmap-"
					+ "view/delivery-roadmap-list/div/div/div[2]/div[2]/div[1]"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_listProjectRoadmapItemIcon(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/main/div/delivery-roadmap-view/"
					+ "delivery-roadmap-list/div/div/div[2]/div[1]/div[1]/div[2]/i"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_titleMonthActual(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/main/div/delivery-roadmap-view/"
					+ "delivery-roadmap-list/div/div/div[1]/div[2]/div[9]/span/span[1]"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_tooltipRoadMapButton(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/main/div/delivery-"
					+ "roadmap-view/delivery-roadmap-list/div/tooltip-roadmap/div"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_linkTooltipRoadMapButton(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/main/div/delivery-"
					+ "roadmap-view/delivery-roadmap-list/div/tooltip-roadmap/div/div[4]/span/a"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
}
