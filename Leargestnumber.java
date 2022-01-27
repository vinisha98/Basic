package com.bridfgelabz.basic;

import com.bridfgelabz.utility.Utility;
import java.util.Scanner;

public class Leargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a first number:");
		int Number1 = scanner.nextInt();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a second number:");
		int Number2 = scan.nextInt();	
		Scanner scann = new Scanner(System.in);
		System.out.print("Enter a third number:");
		int Number3 = scann.nextInt();
		Utility.Largestnumber(Number1, Number2, Number3);
	}

}
