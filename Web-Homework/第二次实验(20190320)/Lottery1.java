import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;




public class Lottery1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] seed = new int[32];//
        int lastNum;
		for (int i = 0; i < 32; i++) {
			seed[i] = i+1;
		}
		int[] ranArr = new int[6];
		Random ran = new Random();
		//������6����ɫ��ĺ���
		for (int i = 0; i < 6; i++) {
			// ����õ�һ��λ�ã���һ������ʱ�±�Ϊ0��31
			int j = ran.nextInt(32 - i);
			// �õ��Ǹ�λ�õ���ֵ
			ranArr[i] = seed[j];
			// �����һ��δ�õ����ַŵ����� �������Ͱ�ȡ�����������ˣ��ﵽ�˲��ظ���Ŀ�ġ�
			seed[j] = seed[31 - i];
		}
		Arrays.sort(ranArr);
		lastNum = ran.nextInt(16)+1;
		new RanFrame1(ranArr,lastNum);//������ʾ����
		
	}
}

@SuppressWarnings("serial")
class RanFrame1 extends JFrame {
	MyPanel1 mp ;
	int[] ranArr;
	int lastNum;
	public RanFrame1(int[] ranArr,int lastNum) {
		this.ranArr=ranArr;
		this.lastNum = lastNum;
		mp = new MyPanel1(ranArr,lastNum);
		this.add(mp);
		this.setSize(300, 100);
		this.setTitle("ҡ�Ž��");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

@SuppressWarnings("serial")
//����һ����panel�����ڻ��ƺ�ʵ��ͼ��
class MyPanel1 extends JPanel {
	int[] ranArr;
	int lastNum;
	public MyPanel1(int[] ranArr,int lastNum){
		this.ranArr = ranArr;
		this.lastNum = lastNum;
	}
	// ����jpanel��paint����
	// Graphicsͼ����
	public void paint(Graphics g) {
		// ���ø��ຯ�����г�ʼ��
		super.paint(g);
		// �Ȼ�һ��԰
		g.setColor(Color.red);
		String s;
		for(int i=0;i<ranArr.length;i++){
			g.drawOval(10+i*30, 10, 30, 30);//����λ�û���Բ��
			s = String.valueOf(ranArr[i]);
			g.drawString(s, 20+i*30, 30);//����λ�û��������ĺ���
		}
		g.setColor(Color.blue);
		s= String.valueOf(lastNum);
		g.drawOval(10+6*30, 10, 30, 30);//������ɫԲȦ
		g.drawString(s, 20+6*30, 30);//������ɫ����
	}
}
