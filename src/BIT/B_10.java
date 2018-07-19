package BIT;
public class B_10 extends Obe {

	public int output(int i){
		int time=12;
			if(i>=0 && i<5){return time=24;}//백암터미널
			if(i>=5 && i<11){return time=19;}//청소년 수련관
			if(i>=11 && i<15){return time=13;}//양지면 사무소
			if(i>=15 && i<19){return time=9;}//용인터미널
			if(i>=19 && i<21){return time=5;}//용인대역
			if(i==21){return time=3;}//상지석
			if(i==22){return time=2;}//고인돌
			if(i==23){return time=1;}//어정삼거리
			if(i==24){return time=0;}//강남대
			return time;
		}
	}
			





