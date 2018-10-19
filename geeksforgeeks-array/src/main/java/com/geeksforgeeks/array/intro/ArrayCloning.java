package com.geeksforgeeks.array.intro;

public class ArrayCloning {

	public static void main(String[] args) {

		int orgArray[] = {1, 2, 3};
		int cloneArray[] = orgArray.clone();	//Deep Copy
		
		System.out.println(orgArray == cloneArray);
		
		for(int i = 0;i < cloneArray.length;i++)
			System.out.println(cloneArray[i]);
		
		
		int orgArr[][] = {
				{1, 2, 3},
				{4, 5}
		};
		int cloneArr[][] = orgArr.clone();	//Shallow Copy
		
		System.out.println(orgArr == cloneArr);
		System.out.println(orgArr[0] == cloneArr[0]);
		
	}
}
