package BIT;
import javax.swing.JLabel;


public class Center{
	
	public int time;
	public B_10 b10;
	public B_36 b36;
	public B_5001 b5001;		
	public B_5600 b5600;
	public B_66_4 b664;
	
	public Center(){
		 b10 = new B_10();
		 b36 = new B_36();
		 b5001 = new B_5001();
		 b5600 = new B_5600();
		 b664 = new B_66_4();
	}

	public void sleep(int time){
	try {Thread.sleep(time);} catch (InterruptedException e) {} }	
	
	public String t10(int i){
		int imsi=b10.output(i);
		String m=( imsi + "");
		return m;
	}
	public String t36(int i){
		int imsi=b36.output(i);
		String m=( imsi +"");
		return m;
	}
	public String t664(int i){
		int imsi=b664.output(i);
		String m=( imsi +"");
		return m;
	}
	public String t5001(int i){
		int imsi=b5001.output(i);
		String m=( imsi + "");
		return m;
	}
	public String t5600(int i){
		int imsi=b5600.output(i);
		String m=( imsi + "");
		return m;
	}			
			
			
		}
		
		
		
		

			
		
			
			
			
			
