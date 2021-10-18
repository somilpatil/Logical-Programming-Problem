package com.bl;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = num.nextInt();
		if (isPrime(num1)) {
			System.out.println(num1 + " is a prime number.");
		} else {
			System.out.println(num1 + " is not a prime number.");
		}
	}

	public static boolean isPrime(int num1) {
		if (num1 <= 1) {
			return false;
		}
		for (int i = 2; i< num1; i++) {
			if (num1 % i == 0) {
				return false;
			}
		}
		return true;
	}
}

