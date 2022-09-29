package com.basics;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ConvertArrayListToArray {

	public static void main(String[] args) {
		
		 // create an array
	    String[] array = {"Java", "Python", "C"};
	    System.out.println("Array: " + Arrays.toString(array));

	    // convert array to list
	    List languages= new ArrayList<>(Arrays.asList(array));

	    System.out.println("List: " + languages);

	  }
	}