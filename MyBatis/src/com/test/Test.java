package com.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.w3c.dom.ls.LSInput;

import com.dao.IClassinfoDAO;
import com.dao.IStuinfoDAO;
import com.pojo.Classinfo;
import com.pojo.Stuinfo;

public class Test {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("Configuration.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session = factory.openSession();
		
	//	List<Classinfo> list =  session.selectList("com.mapper.classinfo.queryClassinfo");
	/*	//configuration中加入打印日志就可以不写下面输出语句了
		for (Classinfo classinfo : list) {
			System.out.println(classinfo);
		}	*/
		
		//使用接口方式
		IClassinfoDAO claDAO = session.getMapper(IClassinfoDAO.class);
		
		//查询
	//	claDAO.selClassinfo();
		
		//添加
	//	claDAO.addClassinfo(new Classinfo(0, "通信1班", "通信工程"));
	//	session.commit();
		
		//删除
	//	claDAO.delClassinfo(3);
	//	session.commit();
		
		//修改
	//	claDAO.updClassinfo(new Classinfo(4, "通信09101班", "通信工程"));
	//	session.commit();
		
		//查询某条班级信息
	//	claDAO.selClassinfoById(4);
		
		//多对一的查询：通过学员信息查询班级名字
		IStuinfoDAO stuinfoDAO = session.getMapper(IStuinfoDAO.class);
		List<Stuinfo> list = stuinfoDAO.getStuinfoBySid(3);
		System.out.println(list.get(0).getClassinfo().getC_name()+"\t"+list.get(0).getS_name());
		
		session.close();
	}

}
