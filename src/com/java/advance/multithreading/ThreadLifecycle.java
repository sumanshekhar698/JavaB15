package com.java.advance.multithreading;

public class ThreadLifecycle {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START");

		
		MyThread t1 = new MyThread();
		
		System.out.println(t1.getState());//NEW
		t1.start();
		System.out.println(t1.getState());//RUNNABLE
		
		System.out.println("main thread state :: "+Thread.currentThread().getState());
		System.out.println(t1.getState());//TIMED_WAITING


		t1.join();
		
		System.out.println("END");
		System.out.println(t1.getState());//TERMINATED


	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("run() <<");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("run() >>");

	}

}
