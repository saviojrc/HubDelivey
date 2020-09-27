package br.com.shopcart.delivery.pages.enums;

public enum MenuEnum {
	
	VOLTAR(".id","back-btn"),
	ACESSAR_CARRINHO(".id","cart-btn");
	
	private String strProperty;
	private String strValue;
	
	
	MenuEnum(String strProperty,String strValue) {
		this.strProperty=strProperty;
		this.strValue=strValue;
	}
	
	public String getStrProperty() {
		return strProperty;
	}

	public String getStrValue() {
		return strValue;
	}

}
