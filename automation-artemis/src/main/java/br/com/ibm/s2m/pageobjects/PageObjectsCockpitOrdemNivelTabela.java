package br.com.ibm.s2m.pageobjects;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Texto  COCKIPIT DO GESTOR do menu principal
public class PageObjectsCockpitOrdemNivelTabela {
	public static WebElement element_linkMenuCockpit(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.linkText("COCKPIT DO GESTOR"));

		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	// clica no Filtro superior direito.
	public static WebElement element_FilterIndexCockipit(WebDriver driver) {
		
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/nav/div/ul/li[3]/side-filter-button/button"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	// seleciona gestor
	public static WebElement element_FilterIndexCockipitGestor(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath(
					"/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/side-filter/div/div[1]/div[2]/ng-component/div/select"));
			// System.out.println(element.getText());
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_ApplyCockipit(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath(
					"/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/side-filter/div/div[1]/div[2]/div/button[2]"));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	// SELECIONA TERCEIRO ITEM DA TABELA
	public static WebElement element_FilterIndexActionPlanGR(WebDriver driver) {
		WebElement element = null;
		try {

			WebElement baseTable = driver.findElement(By.className("acronym-management-list"));
			WebElement tableRow = baseTable.findElement(By.xpath(
					"/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/manager-cockpit-view/section/section/section[3]/acronym-list/section/div[2]/table/tbody/tr[3]"));
			String rowtext = tableRow.getText();
			System.out.println("Third row of table : " + rowtext);

			// to get 3rd row's 2nd column data
			element = tableRow.findElement(By.xpath(
					"/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/manager-cockpit-view/section/section/section[3]/acronym-list/section/div[2]/table/tbody/tr[3]/td[2]"));
			String valueIneed = element.getText();
			System.out.println("Cell value is : " + valueIneed);
			// cellIneed.click();

			// FUNCIONANDO TRAZ TUDO
			/*
			 * int index = 3; WebElement baseTable =
			 * driver.findElement(By.className("acronym-management-list")); List<WebElement>
			 * tableRows = baseTable.findElements(By.tagName("tr")); for (WebElement row :
			 * tableRows) { if (row.isDisplayed()) {
			 * System.out.println(tableRows.get(index).getText()); } index++; }
			 * 
			 */} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	public static WebElement element_IntelectualCapital(WebDriver driver) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath(
					"/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/app-acronym-sheet-view/section/section[2]/tabs/div/ul/li[4]"));
			System.out.println(element.getText());
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	
	
	
	
	// SOMA COLUNA 7 DA TABELA E COMPARA COM A RÉGUA.

	// SELECIONA TERCEIRO ITEM DA TABELA
	public static boolean element_SumFichaDaSigla(WebDriver driver) {
		boolean retorno = false;
		
		//List fixa para batimento
		List<String> nivelPadrao = new LinkedList<>();
		nivelPadrao.add("Especialista");
		nivelPadrao.add("Avançado");
		nivelPadrao.add("Intermediário");
		nivelPadrao.add("Básico");

	//	System.out.println(nivelPadrao.get(0));
	//	System.out.println(nivelPadrao.get(1));

		List<String> nivelDeConhecimento = new LinkedList<>();
		
//		System.out.println("Primeira Lista " + nivelPadrao.toString());
		try {
			//Varre a tabela preenchendo a lista os níveis encontrados.
			List<WebElement> costColumns = driver.findElements(By.className("col-knowledge"));
			if (costColumns.size() <= 1){
				retorno = true;
			}
			for (int i = 1; i <= costColumns.size() - 1; i++) {
				nivelDeConhecimento.add(costColumns.get(i).getText());
			}
			
//			System.out.println("Comparacao equals  nivelPadrao.get(0)" + nivelPadrao.get(0));
//			System.out.println("Comparacao equals nivelDeConhecimento.get(1)" + nivelDeConhecimento.get(0));
//			System.out.println("Comparacao equals nivelDeConhecimento.get(1)" + nivelDeConhecimento.get(1));
			
//			System.out.println("Comparacao equals " + nivelPadrao.get(0).equals(nivelDeConhecimento.get(1)));

			//Compara Lista Padrão com lista encontrada para validar ordem.
//			System.out.println(nivelDeConhecimento.size());
//			System.out.println(nivelPadrao.size());
			int iterator = 0;
			if (nivelDeConhecimento.size() > 1) {
				for(int i = iterator; i <= nivelPadrao.size(); i++) {
					System.out.println("Lista NivelPadrao i " + i + " " + nivelPadrao.get(i));
					iterator++;
					for(int j = 0; j <= nivelDeConhecimento.size() - 1; j++) {
//						System.out.println("Lista Nível de Conhecimento (Tabela) j " + j +" " + nivelDeConhecimento.get(j));
						if(nivelPadrao.get(i).equals(nivelDeConhecimento.get(j))) {
							System.out.println(nivelPadrao.get(i) + " = " + nivelDeConhecimento.get(j));
							//System.out.println(nivelDeConhecimento.get(j));
//							System.out.println("int i = " +  "Iguais");
							retorno = true;
						}
					}
				}
			}
			else if (costColumns.size() <= 1){
				retorno = true;
			}
			else
			{
				retorno = false;
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		return retorno;
	}
	
}
