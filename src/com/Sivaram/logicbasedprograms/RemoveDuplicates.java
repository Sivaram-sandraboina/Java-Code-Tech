package com.sivaram.logicbasedprograms;
/**
 * Program: RemoveDuplicates
 * Author: Sivaram
 * Day: 17
 * Description: HELP TO USER  TO Remove Duplicates . 
 */
import java.util.*;
import java.util.HashSet;
public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int  n = scan.nextInt();
		System.out.println("ENTER THE ELEMENTS HERE : ");
		int[]ar = new int[n];
		for(int i = 0 ;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		HashSet<Integer> seen= new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		for(int num :ar) {
			if(seen.contains(num)) {
				duplicates.add(num);
			}
			else {
				seen.add(num);
			}
		}
		 List<Integer> res = new ArrayList<>(seen);
		 for(int num : res) {
			 System.out.print(num+" ");
		 }
		 scan.close();
		 
	}

}
