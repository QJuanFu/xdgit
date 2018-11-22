package com.pojo;

import java.util.List;

public class Classinfo{
	int c_id;
	String c_name;
	String c_major;
	List<Stuinfo> stuinfos;
	public List<Stuinfo> getStuinfos() {
		return stuinfos;
	}
	public void setStuinfos(List<Stuinfo> stuinfos) {
		this.stuinfos = stuinfos;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_major() {
		return c_major;
	}
	public void setC_major(String c_major) {
		this.c_major = c_major;
	}
	public Classinfo(int c_id, String c_name, String c_major) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_major = c_major;
	}
	public Classinfo() {
		
	}
	@Override
	public String toString() {
		return "Classinfo [c_id=" + c_id + ", c_name=" + c_name + ", c_major=" + c_major + "]";
	}
	

}