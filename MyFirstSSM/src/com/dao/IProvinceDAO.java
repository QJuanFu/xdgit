package com.dao;

import java.util.List;

import com.pojo.City;
import com.pojo.Province;

public interface IProvinceDAO {
	
	
	/**
	 * ��ѯ�����е�ʡ
	 * @return
	 */
	public List<Province> queryProvince();
}
