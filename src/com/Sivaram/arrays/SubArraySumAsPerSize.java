package com.sivaram.arrays;
/**
 * Program: SubArrayAsPerSize
 * Author: Sivaram
 * Day: 09
 * Description: HELP TO USER  TO Print Sub Array Sum As Per Size . 
 */
import  java.util.Scanner;
public class SubArraySumAsPerSize {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU YOU WANT : ");
		int number = scan.nextInt(); 
		int[]ar = new int[number];
		System.out.println("ENTER THE ELEMENTS HERE : ");
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("ENTER THE SIZE OF SUBARRAY HERE : ");
		int size = scan.nextInt();
		System.out.println("EXPECTED OUT PUT ");
		int sum = 0;
		for(int i = 0;i<=ar.length-size ;i++) {
			sum = 0;
			for(int j = i;j<i+size;j++) {
				sum = sum+ar[j];
			}
			System.out.println(sum);
		}
		scan.close();

	}

}
