package br.com.ibm.s2m.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Texto  COCKIPIT DO GESTOR do menu principal
public class PageObjectsCockpitOrdemNivelNotaFinal {
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
			element = driver.findElement(By.xpath(
					"/html/body/lib-common/div[1]/div/main/div/lib-s2m-enterprise-architecture/div/top-bar/div/nav/div/ul/li[3]/side-filter-button/button"));
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

		// List fixa para batimento
		ArrayList<String> nivelPadraoTerceiro = new ArrayList<>();
		nivelPadraoTerceiro.add("Especialista, 9,0");
		nivelPadraoTerceiro.add("Avançado, 5,0");
		nivelPadraoTerceiro.add("Intermediário, 3,0");
		nivelPadraoTerceiro.add("Básico, 2,0");

		ArrayList<String> nivelPadraoFuncionario = new ArrayList<>();
		nivelPadraoFuncionario.add("Especialista, 11,0");
		nivelPadraoFuncionario.add("Avançado, 7,0");
		nivelPadraoFuncionario.add("Intermediário, 5,0");
		nivelPadraoFuncionario.add("Básico, 4,0");

		ArrayList<String> nivelDeConhecimentoTer = new ArrayList<>();
		ArrayList<String> nivelDeConhecimentoFun = new ArrayList<>();

	//	System.out.println("Primeira Lista " + nivelPadraoTerceiro.toString());
		try {
			// Varre a tabela preenchendo a lista os níveis encontrados.
			List<WebElement> costColumns = driver.findElements(By.className("col-knowledge"));
			List<WebElement> notas = driver.findElements(By.className("col-score"));
			List<WebElement> tipoDeColaborador = driver.findElements(By.className("col-employee-type"));

			if (costColumns.size() <= 1) {
				retorno = true;
			}

			// nivelDeConhecimentoTer.add(costColumns.get(1).getText() + ", " +
			// String.valueOf(notas.get(1).getText()));
			// System.out.println(nivelDeConhecimentoTer.get(0));

			for (int i = 1; i < costColumns.size(); i++) {
				if (tipoDeColaborador.get(i).getText().equals("Funcionário")) {
					/*
					 * System.out.println(costColumns.get(i).getText());
					 * System.out.println(notas.get(i).getText());
					 * System.out.println(tipoDeColaborador.get(i).getText());
					 */
					nivelDeConhecimentoFun
							.add(costColumns.get(i).getText() + ", " + String.valueOf(notas.get(i).getText()));
				} else {
					/*
					 * System.out.println("Igual Terceirizado");
					 * System.out.println(costColumns.get(i).getText());
					 * System.out.println(notas.get(i).getText());
					 * System.out.println(tipoDeColaborador.get(i).getText());
					 */
					nivelDeConhecimentoTer
							.add(costColumns.get(i).getText() + ", " + String.valueOf(notas.get(i).getText()));
				}
			}

			// Compara Lista Padrão com lista encontrada para validar ordem.
//			System.out.println("nivelDeConhecimentoTer " + nivelDeConhecimentoTer.size());
//			System.out.println("nivelPadraoTerceiro " + nivelPadraoTerceiro.size());
//			System.out.println("nivelDeConhecimentoFun " + nivelDeConhecimentoFun.size());
//			System.out.println("nivelPadraoFuncionario " + nivelPadraoFuncionario.size());

			int iterator = 0;
			
			if (nivelDeConhecimentoTer.size() > 1) {
				for (int i = iterator; i < nivelPadraoTerceiro.size(); i++) {
					iterator++;
					for (int j = 0; j < nivelDeConhecimentoTer.size(); j++) {
						if (nivelPadraoTerceiro.get(i).equals(nivelDeConhecimentoTer.get(j))) {
							System.out.println(nivelPadraoTerceiro.get(i) + " = " + nivelDeConhecimentoTer.get(j));
							retorno = true;
						}
					}
				}
			}

//				System.out.println("nivelDeConhecimentoTer " + nivelDeConhecimentoTer.size());
//				System.out.println("nivelPadraoTerceiro " + nivelPadraoTerceiro.size());
//				System.out.println("nivelDeConhecimentoFun " + nivelDeConhecimentoFun.size());
//				System.out.println("nivelPadraoFuncionario " + nivelPadraoFuncionario.size());

				iterator = 0;
				System.out.println(nivelDeConhecimentoFun.size());
				if (nivelDeConhecimentoFun.size() > 1) {
					for (int i = iterator; i <= nivelPadraoFuncionario.size(); i++) {
						// System.out.println("Lista NivelPadrao i " + i + " " +
						// nivelPadraoTerceiro.get(i));
						iterator++;
						for (int j = 0; j < nivelDeConhecimentoFun.size(); j++) {
							// System.out.println("Lista Nível de Conhecimento (Tabela) j " + j +" " +
							// nivelDeConhecimentoTer.get(j));
							if (nivelPadraoFuncionario.get(i).equals(nivelDeConhecimentoFun.get(j))) {
								System.out
										.println(nivelPadraoFuncionario.get(i) + " = " + nivelDeConhecimentoFun.get(j));
								// System.out.println(nivelDeConhecimento.get(j));
//							System.out.println("int i = " +  "Iguais");
								retorno = true;
							}
						}
					}
				} else if (costColumns.size() <= 1) {
					retorno = true;
				} else {
					retorno = false;
				}
		} catch (Exception e) {
			e.getMessage();
		}
		return retorno;
	}

}
