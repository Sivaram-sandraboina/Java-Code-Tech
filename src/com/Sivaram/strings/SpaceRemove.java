package com.sivaram.strings;
/**
 * Program: SpaceRemove
 * Author: Sivaram
 * Day: 28
 * Description: HELP TO USER  TO Print String After Space Remove . 
 */
import java.util.Scanner;
public class SpaceRemove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		String s = "";
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==' ') {
				continue;	
			}
			else {
				s= s+ch;
			}
		}
		System.out.println("STRING AFTER SPACE REMOVE ....");
		System.out.print(s);
		scan.close(); 
	}

}
