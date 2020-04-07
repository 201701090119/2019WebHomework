package beans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Jdbc.Dao;

public class StuScore {
	private String no;
	private String name;
	private int ds;
	private int db;
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
	public int getDs() {
		return ds;
	}
	public void setDs(int ds) {
		this.ds = ds;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
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
	public void getScores(){
		Dao d = new Dao();
		d.loadDriver();
		String sql = "select name, ds, db, java, web from stu_tb where no = '" + this.no + "'";
		String str = d.qry_stu(sql);
		if(str.equals("")) return;
		String s[] = str.split("#");
		this.name = s[0];
		this.ds = Integer.parseInt(s[1]);
		this.db = Integer.parseInt(s[2]);
		this.java = Integer.parseInt(s[3]);
		this.web = Integer.parseInt(s[4]);
	}
}
