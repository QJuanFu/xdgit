package com.dao;

import java.util.List;

import com.pojo.Classinfo;

public interface IClassinfoDAO {
	
	/**
	 * ��ѯ���а༶
	 * @return
	 */
	public List<Classinfo> selClassinfo();
	
	/**
	 * ��Ӱ༶
	 * @param classinfo
	 * @return
	 */
	public int addClassinfo(Classinfo classinfo);
	
	/**
	 * ͨ��cidɾ���༶
	 * @param cid
	 * @return
	 */
	public int delClassinfo(int cid);
	
	/**
	 * �޸İ༶��Ϣ
	 * @param classinfo
	 * @return
	 */
	public int updClassinfo(Classinfo classinfo);
	
	/**
	 * ��ѯĳһ���༶��Ϣ
	 * @param id
	 * @return
	 */
	public Classinfo selClassinfoById(int id);
	
	
}
