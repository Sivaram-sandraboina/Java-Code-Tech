package com.sivaram.arrays;
/**
 * Program: FindingDuplicateNumber
 * Author: Sivaram
 * Day: 25
 * Description: HELP TO USER  TO Print Finding Duplicate Number . 
 */
import java.util.Scanner;
import java.util.HashSet;
public class FindingDuplicateNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE HOW MANY ELEMENTS YOU WANT TO PRINT : ");
		int n = scan.nextInt();
		
		System.out.println("ENTER THE ELEMENTS HERE : ");
		
		int[]ar = new int[n];
		for(int i = 0 ; i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
		
		System.out.println("DUPLICATES ARE : ");
		HashSet<Integer> set= new HashSet<>();
		for(int num : ar) {
			if(!set.add(num)) {
				System.out.print(num);
			}
		}
		scan.close();

	}

}
