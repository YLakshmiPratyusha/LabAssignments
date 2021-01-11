/**
 * Exercise 5: Write a Java program that displays the number of characters,
 *  lines and words in a text? 
 *  @ author:YLP
 */
package com.cg.lab3;

public class Exercise5 {

	public static void main(String[] args) {
    String str="fsfsfs ghghghg \newewrwt hhtytu ";
    String []words=str.split("[ ,.]+");
    String []lines=str.split("[\r\n]");
    System.out.println("No of characters = "+str.length());
    System.out.println("No of lines = "+lines.length);
    System.out.println("No of words = "+words.length);
	}

}