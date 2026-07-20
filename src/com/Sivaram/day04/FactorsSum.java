package com.sivaram.day04;
import java.util.Scanner;
public class FactorsSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERER : ");
		int number = scan.nextInt();
		int sum = 0;
		for(int i = 1; i<=number ; i++) {
			if(number%i==0) {
				sum = sum+i;
			}
		}
		System.out.println("SUM OF FACTORS OF "+number+" : "+sum);
        scan.close();
	}

}
