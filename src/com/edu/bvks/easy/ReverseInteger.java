package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/reverse-integer/
 * 
 * This one took more than 1 hour and a reference solution to solve this
 * 
 * Notes
 * 
 * Data Type	Size	Description
 *	byte	1 byte	Stores whole numbers from -128 to 127
 *	short	2 bytes	Stores whole numbers from -32,768 to 32,767
 *	int		4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
 *	long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 *	float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
 *	double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
 *	boolean	1 bit	Stores true or false values
 *	char	2 bytes	Stores a single character/letter or ASCII values
 * 
 * @author VivekVineeth
 *
 */

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-321));
	}

	public static int reverse(int x) {
		long reversedInt = 0;

		while (x != 0) {
			reversedInt = (reversedInt * 10) + x % 10;
			x /= 10;
		}

		if (reversedInt < Integer.MIN_VALUE || reversedInt > Integer.MAX_VALUE)
			return 0;
		else
			return (int) reversedInt;
	}

	// The below are the Failed Trials

	public static int reverseFalse(int x) {
		int reversedInt = 0;

		while (x != 0) {
			reversedInt = (reversedInt * 10) + x % 10;
			x /= 10;
		}

		if (reversedInt >= Integer.MIN_VALUE && reversedInt <= Integer.MAX_VALUE)
			return reversedInt;

		return 0;
	}

	public static int reverseNegativeTrial(int x) {
		int reversedInt = 0;

		reversedInt = (reversedInt * 10) + x % 10;
		x /= 10;
		System.out.println(x);

		reversedInt = (reversedInt * 10) + x % 10;
		x /= 10;
		System.out.println(x);

		reversedInt = (reversedInt * 10) + x % 10;
		x /= 10;
		System.out.println(x);

		return reversedInt;
	}

}
