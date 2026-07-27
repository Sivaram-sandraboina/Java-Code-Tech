package com.sivaram.patternprograms;
/**
 * Program: RightAngleColumnPattern
 * Author: Sivaram
 * Day: 11
 * Description: HELP TO USER  TO Print Right Angle Column Pattern . 
 */
import java.util.Scanner;
public class RightAngleColumnPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
