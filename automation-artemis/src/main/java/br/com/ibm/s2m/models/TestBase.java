package br.com.ibm.s2m.models;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	protected WebDriver driver;
	// protected Login Login;
	private String jobSessionId;
	private Boolean status;

	static {
		System.out.println(System.getenv("SAUCE_USERNAME"));
		System.out.println(System.getenv("SAUCE_ACCESS_KEY"));
		System.out.println(System.getenv("SAUCE_TUNNEL_HOST"));
		System.out.println(System.getenv("SAUCE_TUNNEL_PORT"));
	}

	public static final String USERNAME = System.getenv("SAUCE_USERNAME");
	public static final String ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@"+ System.getProperty("SAUCE_TUNNEL_HOST")+ ":" +System.getProperty("SAUCE_TUNNEL_PORT")+"/wd/hub";

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setSession(String string) {
		this.jobSessionId = string;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void setUrl() {
		this.driver.get("https://s2m.santanderbr.pre.corp/evolucao/#/home");
	}

	@BeforeMethod
	public void beforeMethod() throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("version", "latest");
		caps.setCapability("platform", "Windows");
		caps.setCapability("tunnelIdentifier",System.getProperty("SAUCE_TUNNEL_ID"));
		caps.setCapability("parentTunnel",System.getProperty("SAUCE_PARENT_TUNNEL"));
		caps.setCapability("name", "TesteArtemis");
		Map<String, String> sOptions = new HashMap<String, String>();
		sOptions.put("executable", "sauce-storage:automacao_senha_s2m.exe");
		sOptions.put("args", "[ '--silent', '-a', '-q' ]");
		sOptions.put("background", "true");
		caps.setCapability("prerun", sOptions);
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		this.driver = driver;
	//	setSession(extractJobSessionId());

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/Johnny/Documents/drivers/chromedriver"); this.driver = new
		 * ChromeDriver(); driver.manage().window().maximize(); ;
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 */

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
	//	setStatus(result.getStatus() == ITestResult.SUCCESS);
		//saveStatus();
		if (this.driver != null) {
			this.driver.quit();
		}
	}

	/**
	 * Configuração de status do Saucelabs para salvar os status da execução
	 */
/*	private void saveStatus() {
		if (this.driver != null) {
			try {
				String responseJson = "{\"passed\" : " + this.getStatus() + "}";
				String credentials = USERNAME + ":" + ACCESS_KEY;
				String basicAuth = "Basic " + new String(Base64.encode(credentials.getBytes()));
				HttpPut con = new HttpPut("https://saucelabs.com/rest/v1/" + USERNAME + "/jobs/" + this.jobSessionId);
				con.addHeader("Authorization", basicAuth);
				con.addHeader("Content-Type", "application/json");
				con.addHeader("Content-Lenght", responseJson.getBytes().length + "");
				con.addHeader("Content-Language", "en-US");
				con.setEntity(new StringEntity(responseJson));
				HttpResponse response = HttpClientBuilder.create().build().execute(con);
				System.out.println(response.getEntity().toString());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}*/

//	private String extractJobSessionId() {
//		return ((RemoteWebDriver) driver).getSessionId().toString();
//	}

//	private String getStatus() {
//		return new Boolean(this.status).toString();
//	}

	public WebDriver getDriver() {
		return this.driver;
	}

}
