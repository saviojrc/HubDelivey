package br.com.shopcart.delivery.pages.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.shopcart.delivery.util.Utilitarios;

public class Tela extends WaintElement {

	public Boolean verifyIsSelected(String strProperty, String strValue) {
		try {
			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			return objhtmlWebElement.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public Boolean verifyIsDisplayed(String strProperty, String strValue) {
		try {
			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			return objhtmlWebElement.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public Boolean verifyIsEnabled(String strProperty, String strValue) {
		try {
			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			return objhtmlWebElement.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public boolean verifyChecked(String strProperty, String strValue) {

		try {
			Boolean isSelect = getPropertyObject(strProperty, strValue, "checked").equals("checked");
			return Utilitarios.VerificaObjetoValido(isSelect) ? isSelect : false;
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public String getPropertyObject(String strProperty, String strValue, String strAtribute) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			return Utilitarios.VerificaObjetoValido(objhtmlWebElement.getAttribute(strAtribute))
					? objhtmlWebElement.getAttribute(strAtribute)
					: "";

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public String getPropertyValue(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			return objhtmlWebElement.getAttribute("value");

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void clickObject(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			objhtmlWebElement.click();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public Boolean isPropertyObjectIguaisVerify(String strProperty, String strValue, String strAtribute,
			String strValueAtribute) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			return Utilitarios.VerificaObjetoValido(objhtmlWebElement)
					? getPropertyObject(strProperty, strValue, strAtribute).trim().equalsIgnoreCase(strValueAtribute)
					: false;
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public void ClickDropDowmIndex(String strProperty, String strValue, int index) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			Select select = new Select(objhtmlWebElement);
			select.selectByIndex(index);

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void ClickDropDowm(String strProperty, String strValue, String valor) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			Select select = new Select(objhtmlWebElement);
			select.selectByVisibleText(valor);

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void setText(String strProperty, String strValue, String srtString) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			objhtmlWebElement.sendKeys(srtString);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public String getTextSelectComboBox(String strProperty, String strValue) {
		try {
			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			Select select = new Select(objhtmlWebElement);

			return select.getFirstSelectedOption().getText();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public void clickCheckBox(String strProperty, String strValue) {
		try {
			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			objhtmlWebElement.click();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void triggerEndKey() {
		getDriver().switchTo().activeElement().sendKeys(Keys.END);

	}

	public void triggerHomeKey() {
		getDriver().switchTo().activeElement().sendKeys(Keys.HOME);

	}

	public void triggerDowmKey() {
		getDriver().switchTo().activeElement().sendKeys(Keys.DOWN);

	}

	public void moveToElementPage(String strProperty, String strValue) {
		By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
		WebElement objhtmlWebElement = getWebElement(by);
		getJS().executeScript("arguments[0].scrollIntoView(true);", objhtmlWebElement);
	}

	public void clearText(String strProperty, String strValue) {

		try {
			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebElement objhtmlWebElement = getWebElement(by);

			objhtmlWebElement.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

}
