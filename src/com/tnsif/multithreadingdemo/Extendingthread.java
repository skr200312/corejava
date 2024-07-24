package com.tnsif.multithreadingdemo;
//multithreading demo

public class Extendingthread extends Thread{
	public void run() {     // running state
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		Extendingthread e=new Extendingthread();// new state
		
		e.start();// runnable state
		
		
		
	}

}
