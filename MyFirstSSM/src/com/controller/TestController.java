package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.City;
import com.pojo.Province;
import com.service.ICityService;
import com.service.IProvinceService;

@Controller
public class TestController {
	@Autowired
	ICityService citySer;
	@Autowired
	IProvinceService proSer;
	public void setCitySer(ICityService citySer) {
		this.citySer = citySer;
	}
	public void setProSer(IProvinceService proSer) {
		this.proSer = proSer;
	}
	@RequestMapping("/toView")
	public String toView(HttpServletRequest req,Map<String, Object> map){
		List<Province> listPro = proSer.queryProvince();
		map.put("listPro", listPro);
		return "addchengji";
	}
	@RequestMapping("/getCityByPid")
	public @ResponseBody List<City> getCityByPid(String pid){
		System.out.println(pid);
		List<City> listCity = citySer.queryCityByPid(pid);
		for (City city : listCity) {
			System.out.println(city.toString());
		}
		return listCity;
	}
}
