package br.com.shopcart.delivery.pages.enums;

public enum CategoriaEnum {
	
	ITEM_SELECIONADO(".id","open-categories-btn","Selecione a Categoria"),
	ACIONAR_CATEGORIA(".cssSelector","#open-categories-btn",""),
	TODOS(".cssSelector","#category-all","Todos"),
	BEBIDAS(".cssSelector","#category-0","Bebidas"),
	DOCES(".cssSelector","#category-1","Doces"),
	SALGADOS(".cssSelector","#category-2","Salgados"),
	PRATOS_QUENTES(".cssSelector","#category-3","Pratos Quentes");
	
	
	private String strProperty;
	private String strValue;
	private String descricao;
	
	
	CategoriaEnum(String strProperty,String strValue,String descricao) {
		this.strProperty=strProperty;
		this.strValue=strValue;
		this.descricao=descricao;
	}
	
	public String getStrProperty() {
		return strProperty;
	}
	
	public String getStrValue() {
		return strValue;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
