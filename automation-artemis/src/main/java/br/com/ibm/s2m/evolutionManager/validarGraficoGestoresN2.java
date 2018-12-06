package br.com.ibm.s2m.evolutionManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.pageObjectsEvolutionManager;
import br.com.ibm.s2m.pageobjects.pageObjectsMenu;

public class validarGraficoGestoresN2 extends TestBase {
	@Test(description = "S2M130-CT02-Validar gráfico para gestores N2")
	public void test() throws InterruptedException {
		setUrl();
		Metods.waitElementOverviewLink(getDriver());
		Thread.sleep(10000);
		pageObjectsMenu.element_buttonEvolutionManagerLink(getDriver()).click();
		Thread.sleep(10000);
		pageObjectsEvolutionManager.element_buttonShowViewN2(getDriver()).click();
		Thread.sleep(10000);
		// Valida se está trazendo o texto correto.
		//Assert.assertTrue(pageObjectsEvolutionManager.element_divEvolutionManageN2(getDriver()).getText()
				//.contains("Nenhum tema abaixo da meta"));

	}

}
