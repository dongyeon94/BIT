package BIT;
public class B_5001 extends Obe {
	
	public int output(int i){
		int time =15;
		if(i>=0 && i<2){return time=14;}//명지대앞
		if(i>=2 && i<4){return time=12;}//용인터미널
		if(i>=4 && i<7){return time=10;}//진우아파트
		if(i>=7 && i<10){return time=7;}//
		if(i==10 ){return time=4;}//
		if(i==11){return time=3;}//
		if(i==12){return time=2;}//
		if(i==13){return time=1;}//
		if(i==14){return time=0;}//강남대
		return time;
	}
	
	}

