package com.sivaram.patternprograms;
/**
 * Program: RowPattern
 * Author: Sivaram
 * Day: 10
 * Description: HELP TO USER  TO Print Row Pattern . 
 */
import java.util.Scanner;
public class RowPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n  = scan.nextInt();
		System.out.println("EXPECTED OUT PUT : ");
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
