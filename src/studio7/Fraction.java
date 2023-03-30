package studio7;

public class Fraction {
	private double num;
	private double den;

	public Fraction(double initNum, double initDen) {
		num= initNum;
		den= initDen;
	}
	public double add(double newFraction) {
		return num/den +newFraction;
	}
	public double multiply(double newFraction) {
		return num/den * newFraction;
	}
	public double add(Fraction newFraction) {
		return num/den +newFraction.getValue();
	}
	public double multiply(Fraction newFraction) {
		return num/den * newFraction.getValue();
	}

	public double reciprical() {
		return den/num;
	}
	public double getValue() {
		return num/den;
	}
	public static void main(String[]args) {
		Fraction f1= new Fraction(7,9);
		Fraction f2=new Fraction(2,10);
		System.out.println(f1.add(0.2));
		System.out.println(f1.add(f2));
	}
}
