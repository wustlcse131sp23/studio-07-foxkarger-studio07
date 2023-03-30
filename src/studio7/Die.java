package studio7;

public class Die {

	private int n; //number of sides
	public Die (int initN) {
		n=initN;
	}
	public int throwDie() {
		return (int) (Math.random()*n+1);
	}
	public static void main(String[]args) {
		Die d1= new Die (8);
		System.out.println(d1.throwDie());
	}
	
}