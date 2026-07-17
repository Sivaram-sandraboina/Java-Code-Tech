package com.sivaram_day01;
/**
 * Program: SWAPPING_WITHOUT_NEW_VARIABLE
 * Author: Sivaram
 * Day: 1
 * Description: TO PRINT SWAPPING_WITHOUT_NEW_VARIABLE WITH USER INPUTS.
 */
import java.util.Scanner;
public class SWAPPING_WITHOUT_NEW_VARIABLE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A HERE : ");
		int A = scan.nextInt();
		System.out.println("ENTER THE VALUE OF B HERE : ");
		int B = scan.nextInt();
		System.out.println("BEFORE SWAPPING A = "+A+" and B = "+B);
		A = A+B;
		B = A-B;
		A = A-B;
		System.out.println("AFTER SWAPPING A = "+A+" and B = "+B);
		scan.close();
		

	}

}
