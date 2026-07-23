package com.sivaram.arrays;
/**
 * Program: PairsSum 
 * Author: Sivaram
 * Day: 07
 * Description: HELP TO USER  TO Print Pairs Sum FROM GIVEN NUMBERS . 
 */

import java.util.Scanner;
public class PairsSum {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT HERE ");
	int number = scan.nextInt();
	System.out.println("ENTER THE ELEMENTS HERE : ");
	int[]ar = new int[number];
	for(int i = 0 ; i<ar.length;i++) {
		ar[i]=scan.nextInt();
	}
	int sum = 0 ;
	System.out.println("SUM OF PAIRS : ");
	for(int i = 0;i<ar.length;i++) {
		sum = 0;
		for(int j = 0 ; j<ar.length;j++) {
			sum = ar[i]+ar[j];
			System.out.println(ar[i]+" + "+ar[j]+" = "+sum);
		}
	}
	scan.close();

	}

}
