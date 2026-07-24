package com.sivaram.arrays;
import java.util.Scanner;
public class ReArrangeNagativesToEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER NUMBER HOW MANY ELEMENTS YOU WANT HERE : ");
		int number = scan.nextInt();
		System.out.println("ENTER THE ELEMENTS HERE : ");
		int[] ar = new int[number];
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("YOUR EXPECTED OUT PUT HERE : ");
		for(int i = 0 ; i<ar.length;i++) {
			if(ar[i]>=0) {
				System.out.print(ar[i]+" ");
			}
		}
		for(int i = 0 ; i<ar.length;i++) {
			if(ar[i]<0) {
				System.out.print(ar[i]+" ");
			}
		}
		scan.close();

	}

}
