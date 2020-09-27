package br.com.shopcart.delivery.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utilitarios {

	public static Boolean VerificaObjetoValido(Object obj) {
		return obj != null;
	}

	public static Boolean VerificaObjetoValido(String obj) {
		return obj != null && obj.length() > 0;
	}

	public static boolean kill(String processo) {
		try {
			String line;
			Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = input.readLine()) != null) {
				if (!line.trim().equals("")) {
					if (line.substring(1, line.indexOf("\"", 1)).equalsIgnoreCase(processo)) {
						Runtime.getRuntime().exec("taskkill /F /IM " + line.substring(1, line.indexOf("\"", 1)));
						System.out.println("processo " + "  " + processo + " " + "finalizado com sucesso");
						return true;

					}
				}
			}
			input.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
		return false;
	}

}
