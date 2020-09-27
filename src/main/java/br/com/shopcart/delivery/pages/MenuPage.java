package br.com.shopcart.delivery.pages;

import br.com.shopcart.delivery.pages.enums.MenuEnum;
import br.com.shopcart.delivery.pages.framework.Tela;

public class MenuPage extends Tela {
	
	
	public void acionarOpcaoMenu(MenuEnum opcaoMenu) {
		
		waintPresenceOfElementLocated(opcaoMenu.getStrProperty(), opcaoMenu.getStrValue());
		waintElementToBeClickable(opcaoMenu.getStrProperty(), opcaoMenu.getStrValue());
		clickObject(opcaoMenu.getStrProperty(), opcaoMenu.getStrValue());
		
		
	}
	

}
