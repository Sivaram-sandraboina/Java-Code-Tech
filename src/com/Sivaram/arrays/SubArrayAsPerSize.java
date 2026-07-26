package com.sivaram.arrays;
/**
 * Program: SubArrayAsPerSize
 * Author: Sivaram
 * Day: 09
 * Description: HELP TO USER  TO Print Sub Array As PerSize . 
 */
import java.util.Scanner;
public class SubArrayAsPerSize {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT TO PRINT HERE : ");
		int number = scan.nextInt();
		System.out.println("ENTER THE ELEMENTS HERE : ");
		int []ar = new int[number];
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("ENTER SUB ARRAY SIZE HERE ");
		int size = scan.nextInt();
		System.out.println("EXPECTED SUB ARRAY : ");
		for(int i = 0 ; i<=ar.length-size;i++) {
			for(int j = i;j<i+size;j++) {
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
