package capgemini;

public class Snake_and_Ladder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder");
		System.out.println("Initial position of all the players is 0");
		int No_of_Players = 2;
		int position = 0;
		int die_roll = 0;
		int Total_die_rolls = 0;
		
		for (int i = 1;i < No_of_Players + 1;i++ ) {
			while(position <= 100) {
				if (position == 100)
					break;
				else {	
						die_roll = (int)(Math.random()*6+1);
						Total_die_rolls += 1;
						System.out.println("The die rolls for player 1 is " + die_roll);
						int Option = (int)(Math.random()*3+1);
						switch(Option) {
						case 1:
							System.out.println("Remain in the same place");
							break;
						case 2:
							System.out.println("Climb the ladder to move ahead " + die_roll + " steps.");
								position += die_roll;
								if (position > 100) {
									position -= die_roll;
								}
								else
									break;			
						case 3:
							System.out.println("You have been bit by Snake move behind " + die_roll + " steps.");
								position -= die_roll;
								if (position < 0) {
									position = 0;
								}
								else
									break;
						}
					}System.out.println("The new position of Player " + i + " is " + position );}
		 
				}
		System.out.println("The player has won the game with a total of " + Total_die_rolls + " die rolls ");
		
		}
	}