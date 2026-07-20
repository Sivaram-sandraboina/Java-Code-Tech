package com.sivaram.day01;
/**
 * Program: SWAPPING
 * Author: Sivaram
 * Day: 1
 * Description: SWAPPING TWO NUMBERS taking input from users .
 */
import java.util.Scanner;
public class SWAPPING {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A HERE : ");
		int A = scan.nextInt();
		System.out.println("ENTER THE VALUE OF B HERE : ");
	    int B = scan.nextInt();
	    int temp = 0 ; 
	    System.out.println("BEFORE SWAPPING A = "+A+" and B = "+B);
	    temp = A;
	    A = B;
	    B = temp;
	    System.out.println("After SWAPPING A = "+A+" and B = "+B);
        scan.close();
	}

}
