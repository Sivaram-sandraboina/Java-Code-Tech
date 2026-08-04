package com.sivaram.strings;
/**
 * Program: MaxLengthOfWord 
 * Author: Sivaram
 * Day: 19
 * Description: HELP TO USER  TO Print Max Length Of Word . 
 */
import java.util.Scanner;
public class MinLengthOfWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String s = scan.nextLine();
		String str[]= s.split(" ");
		String minword = str[0];
		for(int i = 0 ; i<str.length;i++) {
			if(str[i].length()<minword.length()) {
				minword = str[i];
			}
		}
		System.out.println("MIN WORD LENGTH IS : ");
		System.out.println(minword.length());
		scan.close();

	}

}
