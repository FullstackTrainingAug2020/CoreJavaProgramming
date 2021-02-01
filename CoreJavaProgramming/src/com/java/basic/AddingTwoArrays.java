package com.java.basic;

public class AddingTwoArrays {

	public static void main(String[] args) {
		 int array1[] = {1,3,5};
		 int array2[] = {2,4,7,9};
		 int array3[] = new int[array1.length+array2.length];
		 
		 for(int pos = 0; pos < array1.length; pos++)
		 {
			 array3[pos]=array1[pos];
		 }

		 for(int pos = 0; pos < array2.length; pos++)
		 {
			 array3[array1.length+pos]=array2[pos];
		 }
		 
		 for(int index = 0 ; index < array3.length; index++)
			 System.out.println(array3[index]);
	}

}
