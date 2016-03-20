import javax.swing.JLabel;
import java.io.Serializable;

public class GridProduct_rf implements Serializable {
	private GridProduct_rfProduct gridProduct_rfProduct = new GridProduct_rfProduct();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Draws = 0;
	public JLabel getLblDraws() {
		return gridProduct_rfProduct.getLblDraws();
	}
	public void setLblDraws(JLabel lblDraws) {
		gridProduct_rfProduct.setLblDraws(lblDraws);
	}
	public int getDraws() {
		return Draws;
	}

	public int setDrawsrf(int Draws) {
		return this.Draws = Draws;
	}

	public void setlblDrawsrf() {
		gridProduct_rfProduct.setlblDraws(this);
	}
	public void setDraws(int Draws) {
		this.Draws = Draws;
	}
}