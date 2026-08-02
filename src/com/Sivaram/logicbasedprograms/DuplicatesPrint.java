package com.sivaram.logicbasedprograms;
/**
 * Program: DuplicatesPrint
 * Author: Sivaram
 * Day: 17
 * Description: HELP TO USER  TO Duplicates Print . 
 */
import java.util.Scanner;
import java.util.*;
import java.util.HashSet;
public class DuplicatesPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
	int[]ar= new int[n];
	System.out.println("ENTER THE ELEMENTS HERE ");
	for(int i = 0;i<ar.length;i++) {
		ar[i]=scan.nextInt();
	}
	HashSet<Integer> seen = new HashSet<>();
	HashSet<Integer> duplicate = new HashSet<>();
	for(int num : ar) {
		if(seen.contains(num)) {
			duplicate.add(num);
		}
		else {
			seen.add(num);
		}
	}
	System.out.println("DUPLICATE ELEMENTS FROM GIVEN ELEMENTS : ");
	List<Integer> res = new ArrayList<>(duplicate);
	for(int num : res) {
		System.out.print(num+" ");
	}
	scan.close();
	

	}

}
