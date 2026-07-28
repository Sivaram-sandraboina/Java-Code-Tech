package com.sivaram.patternprograms;
/**
 * Program: RightAngleColumnPattern
 * Author: Sivaram
 * Day: 12
 * Description: HELP TO USER  TO Print Reverse TriAngle Pattern . 
 */
import java.util.Scanner;
public class ReverseTriAngle {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER HERE : ");
	int n = scan.nextInt();
	for(int i = n;i>=1;i--) {
		for(int j= i;j>=1;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	scan.close();

	}

}
