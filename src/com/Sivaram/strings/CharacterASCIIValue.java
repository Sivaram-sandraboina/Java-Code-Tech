package com.sivaram.strings;
/**
 * Program: Character ASCII Value
 * Author: Sivaram
 * Day: 23
 * Description: HELP TO USER  TO Print Character ASCII Value . 
 */
import java.util.Scanner;
public class CharacterASCIIValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		for(int i = 0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.print(ch+" - "+(int)(ch)+", ");
		}
		scan.close();

	}

}
