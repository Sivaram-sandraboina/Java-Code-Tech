package com.sivaram.day03;
/**
 * Program: PrintPrime M to N
 * Author: Sivaram
 * Day: 03
 * Description: PrintPrime M to N , PrintPrime M to N from user inputs .
 */
import java.util.Scanner;
public class PrintPrimeMtoN {
	public static boolean CheckPrime(int n){
		
	if(n<=1) {
		
		return false;
	}
	for(int  i = 2;i*i<=n;i++) {
		if(n%i==0) {
			return false;
		}
		
	}
	return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STARTING NUMBER HERE :");
		int m = scan.nextInt();
		System.out.println("ENTER THE LAST NUMBER HERE : ");
		int n = scan.nextInt();
		for(int i = m;i<=n;i++) {
			if(CheckPrime(i)) {
				System.out.print(i+" ");
			}
		}
		scan.close();

	}

}
