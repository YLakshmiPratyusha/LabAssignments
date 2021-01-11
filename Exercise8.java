/**
 * Exercise 8: Create a method that accepts a String and checks if it is a positive string.
 * A string is considered a positive string, if on moving from left to right each character
 * in the String comes after the previous characters in the Alphabetical order.
 */
package com.cg.lab3;

import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str=scanner.next();
    int len=str.length();
    if(checkString(str,len,scanner))
    	System.out.print("Positive string");
    else
    	System.out.print("Negative string");
	}
	private static boolean checkString(String str,int len,Scanner scanner){
		char []arr=str.toCharArray();
		for(int index=0;index<len-1;index++)
		{
			if(arr[index]>arr[index+1])
				return false;
		}
		return true;
	}

}