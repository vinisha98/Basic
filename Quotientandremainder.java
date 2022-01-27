package com.bridfgelabz.basic;

import com.bridfgelabz.utility.Utility;
import java.util.Scanner;

public class Quotientandremainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the Divisor number:");
		int Number1 = scanner.nextInt();
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the Dividend number:");
		int Number2 = scan.nextInt();
		Utility.Qutntandrembr(Number1, Number2);
	}

}
