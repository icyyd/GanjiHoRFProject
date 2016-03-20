

import javax.swing.JLabel;
import java.io.Serializable;

public class GridProductProduct implements Serializable {
	private JLabel lblVerticalWins;

	public JLabel getLblVerticalWins() {
		return lblVerticalWins;
	}

	public void setLblVerticalWins(JLabel lblVerticalWins) {
		this.lblVerticalWins = lblVerticalWins;
	}

	public void setlblVerticalWins(GridProduct gridProduct) {
		gridProduct.setVerticalWins(gridProduct.getVerticalWins() + 1);
		lblVerticalWins.setText(gridProduct.getVerticalWins() + "");
	}
}