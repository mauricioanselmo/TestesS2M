package br.com.s2m.statuscockpit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsCockpitOrdemNivelNotaFina_2_3_CT04;


public class StatusCockpitTotalTabelaERegua_2_3_CT04 extends TestBase {
	@Test
	public void primeiroteste() throws Exception {
		setUrl();
		Thread.sleep(10000);
		Metods.waitElementOverviewLink(getDriver());
		
		// Texto  COCKIPIT DO GESTOR do menu principal
		PageObjectsCockpitOrdemNivelNotaFina_2_3_CT04.element_linkMenuCockpit(getDriver()).click();
		Thread.sleep(12000);
		
		//clica no Filtro superior direito.
		PageObjectsCockpitOrdemNivelNotaFina_2_3_CT04.element_FilterIndexCockipit(getDriver()).click();
		Thread.sleep(1000);

		//clica no Gestor da Aplicação
		new Select(PageObjectsCockpitOrdemNivelNotaFina_2_3_CT04.element_FilterIndexCockipitGestor(getDriver())).selectByIndex(12);;
		Thread.sleep(1000);
		
		//clica no APLICAR 
		PageObjectsCockpitOrdemNivelNotaFina_2_3_CT04.element_ApplyCockipit(getDriver()).click();
		Thread.sleep(8000);
		
		//Clica na TERCEIRA linha da lista.
		PageObjectsCockpitOrdemNivelNotaFina_2_3_CT04.element_FilterIndexActionPlanGR(getDriver()).click();
		Thread.sleep(8000);
		//Metods.waitElementFilterIndexActionPlanGR(getDriver());
		
		//Clica no capital Intelectual
		PageObjectsCockpitOrdemNivelNotaFina_2_3_CT04.element_IntelectualCapital(getDriver()).click();
		Thread.sleep(1000);
		
		//Clica na PRIMEIRA linha FICHA DA SIGLAa.
				assertTrue(PageObjectsCockpitOrdemNivelNotaFina_2_3_CT04.element_SumFichaDaSigla(getDriver()));
				Thread.sleep(8000);
				//Metods.waitElementFilterIndexActionPlanGR(getDriver());
		
		}
}
