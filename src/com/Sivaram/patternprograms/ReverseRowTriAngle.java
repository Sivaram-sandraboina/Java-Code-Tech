package com.sivaram.patternprograms;
/**
 * Program: RightAngleColumnPattern
 * Author: Sivaram
 * Day: 12
 * Description: HELP TO USER  TO Print Reverse Row TriAngle Pattern . 
 */
import java.util.Scanner;
public class ReverseRowTriAngle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBR HERE : ");
		int n = scan.nextInt();
		for(int i = n ; i>=1;i--) {
			for(int j = i ; j>=1;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
