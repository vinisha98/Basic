package com.bridfgelabz.utility;

public class Utility {
	
	public static void coin(int Flip) {
	switch (Flip) {
	case 1:
		System.out.println("Heads");
		
		break;
	case 2:
		System.out.println("Tails");
		}
	}
	public static void Leapyear(int Year) {
	if (( Year % 4 == 0 ) && (( Year % 400 == 0 ) || ( Year % 100 != 0))) {
		System.out.println(Year + " is a leap year");
		}
	else {
		System.out.println(Year + " is not a leap year");
		}
	}
	public static void Poweroftwo(int x) {
		int POWER_OF_TWO=1;
		for ( int i=1; i<=x; i++) {
			POWER_OF_TWO= 2 * POWER_OF_TWO;
		}
			System.out.print("The power of two value for " + x);
			System.out.print(" will be " + POWER_OF_TWO);
	}
	
	
	public static void Harmonicnumber(int n) {
		for ( int i=1; i<=n; i++ ) {
			if ( i <= n)
			{
				System.out.print("1/" + i);
			}
			System.out.print(" + ");
		}
		System.out.print(".....");

	}
	
	
	public static void Primefactor(int n) {
		for(int i = 2; i*i< n; i++) {
	         while(n%i == 0) {
	            System.out.println(i+" ");
	            n = n/i;
	         }
	      }
	      if(n > 2) {
	         System.out.println(n);
	      }
	   }
	
	
	public static void Qutntandrembr(int Num1,int Num2) {
		int Quotient = 0;
		int Reminder = 0;
		Quotient = Num1 / Num2;
		Reminder = Num1 % Num2;
			System.out.println("The Quotient for " + Num1 + " divided by " + Num2 + " will be: " + Quotient);
			System.out.println("The Reminder for " + Num1 + " divided by " + Num2 + " will be: " + Reminder);	
	}
	
	public static void swap(int num1,int num2) {
		int temp;
		temp = num1;  
	    num1 = num2;  
	    num2 = temp;  
	       System.out.println("After swapping: " + num1 + " and " + num2);
	}
	
	public static void evenodd(int NUM) {
		if( NUM % 2 == 0) {
            System.out.println(NUM + " is even");
		}
        else {
            System.out.println(NUM + " is odd");
        }
	}
	
	public static void Vowelorconsonant(char Ch) {
		if (( (Ch == 'a') || (Ch == 'e') || (Ch == 'i') || (Ch == 'o') || (Ch == 'u' ) )) {
            System.out.println( Ch + " is vowel");
		}
        else {
            System.out.println( Ch + " is consonant");
        }
    }
	
	public static void Largestnumber(int Num1,int Num2,int Num3) {
		int Temp,Largest;
		Temp= Num1 > Num2 ? Num1 : Num2;
			Largest= Num3 > Temp ? Num3 :  Temp;  
			System.out.println("The largest value amoung " + Num1 + "," + Num2 + "," + Num3 + " is: " + Largest);
	}

}