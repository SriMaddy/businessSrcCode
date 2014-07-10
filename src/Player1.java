import java.util.Map;
import java.util.Set;

import javax.swing.JLabel;

public class Player1 implements Movable {
	private static int d = 1;
	private static int currentBalance = 25000;

	@Override
	public JLabel move(Map<Integer, JLabel> map, int diceValue) {
		d += diceValue;
		if (d > 34) {
			currentBalance += 1500;
			d %= 34;
		}
		//map.get(d).setEnabled(false);
		return map.get(d);
	}

	public boolean isBoughtByMe(Set<JLabel> set1, JLabel lbl) {
		if (set1.contains(lbl))
			return true;
		return false;
	}

	public boolean isBoughtByComputer(Set<JLabel> set2, JLabel lbl) {
		if (set2.contains(lbl))
			return true;
		return false;
	}

	public void setPlayer1CurrentBalance(int currentBal) {
		currentBalance = currentBal;
	}

	public int getPlayer1CurrentBalance() {
		return currentBalance;
	}

}
