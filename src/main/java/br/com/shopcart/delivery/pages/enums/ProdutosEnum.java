package br.com.shopcart.delivery.pages.enums;

public enum ProdutosEnum {
	
	COCA_COLA_LATA(0,".cssSelector","#product-0 > div:nth-child(1) > div:nth-child(2) > h1:nth-child(1)"),
	FANTA_UVA_LATA(1,".cssSelector","#product-1 > div:nth-child(1) > div:nth-child(2) > h1:nth-child(1)"),
	AGUA_MINERAL_SEM_GAS(2,".cssSelector","#product-2 > div:nth-child(1) > div:nth-child(2) > h1:nth-child(1)"),
	RISOLE_MEDIO(3,".cssSelector","#product-3 > div:nth-child(1) > div:nth-child(2) > h1:nth-child(1)"),
	BRIGADEIRO(4,".cssSelector","#product-4 > div:nth-child(1) > div:nth-child(2) > h1:nth-child(1)"),
	ALFAJOR_DE_CHOCOLATE(5,".cssSelector","#product-5 > div:nth-child(1) > div:nth-child(2) > h1:nth-child(1)");
	
	
	
	private Integer id;
	private String strPropertyDescricaoProduto;
	private String strValueDescricaoProduto;

	ProdutosEnum(Integer id,String strPropertyDescricaoProduto,String strValueDescricaoProduto) {
		this.id=id;
		this.strPropertyDescricaoProduto=strPropertyDescricaoProduto;
		this.strValueDescricaoProduto=strValueDescricaoProduto;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	
	
	public String getStrPropertyDescricaoProduto() {
		return strPropertyDescricaoProduto;
	}
	
	public String getStrValueDescricaoProduto() {
		return strValueDescricaoProduto;
	}

}
