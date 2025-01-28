package com.calculadora;

//Checked exception 
public class NumerosFueraDeRangoException extends Exception {
    public NumerosFueraDeRangoException (String mensaje) {
        super(mensaje);
    }
}
