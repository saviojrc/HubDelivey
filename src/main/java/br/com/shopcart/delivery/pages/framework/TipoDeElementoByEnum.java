package br.com.shopcart.delivery.pages.framework;

import org.openqa.selenium.By;

public enum TipoDeElementoByEnum {

	ID(".id") {

		@Override
		public By obterValorBy(String strValue) {
			// TODO Auto-generated method stub
			return By.id(strValue);
		}
	},
	CSSSELECTOR(".cssSelector") {

		@Override
		public By obterValorBy(String strValue) {
			// TODO Auto-generated method stub
			return By.cssSelector(strValue);
		}
	},
	NAME(".name") {
		@Override
		public By obterValorBy(String strValue) {
			// TODO Auto-generated method stub
			return By.name(strValue);
		}
	},
	CLASSNAME(".className") {
		@Override
		public By obterValorBy(String strValue) {
			// TODO Auto-generated method stub
			return By.className(strValue);
		}
	},
	XPATH(".xpath") {
		@Override
		public By obterValorBy(String strValue) {
			// TODO Auto-generated method stub
			return By.xpath(strValue);
		}
	},
	LINKTEXT(".linkText") {

		@Override
		public By obterValorBy(String strValue) {
			// TODO Auto-generated method stub
			return By.linkText(strValue);
		}
	},
	PARTIALLINKTEXT(".partialLinkText") {

		@Override
		public By obterValorBy(String strValue) {
			// TODO Auto-generated method stub
			return By.partialLinkText(strValue);
		}
	},
	TAGNAME(".tagName") {
		@Override
		public By obterValorBy(String strValue) {
			// TODO Auto-generated method stub
			return By.tagName(strValue);
		}

	};

	private String strProp;

	TipoDeElementoByEnum(String strProp) {
		this.strProp = strProp;
	}

	public String getStrProp() {
		return strProp;
	}

	public By obterValorBy(String strValue) {
		return null;
	}

	public static By getTipoDeElemento(String strProp, String strValue) {

		for (int i = 0; i < values().length; i++) {
			TipoDeElementoByEnum objHtmlElement = values()[i];

			if (objHtmlElement.getStrProp().trim().equalsIgnoreCase(strProp.trim())) {
				return objHtmlElement.obterValorBy(strValue);
			}

		}

		return null;
	}

}
