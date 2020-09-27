package br.com.shopcart.delivery.test.run;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.shopcart.delivery.pages.CardapioPage;
import br.com.shopcart.delivery.pages.CarrinhoPage;
import br.com.shopcart.delivery.pages.MenuPage;
import br.com.shopcart.delivery.pages.Navegar;
import br.com.shopcart.delivery.pages.enums.CategoriaEnum;
import br.com.shopcart.delivery.pages.enums.MenuEnum;
import br.com.shopcart.delivery.pages.enums.ProdutoAdicionado;
import br.com.shopcart.delivery.pages.enums.ProdutosEnum;

public class RealizarCompraDeliveryEValidarEstoqueTest {

	private Navegar navegar = new Navegar();
	private CardapioPage paginaDoCardapio = new CardapioPage();
	private MenuPage menu = new MenuPage();
	private CarrinhoPage paginaDoCarinho = new CarrinhoPage();

	@Before
	public void setUp() {
		navegar.iniciarAPP();
	}

	@Test
	public void desafioDoisTest() {

		paginaDoCardapio.verificarSeTodosOsProdutosEstaoSendoExibidos();
		paginaDoCardapio.acionarCategoria();
		paginaDoCardapio.selecionarCategoria(CategoriaEnum.BEBIDAS);
		paginaDoCardapio.adicionarTodosOsProdutosDeUmaCategoria(CategoriaEnum.BEBIDAS);
		paginaDoCardapio.acionarCategoria();
		paginaDoCardapio.selecionarCategoria(CategoriaEnum.TODOS);
		paginaDoCardapio.adicionarProdutos(ProdutoAdicionado.RISOLE_MEDIO);
		menu.acionarOpcaoMenu(MenuEnum.ACESSAR_CARRINHO);
		paginaDoCarinho.adicionarProduto(ProdutosEnum.RISOLE_MEDIO, 8);
		paginaDoCarinho.removerProduto(ProdutosEnum.RISOLE_MEDIO, 5);
		paginaDoCarinho.validarQuantidadeProduto(ProdutosEnum.RISOLE_MEDIO, 4);
		paginaDoCarinho.finalizarCompra();
		paginaDoCarinho.selecionarOpcaoFechar();

	}

	@After
	public void tearDowm() {

		navegar.fecharAPP();

	}
}
