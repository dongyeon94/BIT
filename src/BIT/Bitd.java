package BIT;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Bitd extends JFrame implements Runnable {

	
	
	public Center cc = new Center();
	
	private JPanel contentPane;
	
	private ImageIcon gbi = new ImageIcon("GB.png");
	private ImageIcon rbi = new ImageIcon("RB.png");
	private ImageIcon ybi = new ImageIcon("YB.png");
	private ImageIcon push = new ImageIcon("");
	private ImageIcon gg1 = new ImageIcon("GG.gif");

	private JLabel[] b36 ={new JLabel(""),new JLabel("")};
	private JLabel[] b5600={new JLabel(""),new JLabel(""),new JLabel("")};
	private JLabel[] b5001={new JLabel(""),new JLabel(""),new JLabel("")};
	private JLabel[] b664={new JLabel(""),new JLabel(""),new JLabel("")};
	private JLabel[] b10={new JLabel(""),new JLabel(""),new JLabel("")};

	private JLabel[] min ={ new JLabel("",JLabel.CENTER), new JLabel("",JLabel.CENTER),
							new JLabel("",JLabel.CENTER), new JLabel("",JLabel.CENTER),
							new JLabel("",JLabel.CENTER)};
	private JLabel[] sa ={  new JLabel("",JLabel.CENTER), new JLabel("",JLabel.CENTER),
							new JLabel("",JLabel.CENTER), new JLabel("",JLabel.CENTER),
							new JLabel("",JLabel.CENTER)};
	private JLabel background = new JLabel("");
	
	private JLabel GG = new JLabel(gg1);
	private JLabel Time=new JLabel("",JLabel.CENTER);
	private JLabel Date = new JLabel("dddd",JLabel.CENTER);
	
	public Bitd(String title) {
		super(title);
		this.init();
		new Thread(this).start();
	
		
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = getSize();
		int xpos = (int)(screen.getWidth() / 2 - frm.getWidth()/2);
		int ypos = (int)(screen.getHeight() / 2 - frm.getHeight()/2);
		this.setLocation(xpos,ypos);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setVisible(true);
		
	}
	
	public void init(){
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷을 얻는다.
		Dimension sD = toolkit.getScreenSize(); // 화면의 크기를 얻는다.
		setBounds(100, 100,sD.width, sD.height);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//--------버스 Label 위치 설정부분---------------
		b36[1].setBounds(697, 680, 61, 64);
		contentPane.add(b36[1]);
		b36[0].setBounds(559, 680, 61, 64);
		contentPane.add(b36[0]);
		b5600[2].setBounds(837, 597, 61, 64);
		contentPane.add(b5600[2]);
		b5600[1].setBounds(697, 597, 61, 64);
		contentPane.add(b5600[1]);
		b5600[0].setBounds(559, 597, 61, 64);
		contentPane.add(b5600[0]);
		b5001[2].setBounds(837, 511, 61, 64);
		contentPane.add(b5001[2]);
		b5001[1].setBounds(697, 511, 61, 64);
		contentPane.add(b5001[1]);
		b5001[0].setBounds(559, 511, 61, 64);
		contentPane.add(b5001[0]);
		b664[2].setBounds(837, 427, 61, 64);
		contentPane.add(b664[2]);
		b664[1].setBounds(697, 427, 61, 64);
		contentPane.add(b664[1]);
		b664[0].setBounds(559, 427, 61, 64);
		contentPane.add(b664[0]);
		b10[2].setBounds(837, 342, 61, 64);
		contentPane.add(b10[2]);
		b10[1].setBounds(697, 342, 61, 64);
		contentPane.add(b10[1]);
		b10[0].setBounds(559, 342, 61, 64);
		contentPane.add(b10[0]);
		
		//-------------버스 도착 예정 시간-------------------------
		min[4].setBounds(280, 685, 138, 50);
		min[4].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(min[4]);
		min[3].setBounds(280, 601, 138, 50);
		min[3].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(min[3]);
		min[2].setBounds(280, 516, 138, 50);
		min[2].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(min[2]);
		min[1].setBounds(280, 431, 138, 50);
		min[1].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(min[1]);
		min[0].setBounds(280, 347, 138, 50);
		min[0].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(min[0]);
		
		//---------------잠시후도착------------------------------ 
		sa[4].setBounds(738, 185, 152, 50);
		contentPane.add(sa[4]);
		sa[4].setFont(new Font(null, Font.BOLD, 50));
		sa[3].setToolTipText("");
		sa[3].setBounds(560, 185, 152, 50);
		sa[3].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(sa[3]);
		sa[2].setToolTipText("");
		sa[2].setBounds(382, 185, 152, 50);
		sa[2].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(sa[2]);
		sa[1].setToolTipText("");
		sa[1].setBounds(204, 185, 152, 50);
		sa[1].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(sa[1]);
		sa[0].setToolTipText("");
		sa[0].setBounds(25, 185, 152, 50);
		sa[0].setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(sa[0]);
		//----------------------------------------------------
		
		
		//------------------광고--------------------------------
		GG.setBounds(925, 568, 423, 171);
		contentPane.add(GG);
		//-------------------------------------------
		
		//-----------------시계------------------------
		Time.setForeground(Color.LIGHT_GRAY);
		Time.setBounds(1036, 62, 312, 50);
		Time.setFont(new Font(null, Font.BOLD, 50));
		contentPane.add(Time);
		//--------------------------------------------
		
		//-------------날짜----------------------------
		Date.setBounds(1036, 10, 312, 42);
		Date.setFont(new Font(null, Font.BOLD, 30));
		Date.setForeground(Color.LIGHT_GRAY);
		contentPane.add(Date);
		SimpleDateFormat dd = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date d = new Date();
		String date = dd.format(d);
		Date.setText(date);
		//---------------------------------------------
		background.setIcon(new ImageIcon("B.G.png"));
		background.setBounds(0, 0,sD.width,sD.height);
		contentPane.add(background);
		
	}
	
	public void run(){
		
		int[] r = {0,0,0,0,0,0};//반복변수 배열
		int tm=0;
		int th=0;
		//int t=0;
		
		int cb[] = {0,0,0,0,0};
		
		while(true){
			
			cc.sleep(500);
			
			//----------------10번버스----------------------------------
			if(r[0]==24){r[0]=12;}
			min[0].setText(cc.t10(r[0]));
			if(cc.b10.output(r[0])==3){b10[2].setIcon(gbi);}
			else{b10[2].setIcon(push);}
			if(cc.b10.output(r[0])==2){b10[1].setIcon(gbi);}
			else{b10[1].setIcon(push);}
			if(cc.b10.output(r[0])==1){b10[0].setIcon(gbi);
			cb[0]=10;}
			else{b10[0].setIcon(push);}
			//---------------66-4번버스---------------------------------
			if(r[1]==18){r[1]=3;}
			min[1].setText(cc.t664(r[1]));
			if(cc.b664.output(r[1])==3){b664[2].setIcon(gbi);}
			else{b664[2].setIcon(push);}
			if(cc.b664.output(r[1])==2){b664[1].setIcon(gbi);}
			else{b664[1].setIcon(push);}
			if(cc.b664.output(r[1])==1){b664[0].setIcon(gbi);
			cb[1]=664;}
			else{b664[0].setIcon(push);}
			//-------------5001번 버스------------------------------------
			if(r[2]==15){r[2]=1;}
			min[2].setText(cc.t5001(r[2]));
			if(cc.b5001.output(r[2])==3){b5001[2].setIcon(rbi);}
			else{b5001[2].setIcon(push);}
			if(cc.b5001.output(r[2])==2){b5001[1].setIcon(rbi);}
			else{b5001[1].setIcon(push);}
			if(cc.b5001.output(r[2])==1){b5001[0].setIcon(rbi);
			cb[2]=5001;}
			else{b5001[0].setIcon(push);}
			//-------------5600번버스---------------------------------------
			if(r[3]==20){r[3]=4;}
			min[3].setText(cc.t5600(r[3]));
			if(cc.b5600.output(r[3])==3){b5600[2].setIcon(rbi);}
			else{b5600[2].setIcon(push);}
			if(cc.b5600.output(r[3])==2){b5600[1].setIcon(rbi);}
			else{b5600[1].setIcon(push);}
			if(cc.b5600.output(r[3])==1){b5600[0].setIcon(rbi);
			cb[3]=5600;}
			else{b5600[0].setIcon(push);}
			//--------------------36번버스---------------------------------
			if(r[4]==20){r[4]=0;}
			min[4].setText(cc.t36(r[4]));
			if(cc.b36.output(r[4])<=20&&cc.b36.output(r[4])>1){b36[1].setIcon(ybi);}
			else if(cc.b36.output(r[4])==1){
				cb[4]=36;
				b36[1].setIcon(push);
				b36[0].setIcon(ybi);
			}
			else{b36[0].setIcon(push);
			}
			//-------------시계----------------------------------------
			
			tm=(r[5]%60);
			if(tm%60==0)
				th++;
			
			if(th==24)
				th=0;
			
			Time.setText(""+th+"시 :"+tm+"분");
			//-------------내림차순 잠시 후 도착 버스 정렬----------			
					for(int j=0;j<4;j++){
					for(int i=0;i<4;i++){
						int ca=0;
						
						if(cb[i]<cb[i+1]){
								ca=cb[i+1];
								cb[i+1]=cb[i];
								cb[i]=ca;
								}
						else{continue;}
							
							if(cb[0]==cb[4]){}
						}
					}
			//-----------------잠시후 도착 ---------------------
		
					if(cb[0]!=0){sa[0].setText(cb[0]+"");
					 cb[0]=0;}
					else{sa[0].setText("");}
					if(cb[1]!=0){sa[1].setText(cb[1]+"");
					cb[1]=0;}
					else{sa[1].setText("");}
					if(cb[2]!=0){sa[2].setText(cb[2]+"");
					cb[2]=0;}
					else{sa[2].setText("");}
					if(cb[3]!=0){sa[3].setText(cb[3]+"");
					cb[3]=0;}
					else{sa[3].setText("");}
					if(cb[4]!=0){sa[4].setText(cb[4]+"");
					cb[4]=0;}
					else{sa[4].setText("");}
					
			//----------------------------------------------
			for(int i=0 ;i<6 ;i++){r[i]++;}
			}
		
	}

	
	
	public static void main(String[] args) {
		Bitd frame = new Bitd("Bit System");
					}
}	

