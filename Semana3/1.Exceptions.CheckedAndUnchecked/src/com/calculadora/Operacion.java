package com.calculadora;

public abstract class Operacion {

	int x;
	int y;
	
	
	//constructor
	public Operacion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	//método abstract
	public abstract void ejecutar() throws ArithmeticException, NumerosNegativosException, NumerosFueraDeRangoException, NumberFormatException;
	
	 // Método para validar la operación antes de ejecutarla
    public void validarOperacion() throws ArithmeticException, NumerosNegativosException, NumerosFueraDeRangoException, NumberFormatException {
        if (this instanceof Division) {
            if (y == 0) {
                throw new ArithmeticException("No es posible dividir entre cero.");
            } else if (x < 0 | y<0){
            	throw new NumerosNegativosException("No es posible utilizar números negativos.");	
            }
        } else if (this instanceof Suma) {
            if (x < 0 | y<0) {
                throw new NumerosNegativosException("No es posible utilizar números negativos.");
            }else if (x > 1000 | y>1000) {
                throw new NumerosFueraDeRangoException ("No es posible utilizar números mayores a 1000.");
            }
            else if (Double.isNaN(x) | Double.isNaN(y)) {
            	 throw new NumberFormatException("Formato de números no válido");
            }
        }}}
