package com.sivaram.logicbasedprograms;
/**
 * Program: MissingElementFind
 * Author: Sivaram
 * Day: 18
 * Description: HELP TO USER  TO Print Missing Element . 
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElementFind {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER HERE : ");
		int n = scan.nextInt();
		int[]ar = new int[n];
		System.out.println("ENTER THE ELEMENTS HERE : ");
		for(int i = 0 ; i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		
		Set<Integer> set= Arrays.stream(ar)
		.boxed()
		.collect(Collectors.toSet());
		System.out.println("MISSING ELEMENTS FROM GIVEN ELEMENTS : ");
		
		List<Integer> list = IntStream.rangeClosed(1, 9)
				.filter(i->!set.contains(i))
				.boxed()
				.toList();
		System.out.print(list);
		scan.close();
		

	}

}
