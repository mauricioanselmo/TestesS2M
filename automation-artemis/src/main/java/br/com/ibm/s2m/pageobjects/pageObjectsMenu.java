package br.com.ibm.s2m.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObjectsMenu {
	
	 //links via menu lateral
		public static WebElement element_buttonMenu(WebDriver driver) {
			WebElement element = null;
			try {
				element = driver.findElement(By.xpath("//*[@id=\"s2mHeader\"]/div[1]/i"));

			} catch (Exception e) {
				e.getMessage();
			}
			return element;
		}

		public static WebElement element_buttonOverview(WebDriver driver) {
			WebElement element = null;
			try {
				element = driver
						.findElement(By.xpath("/html/body/app/div[1]/div/menu/nav/ul/li[1]/ul/li[1]/ul/li[1]/a"));
			} catch (Exception e) {
				e.getMessage();
			}
			return element;
		}

	public static WebElement element_buttonMenuPortifolioProjects(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.cssSelector(
					"body > app > div.mdl-layout__" + "container > div > menu > nav > ul > li:nth-child(2) > span"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonMenuRoadMap(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.cssSelector("body > app > div.mdl-layout__"
					+ "container > div > menu > nav > ul > li.item-level-1.open > ul > li:nth-child(3) > a"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonPortfolioExecutiveTI(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.cssSelector("body > app > div.mdl-layout__"
					+ "container > div > menu > nav > ul > li.item-level-1.open > ul > li:nth-child(4) > a"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonManagementService(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/menu/nav/ul/li[1]/span"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonManagementIncidents(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/menu/nav/ul/li" + "[1]/ul/li[1]/span"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonAvailability(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]/div/menu/nav" + "/ul/li[1]/ul/li[2]/span"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonHeatMap(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.xpath("/html/body/app/div[1]/div/menu" + "/nav/ul/li[1]/ul/li[2]/ul/li[4]/a"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonQualityView(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]" + "/div/menu/nav/ul/li[9]/span"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonQualifier(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/app/div[1]" + "/div/menu/nav/ul/li[9]/ul/li[3]/span"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_buttonEvolutionManager(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.xpath("/html/body/app/div[1]" + "/div/menu/nav/ul/li[9]/ul/li[3]/ul/li[2]/a"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
		
	}
	
	//Links via tela da home
	//Link Visao geral da Home
	public static WebElement element_buttonOverviewLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("Visão Geral"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_buttonOpenLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("Em Aberto"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_buttonHistoricLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("Histórico"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_buttonSLAConsolidatedLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("SLA Consolidado"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_buttonSLAIncidentsLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("SLA de Incidentes"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_buttonIncidentsAplicationLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("Incidentes por Aplicação"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	
	public static WebElement element_buttonReductionGoalLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("Meta de Redução"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	//link Heatmap de canais da Home
	public static WebElement element_buttonHeatMapLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("Heatmap de Canais"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}
	//Link Evolução por gestor na Home
	public static WebElement element_buttonEvolutionManagerLink(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("Evolução por Gestor"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
		
	}
	
	public static WebElement element_linkAvailabilityEnvironment(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("Disponibilidade de Ambientes"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
		
	}
	
	public static WebElement element_linkRankingIncidents(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("RANKING DE INCIDENTES"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
		
	}
	public static WebElement element_linkRisksEHT(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver
					.findElement(By.linkText("RISCOS EHT"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
		
	}
	

}