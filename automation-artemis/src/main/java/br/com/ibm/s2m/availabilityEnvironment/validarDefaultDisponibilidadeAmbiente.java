package br.com.ibm.s2m.availabilityEnvironment;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsAvailabilityEnvironment;
import br.com.ibm.s2m.pageobjects.pageObjectsMenu;

public class validarDefaultDisponibilidadeAmbiente extends TestBase {
	@Test(description = "S2M59-CT01-Validar mudança de default da tela de disponibilidade de ambientes para infra e ofensor")
	public void test() throws InterruptedException {
		setUrl();
		Metods.waitElementOverviewLink(getDriver());
		Thread.sleep(10000);
		pageObjectsMenu.element_linkAvailabilityEnvironment(getDriver()).click();
		Thread.sleep(10000);
		PageObjectsAvailabilityEnvironment.element_comboboxInfra(getDriver());
		PageObjectsAvailabilityEnvironment.element_comboboxOfensor(getDriver());
		Thread.sleep(10000);
	}

}
