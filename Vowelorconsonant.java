package com.bridfgelabz.basic;

import com.bridfgelabz.utility.Utility;
import java.util.Scanner;

public class Vowelorconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a single alphabit(Only small letters):");
		char Char = scanner.next().charAt(0);
		Utility.Vowelorconsonant(Char);
	}

}
