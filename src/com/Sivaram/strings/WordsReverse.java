package com.sivaram.strings;
/**
 * Program: WordsReverse
 * Author: Sivaram
 * Day: 22
 * Description: HELP TO USER  TO Print Words Reverse . 
 */
import java.util.Scanner;

public class WordsReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine().trim();
		String[]ar = str.split(" ");
		for(int i = ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		scan.close();

	}

}
