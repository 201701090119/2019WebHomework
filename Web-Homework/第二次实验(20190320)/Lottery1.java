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
		//生成了6个红色球的号码
		for (int i = 0; i < 6; i++) {
			// 随机得到一个位置，第一次运行时下标为0—31
			int j = ran.nextInt(32 - i);
			// 得到那个位置的数值
			ranArr[i] = seed[j];
			// 将最后一个未用的数字放到这里 ，这样就把取出的数覆盖了，达到了不重复的目的。
			seed[j] = seed[31 - i];
		}
		Arrays.sort(ranArr);
		lastNum = ran.nextInt(16)+1;
		new RanFrame1(ranArr,lastNum);//生成显示界面
		
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
		this.setTitle("摇号结果");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

@SuppressWarnings("serial")
//定义一个吗panel、用于绘制和实现图像
class MyPanel1 extends JPanel {
	int[] ranArr;
	int lastNum;
	public MyPanel1(int[] ranArr,int lastNum){
		this.ranArr = ranArr;
		this.lastNum = lastNum;
	}
	// 覆盖jpanel的paint方法
	// Graphics图形类
	public void paint(Graphics g) {
		// 调用父类函数进行初始化
		super.paint(g);
		// 先画一个园
		g.setColor(Color.red);
		String s;
		for(int i=0;i<ranArr.length;i++){
			g.drawOval(10+i*30, 10, 30, 30);//计算位置画出圆，
			s = String.valueOf(ranArr[i]);
			g.drawString(s, 20+i*30, 30);//计算位置画出产生的号码
		}
		g.setColor(Color.blue);
		s= String.valueOf(lastNum);
		g.drawOval(10+6*30, 10, 30, 30);//画出蓝色圆圈
		g.drawString(s, 20+6*30, 30);//画出蓝色号码
	}
}
