package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICityDAO;
import com.pojo.City;
@Service
public class CityServiceimpl implements ICityService{
	@Autowired
	ICityDAO cityDAO;
	public void setCityDAO(ICityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}

	@Override
	public List<City> queryCity() {
		return cityDAO.queryCity();
	}

	@Override
	public List<City> queryCityByPid(String pid) {
		return cityDAO.queryCityByPid(pid);
	}

}
