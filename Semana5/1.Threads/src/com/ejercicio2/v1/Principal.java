package com.ejercicio2.v1;

public class Principal {

		
		public static void main(String[] args) throws InterruptedException { 
			
			Counter counter = new Counter(); 
			
			Thread t1 = new MyThread(counter); 
			Thread t2 = new MyThread(counter); 
			
			t1.start(); 
			t2.start(); 
			
			t1.join(); 
			t2.join(); 
			
			System.out.println(counter.getCount());
		
	}//main
}//Principal

	class Counter { 
		private int count = 0;

		
		//synchronized impide que dos hilos entren al mismo tiempo. En este sentido, aunque las iteracionas de cada hilo podrían intercalarse, esperarán a que se termine completamente el proceso de una para poder entrar otra. De esta manera, no se interruptiría el proceso de alguna iteración. Sin synchronized, existiría la posibilidad de que un hilo entrara justamente cuando otro está ejecutando una iteración específica, por lo que el contador podría tener en un momento, el mismo valor para el proceso de ambos hilos, lo que provocaría pérdida de valores.
		public synchronized void increment() { 
			count++; 
		}

	public int getCount() { 
		return count; 
		}
	}

	class MyThread extends Thread { 
		private Counter counter;

	public MyThread(Counter counter) {
		this.counter = counter; 
		}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increment();
			}
		}
	}
	

