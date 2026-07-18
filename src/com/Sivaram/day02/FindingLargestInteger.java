package com.Sivaram.day02;
/**
 * Program: FindingLargestInteger
 * Author: Sivaram
 * Day: 2
 * Description: FindingLargestInteger from user inputs .
 */
import java.util.Scanner;
public class FindingLargestInteger {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER FIRST NUMBER  HERE : ");
	int a = scan.nextInt();
	System.out.println("ENTER THE NEXT NUMBER HERE : ");
	int b = scan.nextInt();
	System.out.println("ENTER THE NEXT NUMBER HERE : ");
	int c = scan.nextInt();
	
	if(a>=b && a>=c) {
		System.out.println(a);
	}
	else if(b>=a && b>=c) {
		System.out.println(b);
	}
	else {
		System.out.println(c);
	}
	scan.close();

	}

}
