package aaa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StuScore {
	private String no;
	private String name;
	private int db;
	private int dyuanli;
	private int java;
	private int web;
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getDyuanli() {
		return dyuanli;
	}

	public void setDyuanli(int dyuanli) {
		this.dyuanli = dyuanli;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public void getScores() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(this.getClass().getResource("/").getPath()+"aaa\\score.txt")); //���û��������ַ�����ȡscore.txt�ļ�
    	String s = br.readLine();    //��ȡ��һ���ı�
		String[] ss = null;
		s = br.readLine();         //��ȡ��һ�гɼ���¼
		while (s != null) {
		ss = s.split("#",6); //�ָ��ַ���������6��Ԫ�ص��ַ�������
			   	if ( ss[0].equals(this.no))   {
				 this.name = ss[1];
				 this.db = Integer.parseInt(ss[2]);
				 this.dyuanli = Integer.parseInt(ss[3]);
				 this.java = Integer.parseInt(ss[4]);
				 this.web = Integer.parseInt(ss[5]);
				 return;
			   	}
			s = br.readLine();    
		}

	}
}
