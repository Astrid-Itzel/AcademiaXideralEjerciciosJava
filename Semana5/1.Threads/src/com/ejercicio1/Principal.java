package com.ejercicio1;

public class Principal {

	public static void main(String[] args) {

		 Thread t1 = new MyThread(); 
		 Thread t2 = new MyThread(); 
		 t1.start(); 
		 t2.start(); 
		 }
	} //main

	class MyThread extends Thread {
		public void run() {
			System.out.println("Thread is running");
			}
	
		//"Thread is running" es impreso dos veces en orden aleartorio
		
} //Principal
