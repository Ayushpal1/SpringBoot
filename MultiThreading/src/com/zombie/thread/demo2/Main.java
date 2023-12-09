package com.zombie.thread.demo2;

public class Main {

	public static void main(String[] args) {
		Thread task = new PrimeGenerator();
		task.start();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		task.interrupt();
		System.out.printf("Main: Status of the Thread: %s\n", task.getState());
		System.out.printf("Main: IsInterrupted: %s\n", task.isInterrupted());
		System.out.printf("Main: isAlive: %s\n", task.isAlive());
	}

}
