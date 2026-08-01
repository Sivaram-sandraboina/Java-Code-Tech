package com.sivaram.strings;
/**
 * Program: String Convert Lower To Upper
 * Author: Sivaram
 * Day: 16
 * Description: HELP TO USER  TO String Convert Lower To Upper . 
 */
import java.util.Scanner;
public class StringConvertLowerToUpper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		String t = "";
		for(int i  = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			t= t+(char)(ch-32);
		}
		System.out.println(t);
		scan.close();
		
	}

}
