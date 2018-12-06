package br.com.ibm.s2m.heatMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.pageObjectsMenu;


public class validarTextoHeatMapdeCanais extends TestBase {
	@Test(description = "Validar alteração do texto de Indisponibilidade de canais para HeatMap de canais")
	public void test() throws InterruptedException {
		setUrl();
		Metods.waitElementOverviewLink(getDriver());
		Thread.sleep(10000);
		pageObjectsMenu.element_buttonHeatMapLink(getDriver()).click();
		Thread.sleep(10000);
		Assert.assertTrue(getDriver().getPageSource().contains("HeatMap"));
		
	}

}
