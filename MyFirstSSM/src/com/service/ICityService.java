package com.service;

import java.util.List;

import com.pojo.City;

public interface ICityService {
	/**
	 * 查询所有的市
	 * @return
	 */
	public List<City> queryCity();
	
	/**
	 * 通过省id查询该省下的市
	 * @return 市
	 */
	public List<City> queryCityByPid(String pid);
}
