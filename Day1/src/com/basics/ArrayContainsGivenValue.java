package com.basics;
import java.util.Scanner;
public class ArrayContainsGivenValue {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int find,i;
		boolean found=false;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number to find:");
		find = s.nextInt();
		for (i=0;i<=arr.length;++i)
		{
			if (arr[i] == find) {
				found = true;
		        break;
			}
		}
		if(found)
			System.out.println(find + " is found in array list.");
		else
			System.out.println(find + " is not found in list.");
	}
}
