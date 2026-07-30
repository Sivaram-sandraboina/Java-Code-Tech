package com.sivaram.strings;
/**
 * Program: VowelRemove
 * Author: Sivaram
 * Day: 14
 * Description: HELP TO USER  TO Print String Vowel Remove . 
 */
import java.util.Scanner;
public class VowelRemove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		for(int i = 0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
				 System.out.print(ch+" ");
			}
		}
		scan.close();
		

	}

}
