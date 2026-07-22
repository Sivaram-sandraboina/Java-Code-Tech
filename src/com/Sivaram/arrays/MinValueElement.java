package com.sivaram.arrays;
/**
 * Program: MinValueElement
 * Author: Sivaram
 * Day: 05
 * Description: HELP TO USER  TO GET MINIMUM VALUE FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;
public class MinValueElement {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT TO PRINT");
	int number  = scan.nextInt();
	int[] ar= new int[number];
	System.out.println("ENTER THE ELEMENTS HERE : ");
	for(int i = 0;i<ar.length;i++) {
		ar[i]=scan.nextInt();
	}
	int min = ar[0];
	for(int i = 0 ; i<ar.length;i++) {
		if(ar[i]<min) {
			min = ar[i];
		}
	}
	System.out.println("MINIMUM VALUE FROM GIVEN ELEMENTS : "+min);
    scan.close();
	}

}
