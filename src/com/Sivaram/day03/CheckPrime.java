package com.Sivaram.day03;
/**
 * Program: CheckPrime
 * Author: Sivaram
 * Day: 03
 * Description: Number is Prime Or NOt Prime , CheckPrime from user inputs .
 */

import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		if(n<=1) {
			System.out.println("GIVEN NUMBER IS NOT A PRIME ");
			scan.close();
			return;
		}
		for(int  i = 2;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println("GIVEN NUMBER IS NOT A PRIME ");
				scan.close();
				return;
			}
			
		}
		System.out.println("GIVEN NUMBER IS PRIME ");
	scan.close();
	}

}
