package com.service;

import java.util.List;

import com.pojo.City;

public interface ICityService {
	/**
	 * ��ѯ���е���
	 * @return
	 */
	public List<City> queryCity();
	
	/**
	 * ͨ��ʡid��ѯ��ʡ�µ���
	 * @return ��
	 */
	public List<City> queryCityByPid(String pid);
}
