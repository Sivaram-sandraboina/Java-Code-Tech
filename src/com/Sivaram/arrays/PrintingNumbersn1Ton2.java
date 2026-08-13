package com.sivaram.arrays;
/**
 * Program: PrintingNumbersn1Ton2
 * Author: Sivaram
 * Day: 27
 * Description: HELP TO USER  TO Print Numbers n1 To n2 . 
 */
import java.util.Scanner;
public class PrintingNumbersn1Ton2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STARTING NUMBER HERE : ");
		int n1 = scan.nextInt();
		System.out.println("ENTER THE ENDING NUMBER HERE : ");
		int n2 = scan.nextInt();
		for(int i = n1;i<=n2;i++) {
			System.out.print(i+" ");
		}
		scan.close();

	}

}
