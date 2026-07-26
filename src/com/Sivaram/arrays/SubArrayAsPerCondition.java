package com.sivaram.arrays;
/**
 * Program: SubArrayAsPerCondition
 * Author: Sivaram
 * Day: 09
 * Description: HELP TO USER  TO Print Sub Array As Per Condition . 
 */
import java.util.Scanner;
public class SubArrayAsPerCondition {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER HERE HOW MANY ELMENTS YOU WANT TO PRINT HERE : ");
	int number = scan.nextInt();
	int[] ar = new int[number];
	System.out.println("ENTER THE ELEMENS HERE : ");
	for(int i= 0 ;i<ar.length;i++) {
		ar[i]=scan.nextInt();
	}
	System.out.println("ENTER THE SIZE OF SUB ARRAY : ");
	int size = scan.nextInt();
	System.out.println("ENTER THE CONDITION OF VALUE K : ");
	int k = scan.nextInt();
	System.out.println("EXPECTED OUT PUT: ");
	int sum = 0;
	for(int i = 0 ; i<=ar.length-size;i++) {
		sum = 0;
		for(int j = i ;j<i+size;j++) {
			sum =sum+ar[j];
		}
		if(sum==k) {
			for(int j = i;j<i+size;j++) {
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	}
	scan.close();

	}

}
