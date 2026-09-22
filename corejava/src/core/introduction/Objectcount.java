package core.introduction;

public class Objectcount {
	static int counts=0;
	static {
		System.out.println("Static block executed");
	}
	
	{
		counts++;
		System.out.println("Instance block executed");
	}
	Objectcount(){
		System.out.println("Constructor executed");
	}

	public static void main(String[] args) {
		Objectcount Oc1=new Objectcount();
		Objectcount Oc2=new Objectcount();
		Objectcount Oc3=new Objectcount();
		
		System.out.println("Total objects created" + counts);

	}

}
