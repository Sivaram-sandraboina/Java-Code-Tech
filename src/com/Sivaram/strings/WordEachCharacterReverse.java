package com.sivaram.strings;
/**
 * Program: Word Each Character Reverse
 * Author: Sivaram
 * Day: 22
 * Description: HELP TO USER  TO Print Word Each Character Reverse . 
 */
import java.util.Scanner;
public class WordEachCharacterReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine().trim();
		String []ar = str.split(" ");
		for(int i = 0 ; i<ar.length;i++) {
			String t = "";
			for(int j = ar[i].length()-1;j>=0;j--) {
				t=t+ar[i].charAt(j);
			}
			System.out.print(t+" ");
		}
		scan.close();
	}

}
