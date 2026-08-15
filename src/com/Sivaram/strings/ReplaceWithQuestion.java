package com.sivaram.strings;
/**
 * Program: ReplaceWithQuestion
 * Author: Sivaram
 * Day: 29
 * Description: HELP TO USER  TO Print Replace With Question . 
 */

import java.util.Scanner;

public class ReplaceWithQuestion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		String s = "";
		for(int i = 0 ; i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch=='a') {
				s=s+'?';
			}
			else {
				s=s+ch;
			}
		}
		System.out.print(s);

		scan.close();

	}

}
