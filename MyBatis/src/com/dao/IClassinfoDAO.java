package com.dao;

import java.util.List;

import com.pojo.Classinfo;

public interface IClassinfoDAO {
	
	/**
	 * 查询所有班级
	 * @return
	 */
	public List<Classinfo> selClassinfo();
	
	/**
	 * 添加班级
	 * @param classinfo
	 * @return
	 */
	public int addClassinfo(Classinfo classinfo);
	
	/**
	 * 通过cid删除班级
	 * @param cid
	 * @return
	 */
	public int delClassinfo(int cid);
	
	/**
	 * 修改班级信息
	 * @param classinfo
	 * @return
	 */
	public int updClassinfo(Classinfo classinfo);
	
	/**
	 * 查询某一条班级信息
	 * @param id
	 * @return
	 */
	public Classinfo selClassinfoById(int id);
	
	
}
