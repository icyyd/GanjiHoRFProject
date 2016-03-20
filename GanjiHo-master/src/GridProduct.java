

import javax.swing.JLabel;
import java.io.Serializable;

public class GridProduct implements Serializable {
	private GridProductProduct gridProductProduct = new GridProductProduct();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int VerticalWins = 0;

	public JLabel getLblVerticalWins() {
		return gridProductProduct.getLblVerticalWins();
	}

	public void setLblVerticalWins(JLabel lblVerticalWins) {
		gridProductProduct.setLblVerticalWins(lblVerticalWins);
	}

	public int getVerticalWins() {
		return VerticalWins;
	}

	public int setVerticalWinsrf(int VerticalWins) {
		return this.VerticalWins = VerticalWins;
	}

	public void setlblVerticalWinsrf() {
		gridProductProduct.setlblVerticalWins(this);
	}

	public void setVerticalWins(int VerticalWins) {
		this.VerticalWins = VerticalWins;
	}
}