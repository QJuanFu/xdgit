package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IProvinceDAO;
import com.pojo.Province;
@Service
public class ProvinceServiceimpl implements IProvinceService{
	
	@Autowired
	IProvinceDAO provinceDAO;
	public void setProvinceDAO(IProvinceDAO provinceDAO) {
		this.provinceDAO = provinceDAO;
	}

	@Override
	public List<Province> queryProvince() {
		return provinceDAO.queryProvince();
	}

}
