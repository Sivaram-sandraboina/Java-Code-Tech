package com.sivaram.logicbasedprograms;
/**
 * Program: Check Palindrome
 * Author: Sivaram
 * Day: 15
 * Description: HELP TO USER  TO Check NUMBER IS A PALINDROME OR NOT . 
 */
import java.util.Scanner;
public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE ");
		int n = scan.nextInt();
		int original = n;
		int rev = 0;
		while(n>0) {
			int digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		if(rev==original) {
			System.out.println("GIVEN NUMBER IS A PALINDROME ");
		}
		else {
			System.out.println("GIVEN NUMBER IS NOT A PALINDROME ");
		}
		scan.close();

	}

}
