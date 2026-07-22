package com.sivaram.arrays;
/**
 * Program: ReverseArray
 * Author: Sivaram
 * Day: 06
 * Description: HELP TO USER  TO GET ReverseArray Elements VALUE FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT TO PRINT ");
		int number = scan.nextInt();
		int[]ar = new int[number];
		System.out.println("ENTER THE ELEMENTS HERE : ");
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("THIS IS IS YOUR EXPECTED OUT PUT : ");
		for(int i = ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		scan.close();

	}

}
