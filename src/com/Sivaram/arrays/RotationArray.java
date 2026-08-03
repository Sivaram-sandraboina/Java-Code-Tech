package com.sivaram.arrays;
/**
 * Program: RotationArray
 * Author: Sivaram
 * Day: 18
 * Description: HELP TO USER  TO Print RotationArray . 
 */

import java.util.Scanner;
public class RotationArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		int[]ar = new int[n];
		System.out.println("ENTER ELEMENTS HERE : ");
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		scan.close();
		System.out.println();
		System.out.println("AFTER ROTATIONAL ELEMENTS ARE : : ");
		int temp = ar[0];
		for(int i = 1 ;i<ar.length;i++) {
			ar[i-1]= ar[i];
		}
		ar[ar.length-1] = temp;
		for(int rotation :ar) {
			System.out.print(rotation+" ");
		}

	}

}
