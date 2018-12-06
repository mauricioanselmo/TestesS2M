package br.com.ibm.s2m.sideFilter;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.pageObjectsMenu;
import br.com.ibm.s2m.pageobjects.pageObjectsSidefilter;

public class validarVisaoGestorSidefilter extends TestBase {
	
	@Test(description = "Validar opções de visão gestor no sidefilter das páginas de incidentes")
	public void test() throws InterruptedException {
	setUrl();
	Metods.waitElementOverviewLink(getDriver());
	Thread.sleep(5000);
	pageObjectsMenu.element_buttonOverviewLink(getDriver()).click();
	Thread.sleep(5000);
	pageObjectsSidefilter.element_buttonSidefilter(getDriver()).click();
	Thread.sleep(10000);
	pageObjectsSidefilter.element_comboBoxDeliveryManagerN1N2(getDriver(), 21);
	Thread.sleep(10000);
	pageObjectsSidefilter.element_radioCheckButtonSidefilter(getDriver(), "Agrupado por N1");
	Thread.sleep(10000);
	pageObjectsSidefilter.element_comboBoxDeliveryManagerN1(getDriver(), 13);
    
	
	}
}
