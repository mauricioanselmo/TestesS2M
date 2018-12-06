package br.com.s2m.statusactionplan;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsStatusActionPlan;

public class StatusActionPlan extends TestBase {
	@Test
	public void primeiroteste() throws Exception {
		setUrl();
		Thread.sleep(10000);
		Metods.waitElementOverviewLink(getDriver());
		//Texto Status plano de ação do menu principal
		PageObjectsStatusActionPlan.element_linkMenuActionPlan(getDriver()).click();
		Thread.sleep(15000);
		
		//clica no Filtro superior direito.
		PageObjectsStatusActionPlan.element_FilterIndexActionPlan(getDriver()).click();
		Thread.sleep(15000);
		
		//clica no Gestor da Aplicação
		new Select(PageObjectsStatusActionPlan.element_UserFilterActionPlanGestorAplicacao(getDriver())).selectByIndex(4);;
		Thread.sleep(15000);
		
		//clica no Gestor Responsável
		new Select(PageObjectsStatusActionPlan.element_UserFilterActionPlanGestorResponsavel(getDriver())).selectByIndex(2);
		Thread.sleep(15000);
		
		PageObjectsStatusActionPlan.element_ApplyButonActionPlan(getDriver()).click();
		Thread.sleep(20000);
		Metods.waitElementDivStatusActionPlan(driver);
		assertTrue(PageObjectsStatusActionPlan.element_DivResultActionPlan(getDriver()).getText().contains("FELIPE WIDERA")); 
	}
}