package br.com.shopcart.delivery.pages.framework;

import org.junit.Assert;

import br.com.shopcart.delivery.util.Utilitarios;

public class VerificationPoint extends Assert {

	public static void verificationPointConditional(boolean currentValue, boolean expectedValue) {
		try {

			currentValue = Utilitarios.VerificaObjetoValido(currentValue) ? currentValue : false;

			expectedValue = Utilitarios.VerificaObjetoValido(expectedValue) ? expectedValue : false;
			printValues(currentValue, expectedValue);
			assertEquals(currentValue, expectedValue);

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public static void verificationPointConditionalString(String currentValue, String expectedValue) {
		try {

			currentValue = Utilitarios.VerificaObjetoValido(currentValue) ? currentValue.trim() : "";
			expectedValue = Utilitarios.VerificaObjetoValido(expectedValue) ? expectedValue.trim() : "";
			printValues(currentValue, expectedValue);
			boolean iguais = currentValue.trim().equalsIgnoreCase(expectedValue.trim());
			assertEquals(true, iguais);

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public static void verificationPointConditionalDouble(Double currentValue, Double expectedValue) {
		try {

			currentValue = Utilitarios.VerificaObjetoValido(currentValue) ? currentValue : 0.00;
			expectedValue = Utilitarios.VerificaObjetoValido(expectedValue) ? expectedValue : 0.00;
			printValues(currentValue, expectedValue);
			assertEquals(currentValue, expectedValue);

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	private static void printValues(Double currentValue, Double expectedValue) {
		System.out.println("currentValue " + " > " + " " + currentValue + " expectedValue   " + " > " + expectedValue);

	}

	private static void printValues(String currentValue, String expectedValue) {
		System.out.println("currentValue " + " > " + " " + currentValue + " expectedValue   " + " > " + expectedValue);

	}

	private static void printValues(boolean currentValue, boolean expectedValue) {
		System.out.println("currentValue " + " > " + " " + currentValue + " expectedValue   " + " > " + expectedValue);
	}

}
