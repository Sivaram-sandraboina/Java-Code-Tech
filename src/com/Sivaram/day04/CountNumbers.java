package com.sivaram.day04;
/**
 * Program: CountNumbers
 * Author: Sivaram
 * Day: 04
 * Description: CountNumbers , CountNumbers from user inputs .
 */
import java.util.Scanner;
public class CountNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int number = scan.nextInt();
		int count = 0;
		while(number!=0) {
			number = number/10;
			count++;
		}
		System.out.println("TOTAL DIGITS IN NUMBER IS : "+count);
		scan.close();

	}

}
