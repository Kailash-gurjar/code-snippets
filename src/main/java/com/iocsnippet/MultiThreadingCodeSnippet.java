package com.iocsnippet;

import java.sql.SQLException;

public class MultiThreadingCodeSnippet {
	public static void main(String args[]) throws SQLException {
		int n = 10; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MultithreadingDemo extends Thread {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

			
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}