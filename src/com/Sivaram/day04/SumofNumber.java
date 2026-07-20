package com.sivaram.day04;
/**
 * Author: Sivaram
 * Day: 04
 * Description: SumofNumber, SumofNumber from user inputs .
 */
import java.util.Scanner;
public class SumofNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int number = scan.nextInt();
		int sum = 0;
		while(number!=0) {
			int digit = number%10;
			sum = sum+digit;
			number = number/10;
		}
		System.out.println("SUM OF NUMBER IS : "+sum);
		scan.close();

	}

}
