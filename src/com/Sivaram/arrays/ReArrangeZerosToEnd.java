package com.sivaram.arrays;
/**
 * Program: ReArrangeZerosToEnd
 * Author: Sivaram
 * Day: 08
 * Description: HELP TO USER  TO Print Re Arrange and Zeros To End . 
 */
import java.util.Scanner;
public class ReArrangeZerosToEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HOW MANY ELEMENTS YOU WANT:  ");
		int number = scan.nextInt();
		System.out.println("ENTER ELEMENTS HERE : ");
		int[] ar = new int[number];
		for(int i = 0 ;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("EXPECTED OUT PUT IS THIS : ");
		for(int i = 0 ; i<ar.length;i++) {
			if(ar[i]>0) {
				System.out.print(ar[i]+" ");
			}
		}
		for(int i = 0 ; i<ar.length;i++) {
			if(ar[i]==0) {
				System.out.print(ar[i]+" ");
			}
		}
		scan.close();
	}

}
