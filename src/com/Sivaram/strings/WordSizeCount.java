package com.sivaram.strings;
/**
 * Program: WordSizeCount
 * Author: Sivaram
 * Day: 22
 * Description: HELP TO USER  TO Print Word Size Count . 
 */
import java.util.Scanner;
public class WordSizeCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine().trim();
		String[]ar = str.split(" ");
		for(int i = 0 ; i<ar.length;i++) {
			System.out.print(ar[i]+ar[i].length()+" ");
		}
           scan.close();
	}

}
