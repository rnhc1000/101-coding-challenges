package resourceSharing;

/*
 * Copyright (c) 2019-2023. Michael Pogrebinsky - Top Developer Academy
 * https://topdeveloperacademy.com
 * All rights reserved
 */

/**
 * Resource Sharing & Introduction to Critical Sections
 * https://www.udemy.com/java-multithreading-concurrency-performance-optimization
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
	InventoryCounter inventoryCounter = new InventoryCounter();
	IncrementingThread incrementingThread = new IncrementingThread(inventoryCounter);
	DecrementingThread decrementingThread = new DecrementingThread(inventoryCounter);
	long start = System.currentTimeMillis();

//	System.out.println(start);
	incrementingThread.start();
//	incrementingThread.join();

	decrementingThread.start();
	incrementingThread.join();
	decrementingThread.join();
	long end = System.currentTimeMillis();
	long timeToFinish = end - start;

	System.out.println("Time to complete: " + String.format("%d", timeToFinish) + " ms");
	System.out.println("We currently have " + inventoryCounter.getItems() + " items");
    }

    public static class DecrementingThread extends Thread {

	private InventoryCounter inventoryCounter;

	public DecrementingThread(InventoryCounter inventoryCounter) {
	    this.inventoryCounter = inventoryCounter;
	}

	@Override
	public void run() {
	    for (int i = 0; i < 10000; i++) {
		inventoryCounter.decrement();
	    }
	}
    }

    public static class IncrementingThread extends Thread {

	private InventoryCounter inventoryCounter;

	public IncrementingThread(InventoryCounter inventoryCounter) {
	    this.inventoryCounter = inventoryCounter;
	}

	@Override
	public void run() {
	    for (int i = 0; i < 10000; i++) {
		inventoryCounter.increment();
	    }
	}
    }

//    private static class InventoryCounter {
//	private int items = 0;
//
//	public synchronized void increment() {
//	    items++;
//	}
//
//	public synchronized void decrement() {
//	    items--;
//	}
//
//	public synchronized int getItems() {
//	    return items;
//	}
//    }
    private static class InventoryCounter {
	private int items = 0;
	Object lock = new Object();

	public void increment() {
	    synchronized (this.lock) {
		items++;
	    }
	}

	public void decrement() {
	    synchronized (this.lock) {
		items--;
	    }
	}

	public int getItems() {
	    synchronized (this.lock) {
		return items;
	    }
	}
    }
}
