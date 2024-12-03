package com.stephen;

public class ConstructorOverloading {
	int a=10;
	public ConstructorOverloading() {
		this(40);
		System.out.println("music");
		System.out.println(this.a);}
	
		public ConstructorOverloading(int b) {
			this(10,1234.56f);
		
			System.out.println("ameer");
		}
		public ConstructorOverloading(int a ,float b) {
			this(new Raj());
			System.out.println("edwin");}
		
			public ConstructorOverloading(Raj a) {
				System.out.println("classname");}
		

	public static void main(String[] args) {
		 new ConstructorOverloading();
	
		
			
		}

	}


