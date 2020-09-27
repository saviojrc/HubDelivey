package br.com.shopcart.delivery.test.run;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.shopcart.delivery.pages.CardapioPage;
import br.com.shopcart.delivery.pages.CarrinhoPage;
import br.com.shopcart.delivery.pages.MenuPage;
import br.com.shopcart.delivery.pages.Navegar;
import br.com.shopcart.delivery.pages.enums.CategoriaEnum;
import br.com.shopcart.delivery.pages.enums.MensagensEnum;
import br.com.shopcart.delivery.pages.enums.MenuEnum;
import br.com.shopcart.delivery.pages.enums.ProdutosEnum;

public class RealizarCompraDeliveryTest {

	private Navegar navegar = new Navegar();
	private CardapioPage paginaDoCardapio = new CardapioPage();
	private MenuPage menu = new MenuPage();
	private CarrinhoPage paginaDoCarinho = new CarrinhoPage();

	@Before
	public void setUp() {
		navegar.iniciarAPP();
	}

	@Test
	public void desafioUmTest() {

		paginaDoCardapio.acionarCategoria();
		paginaDoCardapio.selecionarCategoria(CategoriaEnum.DOCES);
		paginaDoCardapio.adicionarTodosOsProdutosDeUmaCategoria(CategoriaEnum.DOCES);
		menu.acionarOpcaoMenu(MenuEnum.ACESSAR_CARRINHO);
		paginaDoCarinho.adicionarProduto(ProdutosEnum.BRIGADEIRO, 4);
		paginaDoCarinho.validarQuantidadeProduto(ProdutosEnum.BRIGADEIRO, 5);
		paginaDoCarinho.finalizarCompra();
		paginaDoCarinho.validarMensagemFinalizarCompra(MensagensEnum.PEDIDO_REALIZADO_COM_SUCESSO);
		paginaDoCarinho.selecionarOpcaoFechar();

	}

	@After
	public void tearDowm() {

		navegar.fecharAPP();

	}

}
