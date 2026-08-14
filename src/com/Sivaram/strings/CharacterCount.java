package com.sivaram.strings;
/**
 * Program: CharacterCount
 * Author: Sivaram
 * Day: 28
 * Description: HELP TO USER  TO Print Character Count . 
 */
import java.util.Scanner;
public class CharacterCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		int count = 0;
		for(int i = 0 ; i<str.length();i++) {
			count++;
		}
		System.out.println("PRINTING CHARACTER COUNT : ");
		System.out.println(count);
		scan.close();		
	}

}
