package com.java.thread.practice;

import com.java.thread.practice.model.LongWrapper;

public class RaceCondition {

	public static void main(String[] args) throws Exception {

		LongWrapper l = new LongWrapper(0L);

		Runnable r = () -> {
			for (int i = 0; i < 1_000; i++) {
				l.incrementValue();
			}
		};
		Thread[] threads = new Thread[1_000];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(r);
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		System.out.println(l.getValue());
	}

}
