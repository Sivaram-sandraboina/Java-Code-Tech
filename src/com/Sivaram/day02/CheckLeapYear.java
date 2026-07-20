package com.sivaram.day02;
/**
 * Program: CheckLeapYear
 * Author: Sivaram
 * Day: 2
 * Description: CheckLeapYear from user inputs .
 */
import java.util.Scanner;
public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int year = scan.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year+" IS A LEAP YEAR");
		}
		else {
			System.out.println(year +" IS NOT A LEAP YEAR ");
		}
		scan.close();

	}

}
