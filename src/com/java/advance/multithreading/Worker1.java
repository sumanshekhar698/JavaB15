package com.java.advance.multithreading;

public class Worker1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i + " " + Thread.currentThread());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	

}
