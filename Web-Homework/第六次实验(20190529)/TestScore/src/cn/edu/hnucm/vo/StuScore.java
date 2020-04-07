package cn.edu.hnucm.vo;

public class StuScore {
	String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	String No;
	int Ds;
	int Db;
	int java;
	int Web;
	int Average;
	
	public int getAverage() {
		return Average;
	}
	public void setAverage(int average) {
		Average = average;
	}
	public int getDs() {
		return Ds;
	}
	public void setDs(int ds) {
		Ds = ds;
	}
	public int getDb() {
		return Db;
	}
	public void setDb(int db) {
		Db = db;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getWeb() {
		return Web;
	}
	public void setWeb(int web) {
		Web = web;
	}
	

}
