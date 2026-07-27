package com.sivaram.patternprograms;
/**
 * Program: HollyPattern
 * Author: Sivaram
 * Day: 10
 * Description: HELP TO USER  TO Print Holly Pattern . 
 */
import java.util.Scanner;
public class HollyPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		System.out.println("YOUR EXPECTED OUT PUT .... ");
		for(int i = 1;i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				if(i==1||j==1||i==n||j==n) {
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
