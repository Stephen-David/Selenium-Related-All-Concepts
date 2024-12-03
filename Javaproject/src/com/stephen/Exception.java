package com.stephen;

public class Exception {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		try{
			System.out.println(a[5]/0);
		}
		
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("please  check the array size");
		
	}
		finally {
			System.out.println(" thank you");
//		catch(ArithmeticException e) {
//			System.out.println("please enter non zero values");
//		}
		
		


	}}
}
