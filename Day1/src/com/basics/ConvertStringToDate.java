package com.basics;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConvertStringToDate {

	public static void main(String[] args) {
		
		try {
		      //define date format to take input
		      SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");

		      Scanner sc = new Scanner(System.in); //string object
		      String dtString = "";

		      System.out.print("Enter date in dd/MM/yyyy format:");
		      dtString = sc.nextLine();

		      //convert input date string into Date
		      Date dt = dateF.parse(dtString);

		      System.out.print("Entered Date is: " + dt.toString());
		    } catch (Exception e) {
		      System.out.println("Exception is: " + e.toString());
		    }
	}
}

