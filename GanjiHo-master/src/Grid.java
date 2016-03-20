import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class Grid extends JFrame  implements ActionListener {
		
	private GridProduct gridProduct = new GridProduct();
	private GridProduct_rf gridProduct_rf = new GridProduct_rf();
	public JLabelBox P1 ,P2 ,P3 ,P4 ,P5 ,P6 ,P7 ,P8 ,P9 ,P10,P11,P12,P13,P14,P15,P16,P17,P18,P19,P20,P21,P22,P23,P24,P25,P26,P27,P28,P29,P30,P31,P32,P33,P34,P35,P36,P37,P38,P39,P40,P41,P42,P43,P44,P45,P46,P47,P48,P49,P50,P51,P52,P53,P54,P55,P56,P57,P58,P59,P60,P61,P62,P63,P64,P65,P66,P67,P68,P69,P70,P71,P72,P73,P74,P75,P76,P77,P78,P79,P80,P81,P82,P83,P84,P85,P86,P87,P88,P89,P90,P91,P92,P93,P94,P95,P96,P97,P98,P99,P100,P101,P102,P103,P104,P105,P106,P107,P108,P109,P110,P111,P112,P113,P114,P115,P116,P117,P118,P119,P120,P121,P122,P123,P124,P125,P126,P127,P128,P129,P130,P131,P132,P133,P134,P135,P136,P137,P138,P139,P140,P141,P142,P143,P144,P145,P146,P147,P148,P149,P150,P151,P152,P153,P154,P155,P156,P157,P158,P159,P160,P161,P162,P163,P164,P165,P166,P167,P168,P169,P170,P171,P172,P173,P174,P175,P176,P177,P178,P179,P180,P181,P182,P183,P184,P185,P186,P187,P188,P189,P190,P191,P192,P193,P194,P195,P196,P197,P198,P199,P200,P201,P202,P203,P204,P205,P206,P207,P208,P209,P210,P211,P212,P213,P214,P215,P216,P217,P218,P219,P220,P221,P222,P223,P224,P225,P226,P227,P228,P229,P230,P231,P232,P233,P234,P235,P236,P237,P238,P239,P240,P241,P242,P243,P244,P245,P246,P247,P248,P249,P250,P251,P252,P253,P254,P255,P256,P257,P258,P259,P260,P261,P262,P263,P264,P265,P266,P267,P268,P269,P270,P271,P272,P273,P274,P275,P276,P277,P278,P279,P280,P281,P282,P283,P284,P285,P286,P287,P288,P289,P290,P291,P292,P293,P294,P295,P296,P297,P298,P299,P300,P301,P302,P303,P304,P305,P306,P307,P308,P309,P310,P311,P312,P313,P314,P315,P316,P317,P318,P319,P320,P321,P322,P323,P324,P325,P326,P327,P328,P329,P330,P331,P332,P333,P334,P335,P336,P337,P338,P339,P340,P341,P342,P343,P344,P345,P346,P347,P348,P349,P350,P351,P352,P353,P354,P355,P356,P357,P358,P359,P360,P361,P362,P363,P364,P365,P366,P367,P368,P369,P370,P371,P372,P373,P374,P375,P376,P377,P378,P379,P380,P381,P382,P383,P384,P385,P386,P387,P388,P389,P390,P391,P392,P393,P394,P395,P396,P397,P398,P399,P400,P401,P402,P403,P404,P405,P406,P407,P408,P409,P410,P411,P412,P413,P414,P415,P416,P417,P418,P419,P420,P421,P422,P423,P424,P425,P426,P427,P428,P429,P430,P431,P432,P433,P434,P435,P436,P437,P438,P439,P440,P441,P442,P443,P444,P445,P446,P447,P448,P449,P450,P451,P452,P453,P454,P455,P456,P457,P458,P459,P460,P461,P462,P463,P464,P465,P466,P467,P468,P469,P470,P471,P472,P473,P474,P475,P476,P477,P478,P479,P480,P481,P482,P483,P484,P485,P486,P487,P488,P489,P490,P491,P492,P493,P494,P495,P496,P497,P498,P499,P500,P501,P502,P503,P504,P505,P506,P507,P508,P509,P510,P511,P512,P513,P514,P515,P516,P517,P518,P519,P520,P521,P522,P523,P524,P525,P526,P527,P528,P529,P530,P531,P532,P533,P534,P535,P536,P537,P538,P539,P540,P541,P542,P543,P544,P545,P546,P547,P548,P549,P550,P551,P552,P553,P554,P555,P556,P557,P558,P559,P560,P561,P562,P563,P564,P565,P566,P567,P568,P569,P570,P571,P572,P573,P574,P575,P576,P577,P578,P579,P580,P581,P582,P583,P584,P585,P586,P587,P588,P589,P590,P591,P592,P593,P594,P595,P596,P597,P598,P599,P600;
    public JLabelBox[] Label= {P1 ,P2 ,P3 ,P4 ,P5 ,P6 ,P7 ,P8 ,P9 ,P10,P11,P12,P13,P14,P15,P16,P17,P18,P19,P20,P21,P22,P23,P24,P25,P26,P27,P28,P29,P30,P31,P32,P33,P34,P35,P36,P37,P38,P39,P40,P41,P42,P43,P44,P45,P46,P47,P48,P49,P50,P51,P52,P53,P54,P55,P56,P57,P58,P59,P60,P61,P62,P63,P64,P65,P66,P67,P68,P69,P70,P71,P72,P73,P74,P75,P76,P77,P78,P79,P80,P81,P82,P83,P84,P85,P86,P87,P88,P89,P90,P91,P92,P93,P94,P95,P96,P97,P98,P99,P100,P101,P102,P103,P104,P105,P106,P107,P108,P109,P110,P111,P112,P113,P114,P115,P116,P117,P118,P119,P120,P121,P122,P123,P124,P125,P126,P127,P128,P129,P130,P131,P132,P133,P134,P135,P136,P137,P138,P139,P140,P141,P142,P143,P144,P145,P146,P147,P148,P149,P150,P151,P152,P153,P154,P155,P156,P157,P158,P159,P160,P161,P162,P163,P164,P165,P166,P167,P168,P169,P170,P171,P172,P173,P174,P175,P176,P177,P178,P179,P180,P181,P182,P183,P184,P185,P186,P187,P188,P189,P190,P191,P192,P193,P194,P195,P196,P197,P198,P199,P200,P201,P202,P203,P204,P205,P206,P207,P208,P209,P210,P211,P212,P213,P214,P215,P216,P217,P218,P219,P220,P221,P222,P223,P224,P225,P226,P227,P228,P229,P230,P231,P232,P233,P234,P235,P236,P237,P238,P239,P240,P241,P242,P243,P244,P245,P246,P247,P248,P249,P250,P251,P252,P253,P254,P255,P256,P257,P258,P259,P260,P261,P262,P263,P264,P265,P266,P267,P268,P269,P270,P271,P272,P273,P274,P275,P276,P277,P278,P279,P280,P281,P282,P283,P284,P285,P286,P287,P288,P289,P290,P291,P292,P293,P294,P295,P296,P297,P298,P299,P300,P301,P302,P303,P304,P305,P306,P307,P308,P309,P310,P311,P312,P313,P314,P315,P316,P317,P318,P319,P320,P321,P322,P323,P324,P325,P326,P327,P328,P329,P330,P331,P332,P333,P334,P335,P336,P337,P338,P339,P340,P341,P342,P343,P344,P345,P346,P347,P348,P349,P350,P351,P352,P353,P354,P355,P356,P357,P358,P359,P360,P361,P362,P363,P364,P365,P366,P367,P368,P369,P370,P371,P372,P373,P374,P375,P376,P377,P378,P379,P380,P381,P382,P383,P384,P385,P386,P387,P388,P389,P390,P391,P392,P393,P394,P395,P396,P397,P398,P399,P400,P401,P402,P403,P404,P405,P406,P407,P408,P409,P410,P411,P412,P413,P414,P415,P416,P417,P418,P419,P420,P421,P422,P423,P424,P425,P426,P427,P428,P429,P430,P431,P432,P433,P434,P435,P436,P437,P438,P439,P440,P441,P442,P443,P444,P445,P446,P447,P448,P449,P450,P451,P452,P453,P454,P455,P456,P457,P458,P459,P460,P461,P462,P463,P464,P465,P466,P467,P468,P469,P470,P471,P472,P473,P474,P475,P476,P477,P478,P479,P480,P481,P482,P483,P484,P485,P486,P487,P488,P489,P490,P491,P492,P493,P494,P495,P496,P497,P498,P499,P500,P501,P502,P503,P504,P505,P506,P507,P508,P509,P510,P511,P512,P513,P514,P515,P516,P517,P518,P519,P520,P521,P522,P523,P524,P525,P526,P527,P528,P529,P530,P531,P532,P533,P534,P535,P536,P537,P538,P539,P540,P541,P542,P543,P544,P545,P546,P547,P548,P549,P550,P551,P552,P553,P554,P555,P556,P557,P558,P559,P560,P561,P562,P563,P564,P565,P566,P567,P568,P569,P570,P571,P572,P573,P574,P575,P576,P577,P578,P579,P580,P581,P582,P583,P584,P585,P586,P587,P588,P589,P590,P591,P592,P593,P594,P595,P596,P597,P598,P599,P600};
	    private JPanel contentPane;
		private JButton btnNewGame, btnReset, btnCvP, btnPvP, btnPvC ;
		private JTextArea edtDebug;      
		private JLabel lblHorizontalWins;
		private JLabel lblHorizontalWins_1;
		private JLabel lblVerticalWins_1;
		private JLabel lblDraws_1;
		private int arrayCounter=0 ;
		private int size;
		public int childnum=0;
		public int HorizontalWins=0;
		public int nummoves=0;
		private boolean PvP = false;
		private boolean CvP = false;
		private boolean PvC = false;
		int turn =1;
		public  int firstMove=0;
		public String[] CopyNew =  new String[size];
		
		
		
			Grid(int size) {
					this.size=size;
					setResizable(false);
					setTitle("Ganji Ho - Yeghia");
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setBounds(100, 100, 1300,1000 );
					
					contentPane = new JPanel();
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					setContentPane(contentPane);
				    contentPane.setLayout(null);
				   
				    for(int y =0  ; y <(66*Math.sqrt(size)) ; y+=66)
				    {
				    	for(int x =0  ; x <(66*Math.sqrt(size)) ; x+=66)
				    	{
					    	Label[arrayCounter]=  new JLabelBox();
					    	Label[arrayCounter].Field = arrayCounter+1;
					    	Label[arrayCounter].addMouseListener(new LabelAdapter(Label[arrayCounter]));
					    	Label[arrayCounter].setOpaque(true);
					    	Label[arrayCounter].setHorizontalAlignment(SwingConstants.CENTER);
					    	Label[arrayCounter].setFont(new Font("Tahoma", Font.BOLD, 49));
					    	Label[arrayCounter].setForeground(Color.GREEN);
					    	Label[arrayCounter].setBackground(new Color(70, 130, 180));
					    	int xx= 10+x;
					    	int yy=10+y;
					    	Label[arrayCounter].setBounds(xx,yy, 64, 64);
					    	contentPane.add(Label[arrayCounter]);
					    	arrayCounter++;
				    	}
				     }
				   
					btnNewGame = new JButton("New game");
					btnNewGame.addActionListener(this);
					btnNewGame.setBounds(1100, 127, 185, 23);
					contentPane.add(btnNewGame);
			
					lblHorizontalWins = new JLabel("0");
					lblHorizontalWins.setFont(new Font("Tahoma", Font.BOLD, 17));
					lblHorizontalWins.setBounds(1270, 13, 169, 36);
					contentPane.add(lblHorizontalWins);
			
					gridProduct.setLblVerticalWins(new JLabel("0"));
					gridProduct.getLblVerticalWins().setFont(new Font("Tahoma", Font.BOLD, 17));
					gridProduct.getLblVerticalWins().setBounds(1270, 46, 169, 36);
					contentPane.add(gridProduct.getLblVerticalWins());
			
					gridProduct_rf.setLblDraws(new JLabel("0"));
					gridProduct_rf.getLblDraws().setFont(new Font("Tahoma", Font.BOLD, 17));
					gridProduct_rf.getLblDraws().setBounds(1270, 84, 169, 30);
					contentPane.add(gridProduct_rf.getLblDraws());
			
					lblHorizontalWins_1 = new JLabel("Horizontal wins:");
					lblHorizontalWins_1.setFont(new Font("Tahoma", Font.BOLD, 17));
					lblHorizontalWins_1.setHorizontalAlignment(SwingConstants.RIGHT);
					lblHorizontalWins_1.setBounds(1100, 13, 150, 36);
					contentPane.add(lblHorizontalWins_1);
					
					lblVerticalWins_1 = new JLabel("Vertical Wins:");
					lblVerticalWins_1.setFont(new Font("Tahoma", Font.BOLD, 17));
					lblVerticalWins_1.setHorizontalAlignment(SwingConstants.RIGHT);
					lblVerticalWins_1.setBounds(1077, 46, 150, 36);
					contentPane.add(lblVerticalWins_1);
			
					lblDraws_1 = new JLabel("Draws:");
					lblDraws_1.setFont(new Font("Tahoma", Font.BOLD, 17));
					lblDraws_1.setHorizontalAlignment(SwingConstants.RIGHT);
					lblDraws_1.setBounds(1095, 84, 76, 30);
					contentPane.add(lblDraws_1);
					
					btnReset = new JButton("Reset");
					btnReset.setBounds(1100, 216, 185, 23);
					btnReset.addActionListener(this);
					contentPane.add(btnReset);
					
					btnPvP = new JButton("Player VS Player");
					btnPvP.setBounds(1100, 185, 185, 23);
					btnPvP.addActionListener(this);
					contentPane.add(btnPvP);
			
					btnCvP = new JButton("Computer VS Player");
					btnCvP.setBounds(1100, 155, 185, 23);
					btnCvP.addActionListener(this);
					contentPane.add(btnCvP);
					
					
					btnPvC = new JButton("pLAYER against computer");
					btnPvC.setBounds(1100, 255, 185, 23);
					btnPvC.addActionListener(this);
					contentPane.add(btnPvC);
					
					
					
					edtDebug = new JTextArea();
					edtDebug.setFont(new Font("Tahoma", Font.BOLD, 12));
					edtDebug.setForeground(new Color(0, 255, 0));
					edtDebug.setBackground(new Color(0, 0, 0));
					edtDebug.setBounds(10, 0, 485, 600);
					contentPane.add(edtDebug);
			
					JScrollPane scrollBar = new JScrollPane(edtDebug);
					scrollBar.setBounds(800, 250, 485, 600);
					scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					
					contentPane.add(scrollBar);
				}
				
			public class JLabelBox extends JLabel{
				
				public int Field = 0;
				public String b = " bl";
				}
				public void setDebug(String text)
				{
					edtDebug.setText(text);
				}
			
				public void setlblHorizontalWins()
				{
					HorizontalWins++;
					lblHorizontalWins.setText(HorizontalWins + "");
				}
				
				public void  setlblVerticalWins()
				{
					gridProduct.setlblVerticalWins();
				}
				
				public void setlblDraws()
				{
					gridProduct_rf.setlblDraws();
				}
				
				//Used for resetting the counter labels
				public void resetCounters()
				{
					HorizontalWins = gridProduct.setVerticalWins(gridProduct_rf.setDraws(0));
					lblHorizontalWins.setText(HorizontalWins + "");
					gridProduct.getLblVerticalWins().setText(gridProduct.getVerticalWins() + "");
					gridProduct_rf.getLblDraws().setText(gridProduct_rf.getDraws() + "");
					firstMove=0;
					turn=1;
					for(int i=0; i<size; i++)
						Label[i].setText("");
					
				}
				
				public void actionPerformed(ActionEvent e) {

					if (e.getSource() == btnNewGame) {
						for(int i=0; i<size; i++)
							Label[i].setText("");
						turn=1;
						firstMove=0;
						nummoves=0;
					}

					else if (e.getSource() == btnReset) {
						resetCounters();
					}

					else if (e.getSource() == btnCvP) {
						PvP = false;
						CvP = true;
						PvC = false;
						
						turn =1;
					}
					
					else if( e.getSource() == btnPvP){
						PvP = true;
						CvP = false;
						PvC = false;
						turn =1;
					}
					
					else if( e.getSource() == btnPvC){
						PvP = false; // player vs player
						CvP = false; //pc start
						PvC = true; // player start
						
						turn =1;
					}
				}
				
				public class LabelAdapter extends MouseAdapter {
					JLabelBox sender;
					
					
					public LabelAdapter(JLabelBox sender) {
						this.sender = sender;
					}
					
					//Whether vertical is allowed to place
					public boolean canVerticalPlace(int Currentmove )
					{
						if(getInfo(Currentmove)=="")
							if( Currentmove > (Math.sqrt(size)) )
								if(getInfo((int) (Currentmove-(Math.sqrt(size))))=="")
									return true;
						return false;
					}
					
					//Whether horizontal is allowed to place
					public boolean canHorizontalPlace(int Currentmove )
					{
						 if(getInfo(Currentmove)=="")
							if( Currentmove%(Math.sqrt(size))!=0 )
								if(getInfo(Currentmove+1)=="")
									return true;
						return false;
					}
					
					public String getInfo(int field)
					{
						for(int i=0; i<size; i++)
						{
							if(Label[i].Field==field)
								return Label[i].getText();
						}
						return "";
					}
					
				    public boolean checkDraw()
					{
						for(int i=0; i<size; i++)
						{
							if(Label[i].getText()=="")
								return false;
						}
						return true;
					}
				    
				    
					public int numberVerticalMoves()
					{
						int numberofVMoves=0;
						edtDebug.setText("");
						String moves = moves_rf4();
						for(int i=1; i<=(size-Math.sqrt(size)); i++)
						{
							if(Label[i-1].getText()=="" && Label[(int) ((i-1)+Math.sqrt(size))].getText()=="" )
							{
								numberofVMoves++;
							}
						}
						//System.out.println(moves);
						return 	numberofVMoves;
					}

					private String moves_rf4() {
						String moves = "vertical   ";
						for (int i = 1; i <= (size - Math.sqrt(size)); i++) {
							if (Label[i - 1].getText() == ""
									&& Label[(int) ((i - 1) + Math.sqrt(size))].getText() == "") {
								moves = moves + Integer.toString(Label[i - 1].Field) + ";"
										+ Integer.toString(Label[(int) ((i - 1) + Math.sqrt(size))].Field) + "\t";
							}
						}
						return moves;
					}
					
					
					public void hGenerateMoves()
					{
						String moves = moves();
						int numberofHMoves = numberofHMoves();
						edtDebug.setText("");
						edtDebug.setText("hotrizontal moves\n"+moves+"\n"            +"number of moves:"+Integer.toString(numberofHMoves));
					}

					private int numberofHMoves() {
						int numberofHMoves = 0;
						for (int i = 1; i < size; i++) {
							if (Label[i - 1].getText() == "" && Label[i].getText() == ""
									&& i % (Math.sqrt(size)) != 0) {
								numberofHMoves++;
							}
						}
						return numberofHMoves;
					}

					private String moves() {
						int numberofHMoves = 0;
						String moves = new String();
						for (int i = 1; i < size; i++) {
							numberofHMoves = numberofHMoves_rf2(numberofHMoves, i);
							if (Label[i - 1].getText() == "" && Label[i].getText() == ""
									&& i % (Math.sqrt(size)) != 0) {
								if (numberofHMoves % 5 == 0)
									moves = moves + Integer.toString(Label[i - 1].Field) + ";"
											+ Integer.toString(Label[i].Field) + "\n";
								else
									moves = moves + Integer.toString(Label[i - 1].Field) + ";"
											+ Integer.toString(Label[i].Field) + "\t";
							}
						}
						return moves;
					}

					private int numberofHMoves_rf2(int numberofHMoves, int i) {
						if (Label[i - 1].getText() == "" && Label[i].getText() == "" && i % (Math.sqrt(size)) != 0) {
							numberofHMoves++;
						}
						return numberofHMoves;
					}
					
					
				public int numberHorizontalMoves()
					{
						int numberofHMoves=0;
						edtDebug.setText("");
						String moves = moves_rf3();
						for(int i=1; i<size; i++)
						{
							if(Label[i-1].getText()=="" && Label[i].getText()=="" && i%(Math.sqrt(size))!=0 )
							{
								numberofHMoves++;
							}
						}	
						//System.out.println(moves);
						return numberofHMoves;
					}

				private String moves_rf3() {
					String moves = "horizontal ";
					for (int i = 1; i < size; i++) {
						if (Label[i - 1].getText() == "" && Label[i].getText() == "" && i % (Math.sqrt(size)) != 0) {
							moves = moves + Integer.toString(Label[i - 1].Field) + ";"
									+ Integer.toString(Label[i].Field) + "\t";
						}
					}
					return moves;
				}
					
					public void vGenerateMoves()
					{
						String moves = moves_rf2();
						int numberofVMoves = numberofVMoves();
						edtDebug.setText("vertical moves\n"+moves+"\n"            +"number of moves:"+Integer.toString(numberofVMoves));
					}

					private int numberofVMoves() {
						int numberofVMoves = 0;
						for (int i = 1; i <= (size - Math.sqrt(size)); i++) {
							if (Label[i - 1].getText() == ""
									&& Label[(int) ((i - 1) + Math.sqrt(size))].getText() == "") {
								numberofVMoves++;
							}
						}
						return numberofVMoves;
					}

					private String moves_rf2() {
						int numberofVMoves = 0;
						String moves = new String();
						for (int i = 1; i <= (size - Math.sqrt(size)); i++) {
							numberofVMoves = numberofVMoves_rf2(numberofVMoves, i);
							if (Label[i - 1].getText() == ""
									&& Label[(int) ((i - 1) + Math.sqrt(size))].getText() == "") {
								if (numberofVMoves % 5 == 0)
									moves = moves + Integer.toString(Label[i - 1].Field) + ";"
											+ Integer.toString(Label[(int) ((i - 1) + Math.sqrt(size))].Field) + "\n";
								else
									moves = moves + Integer.toString(Label[i - 1].Field) + ";"
											+ Integer.toString(Label[(int) ((i - 1) + Math.sqrt(size))].Field) + "\t";
							}
						}
						return moves;
					}

					private int numberofVMoves_rf2(int numberofVMoves, int i) {
						if (Label[i - 1].getText() == "" && Label[(int) ((i - 1) + Math.sqrt(size))].getText() == "") {
							numberofVMoves++;
						}
						return numberofVMoves;
					}

				       
					 public void PlayerVPlayer(){
						
						if(turn ==1)
						{
							if(canVerticalPlace(sender.Field))
							{
								sender.setForeground(Color.white);
								sender.setText("V");
								Label[(int) (sender.Field-Math.sqrt(size)-1)].setForeground(Color.white);
								Label[(int) (sender.Field-Math.sqrt(size)-1)].setText("V");
								if(checkDraw())
								{
									 edtDebug.setText("Draw");
									 gridProduct_rf.setlblDraws();
								}
								else if(numberHorizontalMoves()==0)
								 {
									 edtDebug.setText("Vertical Won!");
									 gridProduct.setlblVerticalWins();
								 }
								turn = turn *-1;
							}
							else
								edtDebug.setText("Vertical you cant place there you fool!");	
						}
						else
						{
							if(canHorizontalPlace(sender.Field))
							{
								sender.setForeground(Color.black);
								sender.setText("H");
								Label[(int) (sender.Field)].setForeground(Color.black);
								Label[sender.Field].setText("H");
								if(checkDraw())
								{
									 edtDebug.setText("Draw");
									 gridProduct_rf.setlblDraws();
								}
								else if(numberVerticalMoves()==0)
								 {
									 edtDebug.setText("Horizontal Won!");
									 setlblHorizontalWins();
								 }
								turn = turn *-1;
							}
							else
								edtDebug.setText("Horizontal you cant place there you fool!");
						}
						
					}
					
					
					public ArrayList<String> vGenerateMoves2()
					{
						
						ArrayList<String> nodes = new ArrayList<String>();
						
						for(int i=1; i<=(size-Math.sqrt(size)); i++)
						{
							if(Label[i-1].getText()=="" && Label[(int) ((i-1)+Math.sqrt(size))].getText()=="" )
								nodes.add(Integer.toString(Label[i-1].Field) +";"+Integer.toString(Label[(int) ((i-1)+Math.sqrt(size))].Field));
						}
						return nodes;
						
					}
					
					public ArrayList<Node> vGenerateMoves3()
					{
						
						ArrayList<Node> nodes = new ArrayList<Node>();
						
						for(int i=1; i<=(size-Math.sqrt(size)); i++)
						{
							if(Label[i-1].getText()=="" && Label[(int) ((i-1)+Math.sqrt(size))].getText()=="" )
							nodes.add(new Node(Integer.toString(Label[i-1].Field) +";"+Integer.toString(Label[(int) ((i-1)+Math.sqrt(size))].Field)));
						}
						return nodes;
						
					}
					
					
					public ArrayList<Node> vGenerateMovesCopy(String Copy[])
					{
						
						ArrayList<Node> nodes = new ArrayList<Node>();
						
						for(int i=1; i<=(size-Math.sqrt(size)); i++)
						{
							if(Copy[i-1]=="-" && Copy[(int) ((i-1)+Math.sqrt(size))]=="-" )
								nodes.add(new Node(Integer.toString(i) +";"+Integer.toString((int) ((int)   (i)+Math.sqrt(size)))       )          );
						}
						return nodes;
					}
					
					public int vCountMovesCopy(String Copy[])
					{
						
						int count=0;
						
						for(int i=1; i<=(size-Math.sqrt(size)); i++)
						{
							if(Copy[i-1]=="-" && Copy[(int) ((i-1)+Math.sqrt(size))]=="-" )
								count++;
						}
						return count;
						//if(Label[i-1].getText()=="" && Label[(int) ((i-1)+Math.sqrt(size))].getText()=="" )
					}
					
					
					public ArrayList<Node> hGenerateMovesCopy(String Copy[])
					{
						ArrayList<Node> nodes = new ArrayList<Node>();
						for(int i=1; i<size; i++)
						{
							if(Copy[i-1]=="-" && Copy[i]=="-" && i%(Math.sqrt(size))!=0 )
							{
								
								nodes.add(new Node(Integer.toString(i) +";"+Integer.toString(i+1)));
							}
						}	
						return nodes;
					}
					
					
					public int hcountMovesCopy(String Copy[])
					{
						int count=0;
						for(int i=1; i<size; i++)
						{
							if(Copy[i-1]=="-" && Copy[i]=="-" && i%(Math.sqrt(size))!=0 )
							{
								
								count++;
							}
						}	
						return count;
					}
					
					public  Node buildTree5H()
					{
						Node root = new Node("");
						root.setAlpha(-1000);
						root.setBeta(1000);
						String[] Copy =  new String[size];
						for(int i=0;i<size;i++)
						{
							if(Label[i].getText()=="")
								Copy[i]="-";
							else
								Copy[i]=Label[i].getText();
						}
										ArrayList<Node> depth1treelist=hGenerateMovesCopy(Copy);
										int mindepth1 =1000;
										
										
										for (Node depth1 : depth1treelist) 
										{
											if(root.getAlpha()>=root.getBeta())
												break;
											else
											{
												depth1.setAlpha(root.getAlpha());
												depth1.setBeta(root.getBeta());
												String dept1tree=depth1.getName();
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="H";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="H";
												
												ArrayList<Node> depth2treelist=vGenerateMovesCopy(Copy);
												int maxdepth2 =-1000;
												for (Node depth2 : depth2treelist) 
												{
													
													if(depth1.getAlpha()>=depth1.getBeta())
														break;
													else
													{
														depth2.setAlpha(depth1.getAlpha());
														depth2.setBeta(depth1.getBeta());
														String dept2tree=depth2.getName();
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="V";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="V";
														
														ArrayList<Node> depth3treelist=hGenerateMovesCopy(Copy);
														int mindepth3 =1000;
														for (Node depth3 : depth3treelist) 
														{
															
															if(depth2.getAlpha()>=depth2.getBeta())
																break;
															else
															{
																depth3.setAlpha(depth2.getAlpha());
																depth3.setBeta(depth2.getBeta());
																String dept3tree=depth3.getName();
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="H";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="H";
																ArrayList<Node> depth4treelist=vGenerateMovesCopy(Copy);
																int maxdepth4 =-1000;
																for (Node depth4 : depth4treelist) 
																{
															
																		if(depth3.getAlpha()>=depth3.getBeta())
																			break;
																		else
																		{
																			depth4.setAlpha(depth3.getAlpha());
																			depth4.setBeta(depth3.getBeta());
																			String dept4tree=depth4.getName();
																			Copy[Integer.parseInt(dept4tree.substring(0,dept4tree.indexOf(';')))-1]="V";
																			Copy[Integer.parseInt(dept4tree.substring(dept4tree.indexOf(';')+1))-1]="V";
																			
																			
																			
																			ArrayList<Node> depth5treelist=hGenerateMovesCopy(Copy);
																			int mindepth5 =1000;
																			for (Node depth5 : depth5treelist) 
																			{
																		
																					if(depth4.getAlpha()>=depth4.getBeta())
																						break;
																					else
																					{
																						
																						depth5.setAlpha(depth4.getAlpha());
																						depth5.setBeta(depth4.getBeta());
																						String dept5tree=depth5.getName();
																						
																						Copy[Integer.parseInt(dept5tree.substring(0,dept5tree.indexOf(';')))-1]="H";
																						Copy[Integer.parseInt(dept5tree.substring(dept5tree.indexOf(';')+1))-1]="H";
																						depth5.setValue(vCountMovesCopy(Copy)- hcountMovesCopy(Copy));
																						
																						if (depth5.getValue()<mindepth5)
																						{
																							mindepth5=depth5.getValue();
																							////////////////////////////
																							depth4.setBeta(mindepth5);
																							depth4.setValue(mindepth5);
																						}
																						Copy[Integer.parseInt(dept5tree.substring(0,dept5tree.indexOf(';')))-1]="-";
																						Copy[Integer.parseInt(dept5tree.substring(dept5tree.indexOf(';')+1))-1]="-";
																						childnum++;
																					}
																			}
																			
																			
																			
																			
																			
																			if (depth4.getValue()>maxdepth4)
																			{
																				maxdepth4=depth4.getValue();
																				////////////////////////////
																				depth3.setBeta(maxdepth4);
																				depth3.setValue(maxdepth4);
																			}
																			Copy[Integer.parseInt(dept4tree.substring(0,dept4tree.indexOf(';')))-1]="-";
																			Copy[Integer.parseInt(dept4tree.substring(dept4tree.indexOf(';')+1))-1]="-";
																			
																		}
																}
																if (depth3.getValue()<mindepth3)
																{
																	mindepth3=depth3.getValue();
																	////////////////////////////
																	depth2.setBeta(mindepth3);
																	depth2.setValue(mindepth3);
																}
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="-";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="-";
																
															}
														}
														
														if (depth2.getValue()>maxdepth2)
														{
															maxdepth2=depth2.getValue();
															///////////////////////////
															depth1.setAlpha(maxdepth2);
															depth1.setValue(maxdepth2);
														}
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="-";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="-";
													}
												}
												///////////////////////////////////
												//System.out.println("depth 1 "+ depth1.getName()+" "+depth1.getValue());
												//System.out.println();
												if (depth1.getValue()<mindepth1)
												{
													mindepth1=depth1.getValue();
													//////////////////////////
													root.setBeta(mindepth1);
													root.setValue(mindepth1);
													root.setName(depth1.getName());
												}
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="-";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="-";
											}
										}
										
										return root;
								}
					
					public  Node buildTree5V()
					{
						Node root = new Node("");
						root.setAlpha(-1000);
						root.setBeta(1000);
						String[] Copy =  new String[size];
						for(int i=0;i<size;i++)
						{
							if(Label[i].getText()=="")
								Copy[i]="-";
							else
								Copy[i]=Label[i].getText();
						}
										ArrayList<Node> depth1treelist=vGenerateMovesCopy(Copy);
										int mindepth1 =1000;
										
										
										for (Node depth1 : depth1treelist) 
										{
											if(root.getAlpha()>=root.getBeta())
												break;
											else
											{
												depth1.setAlpha(root.getAlpha());
												depth1.setBeta(root.getBeta());
												String dept1tree=depth1.getName();
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="V";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="V";
												
												ArrayList<Node> depth2treelist=hGenerateMovesCopy(Copy);
												int maxdepth2 =-1000;
												for (Node depth2 : depth2treelist) 
												{
													
													if(depth1.getAlpha()>=depth1.getBeta())
														break;
													else
													{
														depth2.setAlpha(depth1.getAlpha());
														depth2.setBeta(depth1.getBeta());
														String dept2tree=depth2.getName();
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="H";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="H";
														
														ArrayList<Node> depth3treelist=vGenerateMovesCopy(Copy);
														int mindepth3 =1000;
														for (Node depth3 : depth3treelist) 
														{
															
															if(depth2.getAlpha()>=depth2.getBeta())
																break;
															else
															{
																depth3.setAlpha(depth2.getAlpha());
																depth3.setBeta(depth2.getBeta());
																String dept3tree=depth3.getName();
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="V";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="V";
																ArrayList<Node> depth4treelist=hGenerateMovesCopy(Copy);
																int maxdepth4 =-1000;
																for (Node depth4 : depth4treelist) 
																{
															
																		if(depth3.getAlpha()>=depth3.getBeta())
																			break;
																		else
																		{
																			depth4.setAlpha(depth3.getAlpha());
																			depth4.setBeta(depth3.getBeta());
																			String dept4tree=depth4.getName();
																			Copy[Integer.parseInt(dept4tree.substring(0,dept4tree.indexOf(';')))-1]="H";
																			Copy[Integer.parseInt(dept4tree.substring(dept4tree.indexOf(';')+1))-1]="H";
																			
																			
																			
																			ArrayList<Node> depth5treelist=vGenerateMovesCopy(Copy);
																			int mindepth5 =1000;
																			for (Node depth5 : depth5treelist) 
																			{
																		
																					if(depth4.getAlpha()>=depth4.getBeta())
																						break;
																					else
																					{
																						
																						depth5.setAlpha(depth4.getAlpha());
																						depth5.setBeta(depth4.getBeta());
																						String dept5tree=depth5.getName();
																						//System.out.println(dept5tree);
																						//Copy[Integer.parseInt(dept5tree.substring(0,dept5tree.indexOf(';')))-1]="V";
																						//Copy[Integer.parseInt(dept5tree.substring(dept4tree.indexOf(';')+1))-1]="V";
																						Copy[Integer.parseInt(dept5tree.substring(0,dept5tree.indexOf(';')))-1]="V";
																						Copy[Integer.parseInt(dept5tree.substring(dept5tree.indexOf(';')+1))-1]="V";
																						depth5.setValue(hcountMovesCopy(Copy)-vCountMovesCopy(Copy));
																						
																						if (depth5.getValue()<mindepth5)
																						{
																							mindepth5=depth5.getValue();
																							////////////////////////////
																							depth4.setBeta(mindepth5);
																							depth4.setValue(mindepth5);
																						}
																						Copy[Integer.parseInt(dept5tree.substring(0,dept5tree.indexOf(';')))-1]="-";
																						Copy[Integer.parseInt(dept5tree.substring(dept5tree.indexOf(';')+1))-1]="-";
																						childnum++;
																					}
																			}
																			
																			
																			
																			
																			
																			if (depth4.getValue()>maxdepth4)
																			{
																				maxdepth4=depth4.getValue();
																				////////////////////////////
																				depth3.setBeta(maxdepth4);
																				depth3.setValue(maxdepth4);
																			}
																			Copy[Integer.parseInt(dept4tree.substring(0,dept4tree.indexOf(';')))-1]="-";
																			Copy[Integer.parseInt(dept4tree.substring(dept4tree.indexOf(';')+1))-1]="-";
																			
																		}
																}
																if (depth3.getValue()<mindepth3)
																{
																	mindepth3=depth3.getValue();
																	////////////////////////////
																	depth2.setBeta(mindepth3);
																	depth2.setValue(mindepth3);
																}
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="-";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="-";
																
															}
														}
														
														if (depth2.getValue()>maxdepth2)
														{
															maxdepth2=depth2.getValue();
															///////////////////////////
															depth1.setAlpha(maxdepth2);
															depth1.setValue(maxdepth2);
														}
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="-";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="-";
													}
												}
												///////////////////////////////////
												//System.out.println("depth 1 "+ depth1.getName()+" "+depth1.getValue());
												//System.out.println();
												if (depth1.getValue()<mindepth1)
												{
													mindepth1=depth1.getValue();
													//////////////////////////
													root.setBeta(mindepth1);
													root.setValue(mindepth1);
													root.setName(depth1.getName());
												}
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="-";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="-";
											}
										}
										
										return root;
								}
					
					public  Node buildTree4V()
					{
						Node root = new Node("");
						root.setAlpha(-1000);
						root.setBeta(1000);
						String[] Copy =  new String[size];
						for(int i=0;i<size;i++)
						{
							if(Label[i].getText()=="")
								Copy[i]="-";
							else
								Copy[i]=Label[i].getText();
						}
										ArrayList<Node> depth1treelist=vGenerateMovesCopy(Copy);
										int mindepth1 =1000;
										
										
										for (Node depth1 : depth1treelist) 
										{
											if(root.getAlpha()>=root.getBeta())
												break;
											else
											{
												depth1.setAlpha(root.getAlpha());
												depth1.setBeta(root.getBeta());
												String dept1tree=depth1.getName();
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="V";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="V";
												
												ArrayList<Node> depth2treelist=hGenerateMovesCopy(Copy);
												int maxdepth2 =-1000;
												for (Node depth2 : depth2treelist) 
												{
													
													if(depth1.getAlpha()>=depth1.getBeta())
														break;
													else
													{
														depth2.setAlpha(depth1.getAlpha());
														depth2.setBeta(depth1.getBeta());
														String dept2tree=depth2.getName();
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="H";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="H";
														
														ArrayList<Node> depth3treelist=vGenerateMovesCopy(Copy);
														int mindepth3 =1000;
														for (Node depth3 : depth3treelist) 
														{
															
															if(depth2.getAlpha()>=depth2.getBeta())
																break;
															else
															{
																depth3.setAlpha(depth2.getAlpha());
																depth3.setBeta(depth2.getBeta());
																String dept3tree=depth3.getName();
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="V";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="V";
																ArrayList<Node> depth4treelist=hGenerateMovesCopy(Copy);
																int maxdepth4 =-1000;
																for (Node depth4 : depth4treelist) 
																{
															
																		if(depth3.getAlpha()>=depth3.getBeta())
																			break;
																		else
																		{
																			depth4.setAlpha(depth3.getAlpha());
																			depth4.setBeta(depth3.getBeta());
																			String dept4tree=depth4.getName();
																			Copy[Integer.parseInt(dept4tree.substring(0,dept4tree.indexOf(';')))-1]="H";
																			Copy[Integer.parseInt(dept4tree.substring(dept4tree.indexOf(';')+1))-1]="H";
																			depth4.setValue(hcountMovesCopy(Copy)-vCountMovesCopy(Copy));
																			//System.out.println("depth3 "+depth3.getName()+" "+depth3.getValue());
																			if (depth4.getValue()>maxdepth4)
																			{
																				maxdepth4=depth4.getValue();
																				////////////////////////////
																				depth3.setBeta(maxdepth4);
																				depth3.setValue(maxdepth4);
																			}
																			Copy[Integer.parseInt(dept4tree.substring(0,dept4tree.indexOf(';')))-1]="-";
																			Copy[Integer.parseInt(dept4tree.substring(dept4tree.indexOf(';')+1))-1]="-";
																			childnum++;
																		}
																}
																if (depth3.getValue()<mindepth3)
																{
																	mindepth3=depth3.getValue();
																	////////////////////////////
																	depth2.setBeta(mindepth3);
																	depth2.setValue(mindepth3);
																}
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="-";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="-";
																
															}
														}
														
														if (depth2.getValue()>maxdepth2)
														{
															maxdepth2=depth2.getValue();
															///////////////////////////
															depth1.setAlpha(maxdepth2);
															depth1.setValue(maxdepth2);
														}
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="-";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="-";
													}
												}
												///////////////////////////////////
												//System.out.println("depth 1 "+ depth1.getName()+" "+depth1.getValue());
												//System.out.println();
												if (depth1.getValue()<mindepth1)
												{
													mindepth1=depth1.getValue();
													//////////////////////////
													root.setBeta(mindepth1);
													root.setValue(mindepth1);
													root.setName(depth1.getName());
												}
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="-";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="-";
											}
										}
										
										return root;
								}
					
					public  Node buildTree4H()
					{
						Node root = new Node("");
						root.setAlpha(-1000);
						root.setBeta(1000);
						String[] Copy =  new String[size];
						for(int i=0;i<size;i++)
						{
							if(Label[i].getText()=="")
								Copy[i]="-";
							else
								Copy[i]=Label[i].getText();
						}
										ArrayList<Node> depth1treelist=hGenerateMovesCopy(Copy);
										int mindepth1 =1000;
										
										
										for (Node depth1 : depth1treelist) 
										{
											if(root.getAlpha()>=root.getBeta())
												break;
											else
											{
												depth1.setAlpha(root.getAlpha());
												depth1.setBeta(root.getBeta());
												String dept1tree=depth1.getName();
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="H";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="H";
												
												ArrayList<Node> depth2treelist=vGenerateMovesCopy(Copy);
												int maxdepth2 =-1000;
												for (Node depth2 : depth2treelist) 
												{
													
													if(depth1.getAlpha()>=depth1.getBeta())
														break;
													else
													{
														depth2.setAlpha(depth1.getAlpha());
														depth2.setBeta(depth1.getBeta());
														String dept2tree=depth2.getName();
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="V";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="V";
														
														ArrayList<Node> depth3treelist=hGenerateMovesCopy(Copy);
														int mindepth3 =1000;
														for (Node depth3 : depth3treelist) 
														{
															
															if(depth2.getAlpha()>=depth2.getBeta())
																break;
															else
															{
																depth3.setAlpha(depth2.getAlpha());
																depth3.setBeta(depth2.getBeta());
																String dept3tree=depth3.getName();
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="H";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="H";
																ArrayList<Node> depth4treelist=hGenerateMovesCopy(Copy);
																int maxdepth4 =-1000;
																for (Node depth4 : depth4treelist) 
																{
															
																		if(depth3.getAlpha()>=depth3.getBeta())
																			break;
																		else
																		{
																			depth4.setAlpha(depth3.getAlpha());
																			depth4.setBeta(depth3.getBeta());
																			String dept4tree=depth4.getName();
																			Copy[Integer.parseInt(dept4tree.substring(0,dept4tree.indexOf(';')))-1]="V";
																			Copy[Integer.parseInt(dept4tree.substring(dept4tree.indexOf(';')+1))-1]="V";
																			depth4.setValue(vCountMovesCopy(Copy)- hcountMovesCopy(Copy));
																			//System.out.println("depth3 "+depth3.getName()+" "+depth3.getValue());
																			if (depth4.getValue()>maxdepth4)
																			{
																				maxdepth4=depth4.getValue();
																				////////////////////////////
																				depth3.setBeta(maxdepth4);
																				depth3.setValue(maxdepth4);
																			}
																			Copy[Integer.parseInt(dept4tree.substring(0,dept4tree.indexOf(';')))-1]="-";
																			Copy[Integer.parseInt(dept4tree.substring(dept4tree.indexOf(';')+1))-1]="-";
																			childnum++;
																		}
																}
																if (depth3.getValue()<mindepth3)
																{
																	mindepth3=depth3.getValue();
																	////////////////////////////
																	depth2.setBeta(mindepth3);
																	depth2.setValue(mindepth3);
																}
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="-";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="-";
																
															}
														}
														
														if (depth2.getValue()>maxdepth2)
														{
															maxdepth2=depth2.getValue();
															///////////////////////////
															depth1.setAlpha(maxdepth2);
															depth1.setValue(maxdepth2);
														}
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="-";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="-";
													}
												}
												///////////////////////////////////
												//System.out.println("depth 1 "+ depth1.getName()+" "+depth1.getValue());
												//System.out.println();
												if (depth1.getValue()<mindepth1)
												{
													mindepth1=depth1.getValue();
													//////////////////////////
													root.setBeta(mindepth1);
													root.setValue(mindepth1);
													root.setName(depth1.getName());
												}
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="-";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="-";
											}
										}
										
										return root;
								}
					
					public  Node buildTree3H()
					{
						Node root = new Node("");
						root.setAlpha(-1000);
						root.setBeta(1000);
						String[] Copy =  new String[size];
						for(int i=0;i<size;i++)
						{
							if(Label[i].getText()=="")
								Copy[i]="-";
							else
								Copy[i]=Label[i].getText();
						}
										ArrayList<Node> depth1treelist=hGenerateMovesCopy(Copy);
										int mindepth1 =1000;
										
										
										for (Node depth1 : depth1treelist) 
										{
											if(root.getAlpha()>=root.getBeta())
												break;
											else
											{
												depth1.setAlpha(root.getAlpha());
												depth1.setBeta(root.getBeta());
												String dept1tree=depth1.getName();
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="H";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="H";
												
												ArrayList<Node> depth2treelist=vGenerateMovesCopy(Copy);
												int maxdepth2 =-1000;
												for (Node depth2 : depth2treelist) 
												{
													
													if(depth1.getAlpha()>=depth1.getBeta())
														break;
													else
													{
														depth2.setAlpha(depth1.getAlpha());
														depth2.setBeta(depth1.getBeta());
														String dept2tree=depth2.getName();
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="V";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="V";
														
														ArrayList<Node> depth3treelist=hGenerateMovesCopy(Copy);
														int mindepth3 =1000;
														for (Node depth3 : depth3treelist) 
														{
															
															if(depth2.getAlpha()>=depth2.getBeta())
																break;
															else
															{
																depth3.setAlpha(depth2.getAlpha());
																depth3.setBeta(depth2.getBeta());
																String dept3tree=depth3.getName();
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="H";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="H";
																depth3.setValue(vCountMovesCopy(Copy)- hcountMovesCopy(Copy));
																//System.out.println("depth3 "+depth3.getName()+" "+depth3.getValue());
																if (depth3.getValue()<mindepth3)
																{
																	mindepth3=depth3.getValue();
																	////////////////////////////
																	depth2.setBeta(mindepth3);
																	depth2.setValue(mindepth3);
																}
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="-";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="-";
																childnum++;
															}
														}
														
														if (depth2.getValue()>maxdepth2)
														{
															maxdepth2=depth2.getValue();
															///////////////////////////
															depth1.setAlpha(maxdepth2);
															depth1.setValue(maxdepth2);
														}
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="-";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="-";
													}
												}
												//System.out.println("depth 1 "+ depth1.getName()+" "+depth1.getValue());
												//System.out.println();
												if (depth1.getValue()<mindepth1)
												{
													mindepth1=depth1.getValue();
													//////////////////////////
													root.setBeta(mindepth1);
													root.setValue(mindepth1);
													root.setName(depth1.getName());
												}
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="-";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="-";
											}
										}
										
										return root;
								}
					
					public  Node buildTree3V()
					{
						Node root = new Node("");
						root.setAlpha(-1000);
						root.setBeta(1000);
						String[] Copy =  new String[size];
						for(int i=0;i<size;i++)
						{
							if(Label[i].getText()=="")
								Copy[i]="-";
							else
								Copy[i]=Label[i].getText();
						}
										ArrayList<Node> depth1treelist=vGenerateMovesCopy(Copy);
										int mindepth1 =1000;
										
										
										for (Node depth1 : depth1treelist) 
										{
											if(root.getAlpha()>=root.getBeta())
												break;
											else
											{
												depth1.setAlpha(root.getAlpha());
												depth1.setBeta(root.getBeta());
												String dept1tree=depth1.getName();
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="V";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="V";
												
												ArrayList<Node> depth2treelist=hGenerateMovesCopy(Copy);
												int maxdepth2 =-1000;
												for (Node depth2 : depth2treelist) 
												{
													
													if(depth1.getAlpha()>=depth1.getBeta())
														break;
													else
													{
														depth2.setAlpha(depth1.getAlpha());
														depth2.setBeta(depth1.getBeta());
														String dept2tree=depth2.getName();
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="H";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="H";
														
														ArrayList<Node> depth3treelist=vGenerateMovesCopy(Copy);
														int mindepth3 =1000;
														for (Node depth3 : depth3treelist) 
														{
															
															if(depth2.getAlpha()>=depth2.getBeta())
																break;
															else
															{
																depth3.setAlpha(depth2.getAlpha());
																depth3.setBeta(depth2.getBeta());
																String dept3tree=depth3.getName();
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="V";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="V";
																depth3.setValue(hcountMovesCopy(Copy)-vCountMovesCopy(Copy));
																//System.out.println("depth3 "+depth3.getName()+" "+depth3.getValue());
																if (depth3.getValue()<mindepth3)
																{
																	mindepth3=depth3.getValue();
																	////////////////////////////
																	depth2.setBeta(mindepth3);
																	depth2.setValue(mindepth3);
																}
																Copy[Integer.parseInt(dept3tree.substring(0,dept3tree.indexOf(';')))-1]="-";
																Copy[Integer.parseInt(dept3tree.substring(dept3tree.indexOf(';')+1))-1]="-";
																childnum++;
															}
														}
														
														if (depth2.getValue()>maxdepth2)
														{
															maxdepth2=depth2.getValue();
															///////////////////////////
															depth1.setAlpha(maxdepth2);
															depth1.setValue(maxdepth2);
														}
														Copy[Integer.parseInt(dept2tree.substring(0,dept2tree.indexOf(';')))-1]="-";
														Copy[Integer.parseInt(dept2tree.substring(dept2tree.indexOf(';')+1))-1]="-";
													}
												}
												if (depth1.getValue()<mindepth1)
												{
													mindepth1=depth1.getValue();
													//////////////////////////
													root.setBeta(mindepth1);
													root.setValue(mindepth1);
													root.setName(depth1.getName());
												}
												Copy[Integer.parseInt(dept1tree.substring(0,dept1tree.indexOf(';')))-1]="-";
												Copy[Integer.parseInt(dept1tree.substring(dept1tree.indexOf(';')+1))-1]="-";
											}
										}
										return root;
								}
					private void AIStart()
					{
						Node move;
						double time1= System.currentTimeMillis();
						if(nummoves<=3)
						 move =buildTree4V();
						
						else
						{
							move=buildTree3V();
							System.out.println("using 5");
						}
						nummoves++;
						double time2= System.currentTimeMillis();
						System.out.println((time2/1000)-(time1/1000));
						String vmove = move.getName();
						System.out.println(childnum);
						childnum=0;
						int first = Integer.parseInt(vmove.substring(0,vmove.indexOf(';')))-1;
						int second = Integer.parseInt(vmove.substring(vmove.indexOf(';')+1))-1;
						Label[first].setForeground(Color.white);
						Label[second].setForeground(Color.white);
						Label[first].setText("V");
						Label[second].setText("V");
						if(checkDraw())
						{
							 edtDebug.setText("Draw");
							 gridProduct_rf.setlblDraws();
						}
						else if(numberHorizontalMoves()==0)
						 {
							 edtDebug.setText("Vertical Won!");
							 gridProduct.setlblVerticalWins();
						 }
						turn=turn*-1;
					}
					
					
					private void AInotStart()
					{
						double time1= System.currentTimeMillis();
						Node move =buildTree3H();
						System.out.println(move.getName());
						double time2= System.currentTimeMillis();
						System.out.println(((time2/1000)-(time1/1000)));
						String vmove = move.getName();
						System.out.println(childnum);
						childnum=0;
						int first = Integer.parseInt(vmove.substring(0,vmove.indexOf(';')))-1;
						int second = Integer.parseInt(vmove.substring(vmove.indexOf(';')+1))-1;
						Label[first].setForeground(Color.black);
						Label[second].setForeground(Color.black);
						Label[first].setText("H");
						Label[second].setText("H");
						if(checkDraw())
						{
							 edtDebug.setText("Draw");
							 gridProduct_rf.setlblDraws();
						}
						else if(numberVerticalMoves()==0)
						 {
							 edtDebug.setText("Horizontal Won!");
							 gridProduct.setlblVerticalWins();
						 }
						turn=turn*-1;
					
					}
					
					
					
					public void ComputerVPlayer(){
						
						
						if(firstMove==0)
						{
							AIStart();
							firstMove++;
						}
						if(turn==-1)
						{
							if(canHorizontalPlace(sender.Field))
							{
								sender.setForeground(Color.black);
								sender.setText("H");
								Label[(int) (sender.Field)].setForeground(Color.black);
								Label[sender.Field].setText("H");
								if(checkDraw())
								{
									 edtDebug.setText("Draw");
									 gridProduct_rf.setlblDraws();
								}
								else if(numberVerticalMoves()==0)
								 {
									 edtDebug.setText("Horizontal Won!");
									 setlblHorizontalWins();
								 }
								turn = turn *-1;
								AIStart();
							}
							else
								edtDebug.setText("Horizontal you cant place there you fool!");
						}
					}
					public void PlayerVComputer(){
						
						if(turn ==1)
						{
							if(canVerticalPlace(sender.Field))
							{
								sender.setForeground(Color.white);
								sender.setText("V");
								Label[(int) (sender.Field-Math.sqrt(size)-1)].setForeground(Color.white);
								Label[(int) (sender.Field-Math.sqrt(size)-1)].setText("V");
								if(checkDraw())
								{
									 edtDebug.setText("Draw");
									 gridProduct_rf.setlblDraws();
								}
								else if(numberHorizontalMoves()==0)
								 {
									 edtDebug.setText("Vertical Won!");
									 gridProduct.setlblVerticalWins();
								 }
								turn = turn *-1;
								AInotStart();
							}
							else
								edtDebug.setText("Vertical you cant place there you fool!");	
						}
					}
					
					public void mouseReleased(MouseEvent me) {
						
						if(PvP)
							PlayerVPlayer();
						if(CvP)
							ComputerVPlayer();
						if(PvC)
							PlayerVComputer();
					}
		}
	}
