package BIT;
public class B_10 extends Obe {

	public int output(int i){
		int time=12;
			if(i>=0 && i<5){return time=24;}//����͹̳�
			if(i>=5 && i<11){return time=19;}//û�ҳ� ���ð�
			if(i>=11 && i<15){return time=13;}//������ �繫��
			if(i>=15 && i<19){return time=9;}//�����͹̳�
			if(i>=19 && i<21){return time=5;}//���δ뿪
			if(i==21){return time=3;}//������
			if(i==22){return time=2;}//���ε�
			if(i==23){return time=1;}//������Ÿ�
			if(i==24){return time=0;}//������
			return time;
		}
	}
			





