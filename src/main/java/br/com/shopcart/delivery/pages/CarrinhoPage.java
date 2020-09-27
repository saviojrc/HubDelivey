package br.com.shopcart.delivery.pages;

import static org.junit.Assert.assertEquals;

import br.com.shopcart.delivery.pages.enums.MensagensEnum;
import br.com.shopcart.delivery.pages.enums.ProdutosEnum;
import br.com.shopcart.delivery.pages.framework.Tela;

public class CarrinhoPage extends Tela {
	
	private MensagensPage paginaDeMensagens = new MensagensPage();

	public void removerProduto(ProdutosEnum produto) {
		String strProperty = ".id";
		String strValue = "remove-product-<<id>>-qtd".replace("<<id>>", String.valueOf(produto.getId()));

		clicarNoElemento(strProperty, strValue);
	}

	public void removerProduto(ProdutosEnum produto, Integer quantidade) {
		for (int i = 0; i < quantidade; i++) {
			removerProduto(produto);
		}
	}

	public void adicionarProduto(ProdutosEnum produto) {
		String strProperty = ".id";
		String strValue = "add-product-<<id>>-qtd".replace("<<id>>", String.valueOf(produto.getId()));

		clicarNoElemento(strProperty, strValue);
	}

	public void adicionarProduto(ProdutosEnum produto, Integer quantidade) {
		for (int i = 0; i < quantidade; i++) {
			adicionarProduto(produto);
		}
	}

	private void clicarNoElemento(String strProperty, String strValue) {
		waintVisibilityOfElementLocated(strProperty, strValue);
		waintPresenceOfElementLocated(strProperty, strValue);
		moveToElementPage(strProperty, strValue);
		clickObject(strProperty, strValue);
	}

	public void finalizarCompra() {
		String strProperty = ".id";
		String strValue = "finish-checkout-button";

		clicarNoElemento(strProperty, strValue);
	}

	public void selecionarOpcaoFechar() {
		String strProperty = ".cssSelector";
		String strValue = ".close-modal";
		clicarNoElemento(strProperty, strValue);
	}

	public String obterDescricaoDoProduto(ProdutosEnum produto) {
		String strProperty = ".id";
		String strValue = "product-<<id>>-name".replace("<<id>>", String.valueOf(produto.getId()));

		return obterValorDoElemento(strProperty, strValue).trim();
	}

	public String obterQuantidadeProduto(ProdutosEnum produto) {
		String strProperty = ".id";
		String strValue = "product-<<id>>-qtd".replace("<<id>>", String.valueOf(produto.getId()));

		return obterValorDoElemento(strProperty, strValue);
	}

	private String obterValorDoElemento(String strProperty, String strValue) {
		waintVisibilityOfElementLocated(strProperty, strValue);
		waintPresenceOfElementLocated(strProperty, strValue);
		moveToElementPage(strProperty, strValue);
		return getPropertyObject(strProperty, strValue, "innerText").trim();
	}

	public String obterPrecoUnitarioProduto(ProdutosEnum produto) {
		String strProperty = ".id";
		String strValue = "product-<<id>>-price".replace("<<id>>", String.valueOf(produto.getId()));

		return obterValorDoElemento(strProperty, strValue);
	}

	public String obterSubTotalProdutos(ProdutosEnum produto) {
		String strProperty = ".id";
		String strValue = "subtotal-price";

		return obterValorDoElemento(strProperty, strValue);
	}

	public String obterTotalProdutos(ProdutosEnum produto) {
		String strProperty = ".id";
		String strValue = "price-total-checkout";

		return obterValorDoElemento(strProperty, strValue);
	}

	public void validarQuantidadeProduto(ProdutosEnum produto, Integer quantidadeEsperada) {

		Integer quantidadeAtual =Integer.parseInt(obterQuantidadeProduto(produto));
		assertEquals(quantidadeAtual, quantidadeEsperada);
	}
	
	public void validarMensagemFinalizarCompra(MensagensEnum mensagem) {
		waintVisibilityOfElementLocated(mensagem.getStrProperty(), mensagem.getStrValue());
		waintPresenceOfElementLocated(mensagem.getStrProperty(), mensagem.getStrValue());
		String mensagemAtual= paginaDeMensagens.obterMensagem(mensagem);
		String mensagemEsperada = mensagem.getNomeMensagem();
		
		assertEquals(mensagemAtual.trim(), mensagemEsperada.trim());
		
	}

}