package com.java.advance.multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");
		System.out.println(Thread.currentThread().getName());

		Worker1 w1 = new Worker1();
//		w1.run();
		w1.start();

		Thread t1 = new Thread(new Work());//Priority Range [1,10]  Default Priority is 5
		t1.setName("t1");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 8; i++) {
				try {
					Thread.sleep(500);
					System.out.println(i + " " + Thread.currentThread());//0 Thread[#33,t1,5,main] :: thread Name,thread priority,parent thread]
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.setName("t2");
		t2.start();

		System.out.println("END");

	}

}
