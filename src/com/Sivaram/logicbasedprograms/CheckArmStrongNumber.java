package com.sivaram.logicbasedprograms;
/**
 * Program: CheckArmStrongNumber
 * Author: Sivaram
 * Day: 15
 * Description: HELP TO USER  TO Check Arm Strong Number From Three Digit Number Only . 
 */
import java.util.Scanner;
public class CheckArmStrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int num = scan.nextInt();
		int original = num;
		int sum = 0 ;
		while(num>0) {
			int digit = num%10;
			sum = sum+(digit*digit*digit);
			num = num/10;
		}
		if(original==sum) {
			System.out.println(original +" IS A ARMSTRONG NUMBER ");
		}
		else {
			System.out.println(original +" IS  NOT A ARMSTRONG NUMBER ");
		}
		scan.close();

	}

}
