package com.archivo;

public class ContraseñaIncorrectaException extends Exception{
    public ContraseñaIncorrectaException (String mensaje) {
        super(mensaje);
}
}