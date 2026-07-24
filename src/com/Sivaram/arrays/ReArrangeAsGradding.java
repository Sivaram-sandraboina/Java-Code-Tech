package com.sivaram.arrays;
/**
 * Program: ReArrangeAsGradding
 * Author: Sivaram
 * Day: 08
 * Description: HELP TO USER  TO Print Student Marks As Gradding wais . 
 */
import java.util.Scanner;
public class ReArrangeAsGradding {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER HOW MANY SUBJECTS YOU WANT TO ADD IN TO PROGRESS CARD ");
		int subjects= scan.nextInt();
		int[]marks = new int[subjects];
		System.out.println("ENTER ONE STUDENT MARKS HERE : ");
		for(int i = 0 ;i<marks.length;i++) {
			marks[i] = scan.nextInt();
		}
		for(int i = 0 ; i<marks.length;i++) {
			if(marks[i]>=35) {
				System.out.print(marks[i]+" ");
			}
		}
		for(int i = 0 ; i<marks.length;i++) {
			if(marks[i]<35) {
				System.out.print(marks[i]+" ");
			}
		}
		scan.close();

	}

}
