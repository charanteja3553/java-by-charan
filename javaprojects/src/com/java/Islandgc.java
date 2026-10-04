package com.java;

class a {
	b B;
	@Override
	protected void finalize() throws Throwable {
System.out.println("finalize method called");

	}
}

class b {
	a A;

	public static void main(String[] args) {

		System.out.println("main method started");

		a o1 = new a();
		b o2 = new b();
		
	

		o1.B = o2;
		o2.A = o1;
		
		System.out.println("main end");
	}

}
