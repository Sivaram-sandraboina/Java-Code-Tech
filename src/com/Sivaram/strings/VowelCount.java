package com.sivaram.strings;
/**
 * Program: SpaceCount
 * Author: Sivaram
 * Day: 14
 * Description: HELP TO USER  TO Print String Vowel Count . 
 */
import java.util.Scanner;
public class VowelCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING HERE : ");
		String str = scan.nextLine();
		int count = 0;
		for(int i = 0  ; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("VOWELS IN GIVEN STRING : "+count);
		scan.close();

	}

}
