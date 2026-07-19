package com.Sivaram.day03;
/**
 * Program: PrimeNumberCount
 * Author: Sivaram
 * Day: 03
 * Description: Prime Number Count, Prime Number Count From M to N from user inputs .
 */
import java.util.Scanner;
public class PrimeNumberCount {
	public static boolean CheckPrime(int n){
		if(n<=1) {
			return false;
		}
		for(int i = 2 ; i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER HERE : ");
		int m = scan.nextInt();
		System.out.println("ENTER THE LAST NUMBER HERE : ");
		int n = scan.nextInt();
		
		int count = 0;
		for(int i = m;i<=n;i++) {
			if(CheckPrime(i)) {
				count++;
			}
		}
		System.out.println(count);
		
		
scan.close();
	}

}
