package br.com.ibm.s2m.risksEHT;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsAvailabilityEnvironment;
import br.com.ibm.s2m.pageobjects.pageObjectsMenu;
import br.com.ibm.s2m.pageobjects.pageObjectsSidefilter;

public class validarN1eN2RiscosEHT extends TestBase {
	@Test(description = "S2M74-CT01-Validar N1 e N2 na tela de Riscos EHT")
	public void test() throws InterruptedException {
		setUrl();
		Metods.waitElementOverviewLink(getDriver());
		Thread.sleep(10000);
		pageObjectsMenu.element_linkRisksEHT(getDriver()).click();
		Thread.sleep(10000);
		pageObjectsSidefilter.element_buttonSidefilter(getDriver()).click();
		Thread.sleep(5000);
		Assert.assertTrue(pageObjectsSidefilter.element_divSidefilter(getDriver()).getText().contains("Visão Gestor"));
		Assert.assertTrue(pageObjectsSidefilter.element_divSidefilter(getDriver()).getText().contains("Visão N2"));
		Assert.assertTrue(pageObjectsSidefilter.element_divSidefilter(getDriver()).getText().contains("Agrupado por N1"));
	}

}
