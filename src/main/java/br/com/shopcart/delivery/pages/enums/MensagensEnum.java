package br.com.shopcart.delivery.pages.enums;

public enum MensagensEnum {

	/**
	 * O produto '<<produto>>' foi adicionado ao carrinho
	 */
	// .Toastify__toast-body
	PEDIDO_REALIZADO_COM_SUCESSO(".cssSelector", ".sc-dNLxif","Pedido realizado com sucesso!");

	private String strProperty;
	private String strValue;
	private String nomeMensagem;

	MensagensEnum(String strProperty, String strValue,String nomeMensagem) {
		this.strProperty = strProperty;
		this.strValue = strValue;
		this.nomeMensagem=nomeMensagem;
	}

	public String getStrProperty() {
		return strProperty;
	}

	public String getStrValue() {
		return strValue;
	}
	
	public String getNomeMensagem() {
		return nomeMensagem;
	}

}
