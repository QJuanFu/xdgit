package com.service;

import java.util.List;

import com.pojo.Province;

public interface IProvinceService {
	/**
	 * 查询出所有的省
	 * @return
	 */
	public List<Province> queryProvince();
}
