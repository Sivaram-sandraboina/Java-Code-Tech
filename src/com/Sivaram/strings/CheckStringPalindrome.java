package com.sivaram.strings;
/**
 * Program: Check String Palindrome
 * Author: Sivaram
 * Day: 15
 * Description: HELP TO USER  TO Check String Palindrome . 
 */
import java.util.Scanner;
public class CheckStringPalindrome {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE STRING HERE : ");
	String str = scan.nextLine();
	int i = 0 ; 
	int j = str.length()-1;
	while(i<j) {
		if(str.charAt(i)==str.charAt(j)) {
			i++;
			j--;
		}
		else {
			System.out.println("GIVEN STRING IS NOT A PALINDROME....");
			scan.close();
			return;
			
		}
	}
	
	System.out.println("GIVEN STRING IS A PALINDROME..... ");
	scan.close();
	}

}
