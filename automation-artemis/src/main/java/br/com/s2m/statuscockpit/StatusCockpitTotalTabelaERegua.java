package br.com.s2m.statuscockpit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsCockpitTotalTabelaERegua;


public class StatusCockpitTotalTabelaERegua extends TestBase {
	@Test
	public void primeiroteste() throws Exception {
		setUrl();
		Thread.sleep(10000);
		Metods.waitElementOverviewLink(getDriver());
		
		// Texto  COCKIPIT DO GESTOR do menu principal
		PageObjectsCockpitTotalTabelaERegua.element_linkMenuCockpit(getDriver()).click();
		Thread.sleep(12000);
		
		//clica no Filtro superior direito.
		PageObjectsCockpitTotalTabelaERegua.element_FilterIndexCockipit(getDriver()).click();
		Thread.sleep(1000);

		//clica no Gestor da Aplicação
		new Select(PageObjectsCockpitTotalTabelaERegua.element_FilterIndexCockipitGestor(getDriver())).selectByIndex(12);;
		Thread.sleep(1000);
		
		//clica no APLICAR 
		PageObjectsCockpitTotalTabelaERegua.element_ApplyCockipit(getDriver()).click();
		Thread.sleep(8000);
		
		//Clica na TERCEIRA linha da lista.
		PageObjectsCockpitTotalTabelaERegua.element_FilterIndexActionPlanGR(getDriver()).click();
		Thread.sleep(8000);
		//Metods.waitElementFilterIndexActionPlanGR(getDriver());
		
		//Clica no capital Intelectual
		PageObjectsCockpitTotalTabelaERegua.element_IntelectualCapital(getDriver()).click();
		Thread.sleep(1000);
		
		//Clica na PRIMEIRA linha FICHA DA SIGLAa.
				assertTrue(PageObjectsCockpitTotalTabelaERegua.element_SumFichaDaSigla(getDriver()));
				Thread.sleep(8000);
				//Metods.waitElementFilterIndexActionPlanGR(getDriver());
		
		}
}
