package com.sivaram_day01;
/**
 * Program: EvenOrOddCheck
 * Author: Sivaram
 * Day: 1
 * Description: TO HELP TO USER A GIVEN NUMBER IS EvenOrOddCheck WITH USING SIMPLE MATHS .
 */
import java.util.Scanner;
public class EvenOrOddCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("ENETER THE NUMBER HERE : ");
		int n  = scan.nextInt();
		if(n%2==0)
		{
			System.out.println(n +" = EVEN NUMBER .");
		}
		else {
			System.out.println(n +" = ODD NUMBER .");
		}
		scan.close();
	}

}
