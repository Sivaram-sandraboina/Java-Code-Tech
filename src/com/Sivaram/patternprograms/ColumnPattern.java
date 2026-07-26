package com.sivaram.patternprograms;
import java.util.Scanner;
public class ColumnPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		System.out.println("EXPECTED OUT PUT : ");
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
