package br.com.shopcart.delivery.pages.framework;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.shopcart.delivery.util.Manipulador;
import br.com.shopcart.delivery.util.Utilitarios;

public class WaintElement {

	private static WebDriver driver = getDriver();
	private static JavascriptExecutor js = ((JavascriptExecutor) driver);
	private static Integer timeOut = getTimeOut();

	private static Integer getTimeOut() {
		try {
			Properties prop = Manipulador.getProp();

			return Integer.parseInt(prop.getProperty("TIME_OUT"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public static JavascriptExecutor getJS() {
		return js;
	}

	public static synchronized WebDriver getDriver() {

		try {

			String tipoDeDriver = Manipulador.getProp().getProperty("DRIVER_SELENIUM");
			String caminhoDoDriver = Manipulador.getProp().getProperty("EXECUTAVEL_DRIVER");

			System.setProperty(tipoDeDriver, caminhoDoDriver);

			if (driver == null) {
				driver = new ChromeDriver();
			}

			return driver;

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public WebElement getWebElement(By by) {
		WebElement objhtmlWebElement = getDriver().findElement(by);
		return objhtmlWebElement;
	}

	public void waintElementisEnable(String strProperty, String strValue) {
		By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
		WebElement objhtmlWebElement = getWebElement(by);

		if (Utilitarios.VerificaObjetoValido(objhtmlWebElement)) {
			do {
				implicitlyWait(1);
			} while (!objhtmlWebElement.isEnabled());
		}

	}

	public void implicitlyWait(int timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}

	public void waintVisibilityOfElementLocated(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void waintElementToBeClickable(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.elementToBeClickable(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static void sleep(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void waintPresenceOfElementLocated(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
