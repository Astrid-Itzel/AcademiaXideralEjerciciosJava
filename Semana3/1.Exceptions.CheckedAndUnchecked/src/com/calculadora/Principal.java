package com.calculadora;

public class Principal {

	public static void main(String[] args) throws ArithmeticException, NumerosFueraDeRangoException, NumerosNegativosException, NumberFormatException {
		
		  Operacion division1 = new Division(10, 0);
	        try {
				division1.ejecutar();
				
				//ArithmeticException - Exception unchecked del paquete java.lang
			} catch (ArithmeticException e) {
				System.out.println("Excepción en División: " + e.getMessage());
				e.printStackTrace();
				
				//NumerosNegativosException - Excepcion checked creada 
			} catch (NumerosNegativosException e) {
	            System.out.println("Excepción en División (Números Negativos): " + e.getMessage());
				e.printStackTrace();
			}
				
				
	        Operacion suma1 = new Suma(10, 6);
	        try {
	            suma1.ejecutar();
	        } catch (NumerosNegativosException e) {
	            System.out.println("Excepción en Suma (Números Negativos): " + e.getMessage());
	            e.printStackTrace();
	            
	            //NumerosFueraDeRangoException - Excepcion checked creada 
	        } catch (NumerosFueraDeRangoException e) {
	            System.out.println("Excepción en Suma (Números Fuera de Rango): " + e.getMessage());
	            e.printStackTrace();
	        
	            //NumerosFueraDeRangoException - Exception unchecked del paquete java.lang
	        }catch (NumberFormatException e) {
				System.out.println("Excepción en Suma (Formato no válido): " + e.getMessage());
				e.printStackTrace();
			}
	    
	    	System.out.println("Fin del programa.");

}}
