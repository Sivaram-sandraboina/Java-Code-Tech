package com.sivaram.day04;
import java.util.Scanner;
public class FactorsOfnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int number = scan.nextInt();
		System.out.println("FACTORS OF NUMBER "+number+" : ");
		for(int i = 1 ; i<=number;i++) {
			if(number%i==0) {
				System.out.print(i+" ");
			}
		}
		scan.close();

	}

}
