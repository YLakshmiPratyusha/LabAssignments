/**
 * Exercise 4: Create a method that accepts a number and modifies it such that the each
 * of the digit in the newly formed number is equal to the difference between two 
 * consecutive digits in the original number. The digit in the units place can be left as it is.
 */

package com.cg.lab3;

import java.util.Scanner;
import java.lang.Math; 
public class Exercise4 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str=scanner.next();
    System.out.print(modifyNumber(str,scanner));
	}
	private static String modifyNumber(String str,Scanner scanner)
	{
		StringBuilder st = new StringBuilder("");
		char []ch=str.toCharArray();
		int len=str.length();
		int a,b,dif;
		//char c;
		for(int index=0;index<len-1;index++)
		{
			a=(int)(ch[index]);
			b=(int)(ch[index+1]);
			dif=Math.abs(a-b);
			//c=(char)dif;
			System.out.print(dif+" ");
			st=st.append(dif);
		}
		st.append(ch[len-1]);
		return st.toString();
	}

}