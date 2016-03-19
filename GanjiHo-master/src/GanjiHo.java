import java.awt.EventQueue;


public class GanjiHo {
	static int size= 64;
	
	public static void main (String args[]){
		
		EventQueue.invokeLater(new Runnable() {
			
			
			public void run() {
				try {
						Grid frame = new Grid(size);
						frame.setVisible(true);
						
					}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
}
