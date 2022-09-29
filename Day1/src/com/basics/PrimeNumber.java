package com.basics;

public class PrimeNumber {

	public static void main(String[] args) {
		int no=8;
		int temp=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
				
			}
		}
		if(temp==0)
		{
			System.out.println(no+"  Number is Prime");
		}
		else
		{
			System.out.println(no+" Number is not Prime");
		}

	}

}
