package com.basics;

import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		String input,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		input=sc.nextLine();
		int length=input.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+input.charAt(i);
		}
		if(input.equals(reverse))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}
}

