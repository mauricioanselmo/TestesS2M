package br.com.ibm.s2m.rankingManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsAvailabilityEnvironment;
import br.com.ibm.s2m.pageobjects.PageObjectsRankingManager;
import br.com.ibm.s2m.pageobjects.pageObjectsMenu;

public class validarNomeTelaRanking extends TestBase {
	@Test(description = "S2M72-CT01-Validar troca de titulo para RANKING DO GESTOR da tela de ranking de incidentes")
	public void test() throws InterruptedException {
		setUrl();
		Metods.waitElementOverviewLink(getDriver());
		Thread.sleep(10000);
		pageObjectsMenu.element_linkRankingIncidents(getDriver()).click();
		Thread.sleep(10000);
		Assert.assertTrue(PageObjectsRankingManager.element_headerRankingManager(getDriver()).getText().contains("RANKING DO GESTOR"));
	}

}
