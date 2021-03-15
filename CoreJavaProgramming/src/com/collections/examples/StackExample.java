package com.collections.examples;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	 
			Stack<Integer> stack = new Stack<Integer>();
			
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
			
			stack.pop(); //remove the element from the stack
			
			for(int index = 0; index < stack.size(); index++) {
				System.out.println("ELEMENT : "+stack.get(index));
			}

	}

}
