package day6;

import java.util.Arrays;
import java.util.Scanner;

public class TakingMultipalInputFromScanner {

	public static void main(String[] args) {
		int a [] = new int [5];
		
		Scanner s = new Scanner(System.in);

		for (int i=0; i<a.length; i++) {
			System.out.println("enter array element for position "+a[i]);
			a[i] = s.nextInt();
		}
		System.out.print("Printing array elements ......");
		System.out.println(Arrays.toString(a));
	}

}
