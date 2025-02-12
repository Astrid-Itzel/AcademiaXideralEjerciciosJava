package com.ejercicio2.v2;

public class Principal {

		
		public static void main(String[] args) throws InterruptedException { 
			
			Counter counter = new Counter(); 
			
			//creamos los hilos
			Thread t1 = new MyThread(counter); 
			Thread t2 = new MyThread(counter); 
			
			//nombramos los hilos
			t1.setName("Hilo 1");
			t2.setName("Hilo 2");
			
			//iniciamos los hilos
			t1.start(); 
			t2.start(); 
			
			t1.join(); 
			t2.join(); 
			
			System.out.println(counter.getCount());
		
	}//main
}//Principal

	class Counter { 
		private int count = 0;

		
		//public synchronized void increment() { 
		public void increment() { 
			//sin synchronized, existe la posibilidad de que los hilos se interrumpan y provoquen la pérdida de valores.  
		count++; 
		//imprimimos la cuenta más el nombre del hilo que está trabajando
        System.out.println(Thread.currentThread().getName() + " : " + count);

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
		for (int i = 0; i < 10000; i++) {
			counter.increment();
			}
		}
	}
	

