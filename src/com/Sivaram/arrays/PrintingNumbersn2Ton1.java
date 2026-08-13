package com.sivaram.arrays;
/**
 * Program: PrintingNumbersn2Ton1
 * Author: Sivaram
 * Day: 27
 * Description: HELP TO USER  TO Print Numbers n2 To n1 . 
 */
import java.util.Scanner;
public class PrintingNumbersn2Ton1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER HERE : ");
		int n1 = scan.nextInt();
		System.out.println("ENTER THE ENDING NUMBER HERE : ");
		int n2 = scan.nextInt();
		System.out.println("EXPECTED REVERSED NUMBERS HERE : ");
		for(int i=n2;i>=n1;i--) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
