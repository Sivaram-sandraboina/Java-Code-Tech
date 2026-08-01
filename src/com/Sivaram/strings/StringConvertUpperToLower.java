package com.sivaram.strings;
/**
 * Program: String Convert Upper To Lower
 * Author: Sivaram
 * Day: 16
 * Description: HELP TO USER  TO String Convertion Upper To Lower . 
 */
import java.util.Scanner;
public class StringConvertUpperToLower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		String t = "";
		for(int i = 0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A'&&ch<='Z') {
			t = t+(char)(ch+32);
		}
			else {
				t=t+ch;
			}
		}
		System.out.println(t);
		scan.close();
	}

}
