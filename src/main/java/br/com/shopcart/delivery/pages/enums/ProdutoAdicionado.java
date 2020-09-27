package br.com.shopcart.delivery.pages.enums;

public enum ProdutoAdicionado {

	COCA_COLA_LATA(".id", "add-product-0-btn",CategoriaEnum.BEBIDAS,"Coca-cola lata"),
	FANTA_UVA_LATA(".id", "add-product-1-btn",CategoriaEnum.BEBIDAS,"Fanta uva lata"),
	AGUA_MINERAL_SEM_GAS(".id","add-product-2-btn",CategoriaEnum.BEBIDAS,"Água mineral sem gás"),
	RISOLE_MEDIO(".id","add-product-3-btn",CategoriaEnum.SALGADOS,"Rissole médio"),
	BRIGADEIRO(".id", "add-product-4-btn",CategoriaEnum.DOCES,"Brigadeiro"),
	ALFAJOR_DE_CHOCOLATE(".id","add-product-5-btn",CategoriaEnum.DOCES,"Alfajor de chocolate");
	
	
	private String descricao ;
	private String strProperty;
	private String strValue;
	private CategoriaEnum categoria;
	
		ProdutoAdicionado(String strProperty, String strValue,CategoriaEnum categoria,String descricao) {
			this.strProperty = strProperty;
			this.strValue = strValue;
			this.categoria=categoria;
			this.descricao=descricao;
	}
		
		public String getStrProperty() {
			return strProperty;
		}
		
		public String getStrValue() {
			return strValue;
		}
		
		public CategoriaEnum getCategoria() {
			return categoria;
		}
		
		public String getDescricao() {
			return descricao;
		}
		
		public static CategoriaEnum obterCategoriaPorProduto(ProdutoAdicionado produto) {
			for(ProdutoAdicionado p : values()) {
				if(p.getCategoria()==produto.getCategoria()) {
					return p.getCategoria();
				}
			}

			return null;
		}
	
}
