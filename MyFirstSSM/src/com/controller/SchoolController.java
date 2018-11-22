package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.School;
import com.service.ISchoolService;

@Controller
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	ISchoolService schSer;

	public void setSchSer(ISchoolService schSer) {
		this.schSer = schSer;
	}
	
	@RequestMapping("/toSchool")
	public String toSchool(){
		return "school";
	}
	
	@RequestMapping("/saveSchool")
	public String saveSchool(School school){
		schSer.addSchool(school);
		return "school";
	}
	/**
	 * 绑定页面日期类型的参数
	 * @param binder
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder){
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}
