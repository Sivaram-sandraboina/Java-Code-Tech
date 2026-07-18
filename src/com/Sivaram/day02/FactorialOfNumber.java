package com.Sivaram.day02;
/**
 * Program: FactorialOfNumber
 * Author: Sivaram
 * Day: 2
 * Description: FactorialOfNumber from user inputs .
 */
import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE ");
		int n = scan.nextInt();
		long fact = 1;
		for(int i = 1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("FACTORIOL OF  NUMBER = "+fact);
		scan.close();

	}

}
