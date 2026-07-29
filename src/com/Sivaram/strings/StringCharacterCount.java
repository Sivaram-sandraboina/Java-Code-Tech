package com.sivaram.strings;
import java.util.Scanner;
public class StringCharacterCount {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE STRING HERE : ");
	
	String str = scan.nextLine();
	int count = 0 ;
	for(int i = 0 ; i<str.length();i++) {
		count++;
	}
	System.out.println(count);
	scan.close();

	}

}
