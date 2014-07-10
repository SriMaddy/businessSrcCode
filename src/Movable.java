import java.util.Map;

import javax.swing.JLabel;

public interface Movable {
	public abstract JLabel move(Map<Integer, JLabel> map, int diceValue);

}
