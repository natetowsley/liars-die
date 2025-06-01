package model;
import java.util.ArrayList;

public class Cup {
	private ArrayList<Dice> dice;
	int numDice;
	
	public Cup() {
		numDice = 5;
		dice = new ArrayList<>();
		
		for (int i = 0; i < numDice; i++) {
			Dice newDice = new Dice();
			dice.add(i, newDice);
		}
	}
	
	public void RollDice() {
		for (int i = 0; i < numDice; i++) {
			dice.get(i).RollDie();
		}
	}
	
	public void RemoveDie() { 
		dice.remove(numDice);
		numDice--;
	}
	
	public void PrintRolls() {
		for (int i = 0; i < numDice; i++) {
			System.out.print(dice.get(i).GetRoll());
			if (i < numDice - 1) {
				System.out.print(", ");
			}
		}
	}
}
