package com.bridfgelabz.basic;

import com.bridfgelabz.utility.Utility;
import java.util.Scanner;

public class Swaptwonumbers {
	
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print("enter the first number:");
			int Number1 = scanner.nextInt();
			Scanner scan = new Scanner(System.in);
			System.out.print("enter the secnd number:");
			int Number2 = scan.nextInt();
			System.out.println("Before swapping numbers1 and number2 are as respective " + Number1 + " and " + Number2);
			Utility.swap(Number1, Number2);
		}
}
