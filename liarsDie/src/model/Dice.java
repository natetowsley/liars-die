package model;
import java.util.Random;

public class Dice {
	private int roll;
	private Random randNum = new Random();
	
	public Dice() {
		roll = 1;
	}

	public int GetRoll() {
		return roll;
	}
	public void RollDie() {
		roll = randNum.nextInt(1, 7);
	}
}
