package com.sivaram.arrays;
/**
 * Program: OccurrenceOfElement
 * Author: Sivaram
 * Day: 24
 * Description: HELP TO USER  TO Print Occurrence Of Element . 
 */
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class OccurrenceOfElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER NUMBER HERE HOW MANY ELEMENTS YOU WANT TO PRINT : ");
		int n = scan.nextInt();
		System.out.println("ENTER THE ELEMENTS HERE :  ");
		int[]array = new int[n];
		for(int i = 0 ; i<array.length;i++) {
			array[i]=scan.nextInt();
		}
		
		Map<Integer,Integer> map = new TreeMap<>();
		for(int num :array) {
			map.put(num,map.getOrDefault(num,0)+1);
		}
		System.out.println("Occurance Of Number With Sorted Order : ");
		System.out.print(map);
		scan.close();

	}

}
