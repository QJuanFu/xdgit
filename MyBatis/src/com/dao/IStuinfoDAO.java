package com.dao;

import java.util.List;

import com.pojo.Stuinfo;

public interface IStuinfoDAO {
	/**
	 * 
	 * @param id
	 * @return
	 */
	public List<Stuinfo> getStuinfoBySid(int sid);
	
	
	public List<Stuinfo> getStuinfoByCid(int cid);
}
