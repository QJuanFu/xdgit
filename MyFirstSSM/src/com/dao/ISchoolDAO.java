package com.dao;

import java.util.List;


import com.pojo.School;

public interface ISchoolDAO {
	public int addSchool(School sch);
	
	public int deleteSchool(int id);
	
	public int updateSchool(School sch);
	
	public List<School> querySchool(String sql);
}
