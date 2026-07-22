package com.sivaram.arrays;
/**
 * Program: SecondMaxNumber
 * Author: Sivaram
 * Day: 05
 * Description: HELP TO USER  TO GET Second Max Number VALUE FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;
public class SecondMaxNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT TO PRINT HERE : ");
		int number = scan.nextInt();
		int[]ar = new int[number];
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		System.out.println("ENTER THE ELEMENTS HERE : ");
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		for(int i = 0 ;i<ar.length;i++) {
			if(ar[i]>first) {
				second = first;
				first = ar[i];
				
			}
			else if(ar[i]>second && ar[i]!=first) {
				second = ar[i];
			}
		}
		System.out.println("SECOND MAXIMUM ELEMENTS IS : "+second);
		scan.close();
	}

}
