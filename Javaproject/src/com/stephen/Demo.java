package com.stephen;

public class Demo {
	public Demo() {



		System.out.println("No argument Constructor");

			}



			public Demo(int a) {

				System.out.println("Int argument Constructor");

			}

			

			public Demo(int a,String b) {

				System.out.println("Two argument Constructor");

				//System.out.println(a);

				//System.out.println(b);

			}

			

			public Demo(float a) {
			

				System.out.println("Float argument Constructor");

			}

			

			public Demo(String a) {

				System.out.println("String argument Constructor");

			}

			

			public Demo(Demo a) {

			System.out.println("ClassType argument Constructor");

			}



	

	public static void main(String[] args) {
		new Demo(new Demo());
		new Demo(10);
		new Demo(1239.098F);
		new Demo("");
	}
}


	
	