package capgemini;

public class Snake_and_Ladder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder");
		System.out.println("Initial position of all the players is 0");
		int No_of_Players = 2;
		int position[] = new int[No_of_Players];
		int die_roll = 0;
		int Total_die_rolls = 0;
		
		while(position[0] != 100 && position[1] != 100) {
			for (int i = 1;i < No_of_Players + 1;i++ ) {
						die_roll = (int)(Math.random()*6+1);
						Total_die_rolls += 1;
						System.out.println("The die rolls for player " + i + " is " + die_roll);
						int Option = (int)(Math.random()*3+1);
						switch(Option) {
						case 1:
							System.out.println("Remain in the same place i.e " + position[i-1]);
						
							break;
						case 2:
								System.out.println("Climb the ladder to move ahead by " + die_roll + " steps.");
								position[i-1] += die_roll;
								if (position[i-1] > 100) {
									position[i-1] -= die_roll;
									System.out.println("Try again");
								}
								System.out.println("The new position of Player " + i + " is " + position[i-1]);
								if (position[i-1]==100) {
									System.out.println("Player " + i + " won the game");
									i=4;
									}
								else
									i=i-1;
							break;			
						case 3:
							System.out.println("You have been bit by Snake move " + die_roll + " steps behind.");
								position[i-1] -= die_roll;
								if (position[i-1] < 0) {
									position[i-1] = 0;
									System.out.println("You can't move back try again");
								}
								System.out.println("The new position of Player " + i + " is " + position[i-1]);
							break;
					}}
				}System.out.println("Total die rolls were "+ Total_die_rolls);
			}
	}