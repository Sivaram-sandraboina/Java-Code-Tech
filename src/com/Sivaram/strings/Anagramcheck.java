package com.sivaram.strings;
/**
 * Program: Anagramcheck
 * Author: Sivaram
 * Day: 21
 * Description: HELP TO USER  TO Anagram check from two strings . 
 */
import java.util.Arrays;
import java.util.Scanner;
public class Anagramcheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE FIRST STRING HERE : ");
		String str1 = scan.nextLine();
		System.out.println("ENTER THE SECOND STRING HERE : ");
		String str2 = scan.nextLine();
		str1 = str1.replace(" ","").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();
		char []a= str1.toCharArray();
		char []b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.println("GIVEN STRINGS ARE ANAGRAM ");
		}
		else {
			System.out.println("GIVEN STRIINGS ARE NOT A ANAGRAM ");
		}
		scan.close();
	}

}
