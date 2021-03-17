package com.basic;

public class YieldExample extends Thread{

	public void run() {
		
		for(int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName()+" run method");
		}
	}
	
	public static void main(String[] args) {
		YieldExample t1 = new YieldExample();
		t1.setName("Thread-t1");
		YieldExample t2 = new YieldExample();
		t2.setName("Thread-t2");
		
		t1.start();
		t2.start();
		
		for(int i=0; i<3; i++) {
			// control passes to child thread
		
			t2.yield();
			t1.yield();
			System.out.println(Thread.currentThread().getName()+" in control");
		}
		
	}

}
