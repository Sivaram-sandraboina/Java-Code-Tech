package com.sivaram.arrays;
/**
 * Program: PairPrintAsPerCondition
 * Author: Sivaram
 * Day: 07
 * Description: HELP TO USER  TO PRINT Pairs As Per Condition FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;

public class PairPrintAsPerCondition {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT TO PRINT HERE : ");
	int number = scan.nextInt();
	System.out.println("ENTER THE ELEMENTS HERE : ");
	int[]ar = new int[number];
	for(int i = 0 ; i<ar.length;i++) {
		ar[i]=scan.nextInt();
	}
	System.out.println("ENTER NUMBER WHICH SUM YOU WANT HERE : ");
	int k = scan.nextInt();
	System.out.println("YOUR EXPECTED OUT PUT SUM OF PAIR EQUAL TO YOUR GIVEN NUMBER : ");
	for(int i= 0;i<ar.length-1;i++) {
		for(int j = i+1;j<ar.length;j++) {
			if(ar[i]+ar[j]==k) {
				System.out.println(ar[i]+" "+ar[j]);
			}
		}
	}
	scan.close();

	}

}
