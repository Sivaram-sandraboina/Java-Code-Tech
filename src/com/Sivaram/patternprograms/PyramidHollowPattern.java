package com.sivaram.patternprograms;
/**
 * Program: PyramidHollowPattern
 * Author: Sivaram
 * Day: 26
 * Description: HELP TO USER  TO Print Pyramid Hollow Pattern . 
 */
import java.util.Scanner;
public class PyramidHollowPattern {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER HERE : ");
	int n = scan.nextInt();
	for(int i = 1;i<=n;i++) {
		for(int j = 1 ; j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int  j = 1 ;j<=i;j++) {
			if(i==n||j==1||j==i) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	scan.close();

	}

}
