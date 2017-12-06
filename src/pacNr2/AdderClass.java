package pacNr2;

public class AdderClass {
	
	public static void main(String[] args) {
		Bilekas bilekas = new Bilekas();
		System.out.println();
		System.out.println("Ats:" +bilekas.adder("labuka", "sdf"));
		System.out.println("Ats:" +bilekas.adder(15, 20));
		System.out.println("Ats:" +bilekas.adder(2.5, 2.7));
		System.out.println("Ats:" +bilekas.adder(1, "sdf"));
			
	}


}
