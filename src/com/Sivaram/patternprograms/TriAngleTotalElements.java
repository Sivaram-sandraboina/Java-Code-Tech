package com.sivaram.patternprograms;
import java.util.Scanner;
public class TriAngleTotalElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		int count = 0;
		for(int i = 1 ;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				count++;
			}
		}
		System.out.println("TOTAL ELEMENTS : "+count);
		scan.close();

	}

}
