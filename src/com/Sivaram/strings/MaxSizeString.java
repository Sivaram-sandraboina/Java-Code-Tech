package com.sivaram.strings;
/**
 * Program: MaxSizeString
 * Author: Sivaram
 * Day: 19
 * Description: HELP TO USER  TO Print Max Size String . 
 */
import java.util.Scanner;
public class MaxSizeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String s = scan.nextLine();
		String []str = s.split(" ");
		String maxword = str[0];
		for(int i = 0;i<str.length;i++) {
			if(str[i].length()>maxword.length()) {
				maxword = str[i];
			}
		}
		System.out.println("MAX LENGTH WORD IS : ");
		System.out.print(maxword);
		scan.close();
	}

}
