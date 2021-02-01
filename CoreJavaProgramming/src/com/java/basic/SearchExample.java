package com.java.basic;

public class SearchExample {

	public static void main(String[] args) {
		int intArray[] = {34, 67, 81, 97, 45, 54, 90, 83};
		int searchNumber = 54;
		
		boolean flag = false;
		int position = 0;
		
		for (int index = 0; index < intArray.length; index++)
		{
			if(searchNumber == intArray[index])
			{
				flag = true;
				position = index;
				break;
			}
		}
		
		if(flag)
			System.out.println("SEARCH NUMBER FOUND AT POSTION: "+position);
		else
			System.out.println("SEARCH NUMBER NOT FOUND");
	}

}
