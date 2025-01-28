package com.calculadora;

public class Division extends Operacion{

	public Division(int x, int y) {
		super(x, y);
	}

	@Override
		public void ejecutar() throws ArithmeticException, NumerosNegativosException, NumerosFueraDeRangoException, NumberFormatException {
		validarOperacion();
		int resultado = x/y;
		System.out.println("Resultado de la división: " + resultado);
		}

}
