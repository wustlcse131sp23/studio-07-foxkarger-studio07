package studio7;

public class HockeyPlayer {
	private String name;
	private String number;
	private String shootingHand;
	private String dominance;

	public static int gameCount=0;
	public static int goalCount= 0;
	public static int assistCount= 0;

	public HockeyPlayer (String initName, String initNumber, String initShootingHand, String initDominance) {
		name= initNumber;
		number= initNumber;
		shootingHand= initShootingHand;
		dominance= initDominance;
	}
	public int playGame() { //play game and get points simoltneously
		gameCount ++;
		goalCount ++;
		assistCount++;
		return goalCount+ assistCount; //total points
		
	}

}
