package com.java.thread.practice;

public class FirstRunnable {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("I am running in " + Thread.currentThread().getName());
		};
		Thread thread = new Thread(runnable);
		thread.setName("thread1");
		thread.start();
		//thread.run();
	}
}
