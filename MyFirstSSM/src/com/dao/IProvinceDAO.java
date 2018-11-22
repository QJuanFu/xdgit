package com.dao;

import java.util.List;

import com.pojo.City;
import com.pojo.Province;

public interface IProvinceDAO {
	
	
	/**
	 * 查询出所有的省
	 * @return
	 */
	public List<Province> queryProvince();
}
