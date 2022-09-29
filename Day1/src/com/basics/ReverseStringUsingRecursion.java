package com.basics;
import java.util.Scanner;
public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String sentence=sc.nextLine();
		String reversedSentence=reverse(sentence);
		System.out.println("The reversed sentence is:"+reversedSentence);
	}
	public static String reverse(String sentence)
	{
		if(sentence.isEmpty())
		{
			return sentence;
		}
		else {
			return reverse(sentence.substring(1)+sentence.charAt(0));
		}
	}
}
