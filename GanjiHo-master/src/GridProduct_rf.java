import javax.swing.JLabel;
import java.io.Serializable;

public class GridProduct_rf implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblDraws;
	private int Draws = 0;
	public JLabel getLblDraws() {
		return lblDraws;
	}
	public void setLblDraws(JLabel lblDraws) {
		this.lblDraws = lblDraws;
	}
	public int getDraws() {
		return Draws;
	}

	public int setDraws(int Draws) {
		return this.Draws = Draws;
	}

	public void setlblDraws() {
		Draws++;
		lblDraws.setText(Draws + "");
	}
}