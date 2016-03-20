

import javax.swing.JLabel;
import java.io.Serializable;

public class GridProduct_rfProduct implements Serializable {
	private JLabel lblDraws;

	public JLabel getLblDraws() {
		return lblDraws;
	}

	public void setLblDraws(JLabel lblDraws) {
		this.lblDraws = lblDraws;
	}

	public void setlblDraws(GridProduct_rf gridProduct_rf) {
		gridProduct_rf.setDraws(gridProduct_rf.getDraws() + 1);
		lblDraws.setText(gridProduct_rf.getDraws() + "");
	}
}