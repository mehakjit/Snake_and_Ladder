package capgemini;

public class Snake_and_Ladder {

	public static void main(String[] args) {
	System.out.println("Welcome to Snake and Ladder");
	int No_of_Players = 1;
	int position = 0;
	int die_roll = 0;
	for (int i = 1;i < No_of_Players + 1;i++ )
		System.out.println("The position of Player " + i + " is " + position );
		die_roll = (int)(Math.random()*6+1);
		System.out.println("The die rolls for player 1 is " + die_roll);
	}
}
