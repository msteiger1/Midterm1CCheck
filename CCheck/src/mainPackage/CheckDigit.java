package mainPackage;

import java.util.Scanner;

public class CheckDigit {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Credit Card number: ");
		long CCnumber = input.nextLong();
		int number = 0;

		long total = evenSpots(number) + oddSpots(number);

		if (isValid(total)) {
			System.out.println("The Credit Card number is valid.");
		} else
			System.out.println("The Credit Card number is invalid.");
	}

	public static boolean isValid(long total) {
		if (total % 10 == 0) {
			return true;
		}
		return false;
	}

	public static int evenSpots(long digit) {
		int sumEven = 0;
		int remainder;
		digit %= 10;
		while (digit % 10 != 0 || digit / 10 != 0) {
			remainder = (int) (digit % 10);
			sumEven += sumResult(remainder * 2);
			digit /= 100;
		}
		return sumEven;
	}

	public static int oddSpots(long digit) {
		int sumOdd = 0;
		int remainder;

		while (digit % 10 != 0 || digit / 10 != 0) {
			remainder = (int) (digit % 10);
			sumOdd += sumResult(remainder);
			digit /= 100;
		}
		return sumOdd;
	}
	
	public static int sumResult(int number) {
		if (number > 9) {
			return (number % 10 + number / 10);
		}
		return number;
	}

}
