package com.calculadora;

public class Suma extends Operacion{

	public Suma(int x, int y) {
		super(x, y);
	}

	@Override
    public void ejecutar() throws NumerosNegativosException, NumerosFueraDeRangoException, ArithmeticException, NumberFormatException {
		validarOperacion();
        int resultado = x + y;
        System.out.println("Resultado de la suma: " + resultado);
    }
}
