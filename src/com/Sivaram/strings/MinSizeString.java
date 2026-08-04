package com.sivaram.strings;
/**
 * Program: MinSizeString
 * Author: Sivaram
 * Day: 19
 * Description: HELP TO USER  TO Print Min Size String . 
 */
import java.util.Scanner;
public class MinSizeString {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE STRING HERE : ");
	String s = scan.nextLine();
	String []str = s.split(" ");
	String minword = str[0];
	for(int i = 0 ; i<str.length;i++) {
		if(str[i].length()<minword.length()) {
			minword = str[i];
		}
	}
	System.out.println("MINIMUM LENGTH WORD IS : ");
	System.out.print(minword);
	scan.close();

	}

}
