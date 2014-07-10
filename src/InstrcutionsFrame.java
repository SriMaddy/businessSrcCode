import javax.swing.JFrame;

public class InstrcutionsFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public InstrcutionsFrame() {
		showFrame();
	}

	private void showFrame() {
		this.setTitle("BUSINESS GAME INSTRUCTIONS");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
