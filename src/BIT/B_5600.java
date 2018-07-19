package BIT;
public class B_5600 extends Obe {

	public int output(int i){
		int time=20;
		if(i>=0 && i<2){return time=16;}//
		if(i>=2 && i<5){return time=14;}//
		if(i>=5 && i<9){return time=11;}//
		if(i>=9 && i<12){return time=7;}//
		if(i==12){return time=4;}//
		if(i==13){return time=3;}//
		if(i==14){return time=2;}//
		if(i==15){return time=1;}//
		if(i==16){return time=0;}//
		return time;
	}
}
