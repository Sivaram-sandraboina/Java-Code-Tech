package com.sivaram.arrays;
/**
 * Program: MaxValueElement
 * Author: Sivaram
 * Day: 05
 * Description: HELP TO USER  TO GET MAXIMUM VALUE FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;
public class MaxValueElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT TO PRINT HERE : ");
		int number = scan.nextInt();
		int[]ar = new int[number];
		System.out.println("ENTER THE ELEMENTS HERE : ");
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		int max = ar[0];
		for(int i  = 0 ; i<ar.length;i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		System.out.println("MAXIMUM NUMBER FROM ELEMENTS : "+max);
		scan.close();
	}

}
