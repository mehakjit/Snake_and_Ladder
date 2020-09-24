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
		int Option = (int)(Math.random()*3+1);
		switch(Option) {
		case 1:
			System.out.println("Remain in the same place");
			System.out.println("Now the position for player 1 is: " + position);
					break;
		case 2:
			System.out.println("Climb the ladder to move ahead " + die_roll + " steps.");
				position += die_roll;
			System.out.println("Now the position for player 1 is: " + position);
					
					break;			
		case 3:
			System.out.println("You have been bit by Snake move behind " + die_roll + " steps.");
				position -= die_roll;
				if (position < 0) {
					position = 0;
					System.out.println("Now the position for player 1 is: " + position);
				}
				else
					System.out.println("Now the position for player 1 is: " + position);
			System.out.println("Now the position for player 1 is: " + position);
					break;
	}
}}
