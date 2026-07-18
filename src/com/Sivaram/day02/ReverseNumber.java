package com.Sivaram.day02;
/**
 * Program: ReverseNumber
 * Author: Sivaram
 * Day: 2
 * Description: ReverseNumber from user inputs .
 */
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		int rev = 0;
		while(n!=0) {
			int digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		System.out.println(rev);
		scan.close();

	}

}
