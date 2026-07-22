package com.sivaram.arrays;
/**
 * Program: DescendingOrder
 * Author: Sivaram
 * Day: 06
 * Description: HELP TO USER  TO GET DescendingOrderOrderElements VALUE FROM GIVEN NUMBERS . 
 */
import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT HERE");
		int number = scan.nextInt();
		System.out.println("ENTER THE ELEMENTS HERE : ");
		int[]ar = new int[number];
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		int temp = 0;
		System.out.println("DESECNDING ORDER ELEMENTS : ");
		for(int i = 0 ; i<ar.length;i++) {
			for(int j = i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i = 0 ; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
		}
		scan.close();

	}

}
