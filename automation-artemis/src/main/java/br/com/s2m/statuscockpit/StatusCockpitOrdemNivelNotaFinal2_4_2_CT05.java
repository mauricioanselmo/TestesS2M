package br.com.s2m.statuscockpit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsEdicaoDoCampoNivelDeConhecimento_4_1_CT01;


public class StatusCockpitOrdemNivelNotaFinal2_4_2_CT05 extends TestBase {
	@Test
	public void primeiroteste() throws Exception {
		setUrl();
		Thread.sleep(10000);
		Metods.waitElementOverviewLink(getDriver());
		
		// Texto  COCKIPIT DO GESTOR do menu principal
		PageObjectsEdicaoDoCampoNivelDeConhecimento_4_1_CT01.element_linkMenuCockpit(getDriver()).click();
		Thread.sleep(15000);
		
		//clica no Filtro superior direito.
		PageObjectsEdicaoDoCampoNivelDeConhecimento_4_1_CT01.element_FilterIndexCockipit(getDriver()).click();
		Thread.sleep(1000);

		//clica no Gestor da Aplicação
		new Select(PageObjectsEdicaoDoCampoNivelDeConhecimento_4_1_CT01.element_FilterIndexCockipitGestor(getDriver())).selectByIndex(7);;
		Thread.sleep(1000);
		
		//clica no APLICAR 
		PageObjectsEdicaoDoCampoNivelDeConhecimento_4_1_CT01.element_ApplyCockipit(getDriver()).click();
		Thread.sleep(8000);
		
		//Clica na TERCEIRA linha da lista.
		PageObjectsEdicaoDoCampoNivelDeConhecimento_4_1_CT01.element_FilterIndexActionPlanGR(getDriver()).click();
		Thread.sleep(8000);
		//Metods.waitElementFilterIndexActionPlanGR(getDriver());
		
		//Clica no capital Intelectual
		PageObjectsEdicaoDoCampoNivelDeConhecimento_4_1_CT01.element_IntelectualCapital(getDriver()).click();
		Thread.sleep(1000);
		
		//Clica na PRIMEIRA linha FICHA DA SIGLAa.
				assertTrue(PageObjectsEdicaoDoCampoNivelDeConhecimento_4_1_CT01.element_SumFichaDaSigla(getDriver()));
				Thread.sleep(8000);
				//Metods.waitElementFilterIndexActionPlanGR(getDriver());
	}
}