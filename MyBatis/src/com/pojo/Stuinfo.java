package com.pojo;
import java.util.Date;
public class Stuinfo{
	int s_id;
//	int c_id;
	Classinfo classinfo;
	String s_name;
	int s_age;
	String s_sex;
	Date s_birthday;
	String s_jg;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
//	public int getC_id() {
//		return c_id;
//	}
//	public void setC_id(int c_id) {
//		this.c_id = c_id;
//	}
	public Classinfo getClassinfo() {
		return classinfo;
	}
	public void setClassinfo(Classinfo classinfo) {
		this.classinfo = classinfo;
	}
	
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_age() {
		return s_age;
	}
	public void setS_age(int s_age) {
		this.s_age = s_age;
	}
	public String getS_sex() {
		return s_sex;
	}
	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}
	public Date getS_birthday() {
		return s_birthday;
	}
	public void setS_birthday(Date s_birthday) {
		this.s_birthday = s_birthday;
	}
	public String getS_jg() {
		return s_jg;
	}
	public void setS_jg(String s_jg) {
		this.s_jg = s_jg;
	}

}