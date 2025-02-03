package com.java.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

//		PriorityQueue<Integer> queue = new PriorityQueue<>();//Min Heap tree
		PriorityQueue<Integer> maxHeapQueue = new PriorityQueue<>(Collections.reverseOrder());//Max Heap tree


		maxHeapQueue.add(4);
		maxHeapQueue.add(423);
		maxHeapQueue.add(43423);
		maxHeapQueue.add(-14);
		maxHeapQueue.add(23);
		maxHeapQueue.add(-12);
		
		System.out.println(maxHeapQueue);
		System.out.println(maxHeapQueue.poll());
		System.out.println(maxHeapQueue);
		System.out.println(maxHeapQueue.poll());
		System.out.println(maxHeapQueue);
		System.out.println(maxHeapQueue.poll());
		System.out.println(maxHeapQueue);
		System.out.println(maxHeapQueue.peek());
		System.out.println(maxHeapQueue);

	}

}
