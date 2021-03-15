package com.collections.examples;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		queue.remove();
		queue.remove();
		Iterator<Integer> it = queue.iterator();

		while(it.hasNext())
		{
			System.out.println("ELEMENT: "+ it.next());
		}
	}

}
