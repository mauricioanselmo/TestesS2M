package br.com.s2m.statusactionplan;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import br.com.ibm.s2m.models.Metods;
import br.com.ibm.s2m.models.TestBase;
import br.com.ibm.s2m.pageobjects.PageObjectsStatusComboGestorResponsavel;


// TESTE OK
public class StatusActionPlanComboGestorResponsavel extends TestBase {
	@Test
	public void primeiroteste() throws Exception {
		setUrl();
		Thread.sleep(10000);
		Metods.waitElementOverviewLink(getDriver());
		//Texto Status plano de ação do menu principal
		PageObjectsStatusComboGestorResponsavel.element_linkMenuActionPlanGR(getDriver()).click();
		Thread.sleep(10000);
		
		////clica no Filtro superior direito.
		PageObjectsStatusComboGestorResponsavel.element_FilterIndexActionPlanGR(getDriver()).click();
		Thread.sleep(10000);
		
		//clica no Gestor Responsável, nada irá acontecer pq é necessário que o combo gestor da aplicação seja clicado antes.
		PageObjectsStatusComboGestorResponsavel.element_UserFilterActionPlanGR(getDriver()).click();
		Thread.sleep(10000);
		
		//Como nenhum item foi selecionado o conteúdo do gestor responsável deve permanecer GESTORES RESPONSÁVEIS.
		assertTrue(PageObjectsStatusComboGestorResponsavel.element_UserFilterActionPlanGR(getDriver()).getText().contains("Gestores responsáveis")); 
	}
}
