package com.java.thread.practice;

import com.java.thread.practice.model.Test;

public class DeadLock {

	public static void main(String[] args) throws Exception {

		Test test = new Test();

		Runnable r1 = () -> test.method1();
		Runnable r2 = () -> test.method2();

		Thread t1 = new Thread(r1);
		t1.start();

		Thread t2 = new Thread(r2);
		t2.start();

		t1.join();
		t2.join();
	}

}
