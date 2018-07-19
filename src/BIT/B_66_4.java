package BIT;
public class B_66_4 extends Obe {

	public int output(int i){
		int time=15;
		if(i>=0 && i<3){return time=18;}//
		if(i>=3 && i<6){return time=15;}//
		if(i>=6 && i<8){return time=12;}//
		if(i>=8 && i<11){return time=10;}//
		if(i>=11 && i<15){return time=7;}//
		if(i==15){return time=3;}//
		if(i==16){return time=2;}//
		if(i==17){return time=1;}//
		if(i==18){return time=0;}//
		return time;
	}
}
