package com.stephen;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter the value of A :: ");

		int a=scan.nextInt();

		System.out.print("Please Enter the value of B :: ");

		int b=scan.nextInt();

		System.out.println("Addition Output of A and B :: "+(a+b));
		throw new IllegalArgumentException();

	}

}
