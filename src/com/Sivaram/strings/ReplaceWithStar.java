package com.sivaram.strings;
/**
 * Program: ReplaceWithStar
 * Author: Sivaram
 * Day: 29
 * Description: HELP TO USER  TO Print Replace With Star . 
 */
import java.util.Scanner;
public class ReplaceWithStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		String s = "";
		for(int i = 0 ; i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch=='a') {
				s=s+'*';
			}
			else {
				s=s+ch;
			}
		}
		System.out.print(s);

		scan.close();
	}

}
