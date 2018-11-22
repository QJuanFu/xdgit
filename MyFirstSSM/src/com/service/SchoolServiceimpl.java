package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ISchoolDAO;
import com.pojo.School;

@Service
public class SchoolServiceimpl implements ISchoolService {
	@Autowired
	ISchoolDAO schDAO;

	public void setSchDAO(ISchoolDAO schDAO) {
		this.schDAO = schDAO;
	}

	/* (non-Javadoc)
	 * @see com.service.ISchoolService#addSchool(com.pojo.School)
	 */
	@Override
	public int addSchool(School school) {
		return schDAO.addSchool(school);
	}
	

}
