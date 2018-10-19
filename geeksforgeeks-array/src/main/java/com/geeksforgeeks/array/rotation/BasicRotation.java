package com.geeksforgeeks.array.rotation;

public class BasicRotation {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println("Before Rotation : ");
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		simpleRotation(arr, 3);	//Simple Approach. Limited to Size of Array.
		
	}
	
	public static void simpleRotation(int arr[], int rot) {
		
		int temp[] = new int[rot];
		for(int i = 0;i < temp.length;i++)
			temp[i] = arr[i];
		
		for(int i = 0;i < ( arr.length - rot );i++)
			arr[i] = arr[i+rot];
		
		for(int i = 0; i < temp.length;i++)
			arr[arr.length - rot + i] = temp[i];
		
		System.out.println("After Rotation : ");
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
	}
	
	public static void jugglingRotation(int arr[], int rot) {
		
	}
	
}
