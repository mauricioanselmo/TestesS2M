package br.com.s2m.statuscockpit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsCockpitOrdemNivelNotaFinal;


public class StatusCockpitOrdemNivelNotaFinal extends TestBase {
	@Test
	public void primeiroteste() throws Exception {
		setUrl();
		Thread.sleep(10000);
		Metods.waitElementOverviewLink(getDriver());
		
		// Texto  COCKIPIT DO GESTOR do menu principal
		PageObjectsCockpitOrdemNivelNotaFinal.element_linkMenuCockpit(getDriver()).click();
		Thread.sleep(15000);
		
		//clica no Filtro superior direito.
		PageObjectsCockpitOrdemNivelNotaFinal.element_FilterIndexCockipit(getDriver()).click();
		Thread.sleep(1000);

		//clica no Gestor da Aplicação
		new Select(PageObjectsCockpitOrdemNivelNotaFinal.element_FilterIndexCockipitGestor(getDriver())).selectByIndex(7);;
		Thread.sleep(1000);
		
		//clica no APLICAR 
		PageObjectsCockpitOrdemNivelNotaFinal.element_ApplyCockipit(getDriver()).click();
		Thread.sleep(8000);
		
		//Clica na TERCEIRA linha da lista.
		PageObjectsCockpitOrdemNivelNotaFinal.element_FilterIndexActionPlanGR(getDriver()).click();
		Thread.sleep(8000);
		//Metods.waitElementFilterIndexActionPlanGR(getDriver());
		
		//Clica no capital Intelectual
		PageObjectsCockpitOrdemNivelNotaFinal.element_IntelectualCapital(getDriver()).click();
		Thread.sleep(1000);
		
		//Clica na PRIMEIRA linha FICHA DA SIGLAa.
				assertTrue(PageObjectsCockpitOrdemNivelNotaFinal.element_SumFichaDaSigla(getDriver()));
				Thread.sleep(8000);
				//Metods.waitElementFilterIndexActionPlanGR(getDriver());
	}
}