package com.Sivaram.day03;
/**
 * Program:SumOfPrimeNumbers
 * Author: Sivaram
 * Day: 03
 * Description: Sum Of Prime Numbers , Sum Of Prime Numbers from user inputs .
 */
import java.util.Scanner;
public class SumOfPrimeNumbers {
	public static boolean CheckPrime(int n ){
		if(n<=1) {
			return false;
		}
		for(int i = 2; i*i<=n;i++) {
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
    System.out.println("ENTER THE LAST NUMBER  HERE : ");
    int n = scan.nextInt();
    int sum = 0;
    for(int i=m ; i<=n;i++) {
    	if(CheckPrime(i)) {
    		sum = sum+i;
    	}
    }
    System.out.println("Sum Of Prime Numbers = "+sum);
    scan.close();
	}

}
