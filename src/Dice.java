import java.util.Random;

public class Dice {
	private int dice1Value, dice2Value, diceValue;

	public Dice() {
		Random random = new Random();
		dice1Value = random.nextInt(6 - 2) + 2;
		dice2Value = random.nextInt(6 - 2) + 2;
		diceValue = dice1Value + dice2Value;
	}

	public int getDice1Value() {
		return dice1Value;
	}

	public int getDice2Value() {
		return dice2Value;
	}

	public int getDiceValue() {
		return diceValue;
	}
}
