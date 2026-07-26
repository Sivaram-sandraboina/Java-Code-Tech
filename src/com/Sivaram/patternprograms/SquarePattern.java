package com.sivaram.patternprograms;
/**
 * Program: SquarePattern
 * Author: Sivaram
 * Day: 10
 * Description: HELP TO USER  TO Square Pattern . 
 */
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE ");
		int n = scan.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}

}
