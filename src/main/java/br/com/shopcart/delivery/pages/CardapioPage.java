package br.com.shopcart.delivery.pages;

import static org.junit.Assert.assertEquals;

import br.com.shopcart.delivery.pages.enums.CategoriaEnum;
import br.com.shopcart.delivery.pages.enums.ProdutoAdicionado;
import br.com.shopcart.delivery.pages.enums.ProdutosEnum;
import br.com.shopcart.delivery.pages.framework.Tela;

public class CardapioPage extends Tela {

	

	public void acionarCategoria() {

		waintPresenceOfElementLocated(CategoriaEnum.ACIONAR_CATEGORIA.getStrProperty(),
				CategoriaEnum.ACIONAR_CATEGORIA.getStrValue());
		waintElementToBeClickable(CategoriaEnum.ACIONAR_CATEGORIA.getStrProperty(),
				CategoriaEnum.ACIONAR_CATEGORIA.getStrValue());
		clickObject(CategoriaEnum.ACIONAR_CATEGORIA.getStrProperty(), CategoriaEnum.ACIONAR_CATEGORIA.getStrValue());

	}

	public String obterDescricaoDoProduto(ProdutosEnum produto) {
		waintPresenceOfElementLocated(produto.getStrPropertyDescricaoProduto(), produto.getStrValueDescricaoProduto());
		waintElementToBeClickable(produto.getStrPropertyDescricaoProduto(), produto.getStrValueDescricaoProduto());
		return getPropertyObject(produto.getStrPropertyDescricaoProduto(), produto.getStrValueDescricaoProduto(),
				"innerText");
	}

	public void adicionarProdutos(ProdutoAdicionado produto) {

		waintPresenceOfElementLocated(produto.getStrProperty(), produto.getStrValue());
		waintElementToBeClickable(produto.getStrProperty(), produto.getStrValue());
		clickObject(produto.getStrProperty(), produto.getStrValue());
	}

	public void selecionarCategoria(CategoriaEnum categoriaProdutos) {
		waintPresenceOfElementLocated(categoriaProdutos.getStrProperty(), categoriaProdutos.getStrValue());
		waintElementToBeClickable(categoriaProdutos.getStrProperty(), categoriaProdutos.getStrValue());
		clickObject(categoriaProdutos.getStrProperty(), categoriaProdutos.getStrValue());
	}

	public void verificarSeTodosOsProdutosEstaoSendoExibidos() {
		CategoriaEnum todosOsProdutosDisponiveis = CategoriaEnum.ITEM_SELECIONADO;

		waintPresenceOfElementLocated(todosOsProdutosDisponiveis.getStrProperty(),
				todosOsProdutosDisponiveis.getStrValue());

		String todosOsProdutos = getPropertyObject(todosOsProdutosDisponiveis.getStrProperty(),
				todosOsProdutosDisponiveis.getStrValue(), "innerText");

		assertEquals(todosOsProdutos, todosOsProdutosDisponiveis.getDescricao());
	}

	public void adicionarTodosOsProdutosDeUmaCategoria(CategoriaEnum categoria) {
		for (ProdutoAdicionado produto : ProdutoAdicionado.values()) {
			if (ProdutoAdicionado.obterCategoriaPorProduto(produto) == categoria) {
				adicionarProdutos(produto);
			}
		}
	}

}
