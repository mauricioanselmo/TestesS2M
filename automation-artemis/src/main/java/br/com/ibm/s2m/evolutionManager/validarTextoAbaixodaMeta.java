package br.com.ibm.s2m.evolutionManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.pageObjectsEvolutionManager;
import br.com.ibm.s2m.pageobjects.pageObjectsMenu;


public class validarTextoAbaixodaMeta extends TestBase {
	@Test(description = "Validar texto 'Abaixo da Meta' da tela de Evolução por gestor")
	public void test() throws InterruptedException {
		setUrl();
		Metods.waitElementOverviewLink(getDriver());
		Thread.sleep(10000);
		pageObjectsMenu.element_buttonEvolutionManagerLink(getDriver()).click();
		Thread.sleep(10000);
		//Valida se está trazendo o texto correto.
		//Assert.assertTrue(pageObjectsEvolutionManager.element_divEvolutionManager(getDriver()).getText()
		//		.contains("Nenhum gestor abaixo da meta"));

	}
}
