package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);

	System.out.println("What is your start amount?");
	double startAmount = in.nextDouble();
	System.out.println("What is your win chance (in percent)?");
	double winChance = in.nextDouble();
	System.out.println("What is your win limit?");
	double winLimit = in.nextDouble();
	System.out.println("What is the total number of simulations to run?");
	int totalSimulations = in.nextInt();
			
	int totalRuins = 0;
	
	for(int count = 1; count <= totalSimulations; count++)
	{	
		int perDay = 0;
		double currentAmount = startAmount;
		while (currentAmount > 0 && currentAmount < winLimit)
		{
			if ((Math.random()*100.0)<=winChance)
			{	
				currentAmount = currentAmount + 1;
			}
		
			else
			{
				currentAmount = currentAmount - 1;
			}
			perDay++;
		}
		if (currentAmount<=0)
			{
			System.out.println("Simulation " + count + ": Ruined, Number of plays: " + perDay);
			totalRuins++;
			}
			else
			{
				System.out.println("Simulation " + count + ": Good Day :), Number of plays: " + perDay);
			
			}
		
	
	}
	System.out.println("Ruin Rate: " + Math.round((totalRuins/totalSimulations)*100)/100);
	}
	
}
