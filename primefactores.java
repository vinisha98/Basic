package com.bridfgelabz.basic;

import com.bridfgelabz.utility.Utility;
import java.util.Scanner;

public class primefactores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number:");
		int Value = scanner.nextInt();
		Utility.Primefactor(Value);
	}

}
