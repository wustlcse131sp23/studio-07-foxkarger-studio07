package studio7;

public class Complex {

	private int a;
	private int b;
	private String i;

	public Complex (int initA, int initB, String initI) {
		a= initA;
		b= initB;
		i= initI;
	}
	public String add(int c, int d) {
		return (a + c) + "+" + (b + d) + "i";
	}
	public String multiply(int c, int d) {
		return ((a * c)-(b * d)) + "+" + ((a * d)+(b * c))+ "i";
	}
	public static void main(String[]args) {
		Complex c1= new Complex (3,4,"i");
		System.out.println(c1.add(7, 5));
		System.out.println(c1.multiply(1, 2));
	}
}

