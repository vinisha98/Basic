package com.bridfgelabz.basic;

import com.bridfgelabz.utility.Utility;

public class flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Flip= (int) Math.floor((Math.random() * 10 ) % 2) + 1;
		Utility.coin(Flip);
		}
	}
