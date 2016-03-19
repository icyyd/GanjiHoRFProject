

import javax.swing.JLabel;
import java.io.Serializable;

public class GridProduct implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblVerticalWins;
	private int VerticalWins = 0;

	public JLabel getLblVerticalWins() {
		return lblVerticalWins;
	}

	public void setLblVerticalWins(JLabel lblVerticalWins) {
		this.lblVerticalWins = lblVerticalWins;
	}

	public int getVerticalWins() {
		return VerticalWins;
	}

	public int setVerticalWins(int VerticalWins) {
		return this.VerticalWins = VerticalWins;
	}

	public void setlblVerticalWins() {
		VerticalWins++;
		lblVerticalWins.setText(VerticalWins + "");
	}
}