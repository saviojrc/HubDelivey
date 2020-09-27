package br.com.shopcart.delivery.pages;

import br.com.shopcart.delivery.pages.enums.MensagensEnum;
import br.com.shopcart.delivery.pages.framework.Tela;

public class MensagensPage extends Tela {

	public String obterMensagem(MensagensEnum mensagem) {
		waintVisibilityOfElementLocated(mensagem.getStrProperty(), mensagem.getStrValue());
		waintElementisEnable(mensagem.getStrProperty(), mensagem.getStrValue());
		moveToElementPage(mensagem.getStrProperty(), mensagem.getStrValue());
		return getPropertyObject(mensagem.getStrProperty(), mensagem.getStrValue(), "innerText");
	}

}
