package br.com.shopcart.delivery.pages;

import java.io.IOException;

import br.com.shopcart.delivery.pages.framework.Tela;
import br.com.shopcart.delivery.util.Manipulador;
import br.com.shopcart.delivery.util.Utilitarios;

public class Navegar extends Tela {

	public void iniciarAPP() {
		try {
			sleep(2);
			String url = Manipulador.getProp().getProperty("URL_WEB_BROWSER");
			getDriver().get(url);
			getDriver().manage().window().maximize();
			sleep(3);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fecharAPP() {
		try {
			getDriver().close();
			Utilitarios.kill("chromedriver.exe");
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
