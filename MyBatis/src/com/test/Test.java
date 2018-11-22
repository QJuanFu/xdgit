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
	/*	//configuration�м����ӡ��־�Ϳ��Բ�д������������
		for (Classinfo classinfo : list) {
			System.out.println(classinfo);
		}	*/
		
		//ʹ�ýӿڷ�ʽ
		IClassinfoDAO claDAO = session.getMapper(IClassinfoDAO.class);
		
		//��ѯ
	//	claDAO.selClassinfo();
		
		//���
	//	claDAO.addClassinfo(new Classinfo(0, "ͨ��1��", "ͨ�Ź���"));
	//	session.commit();
		
		//ɾ��
	//	claDAO.delClassinfo(3);
	//	session.commit();
		
		//�޸�
	//	claDAO.updClassinfo(new Classinfo(4, "ͨ��09101��", "ͨ�Ź���"));
	//	session.commit();
		
		//��ѯĳ���༶��Ϣ
	//	claDAO.selClassinfoById(4);
		
		//���һ�Ĳ�ѯ��ͨ��ѧԱ��Ϣ��ѯ�༶����
		IStuinfoDAO stuinfoDAO = session.getMapper(IStuinfoDAO.class);
		List<Stuinfo> list = stuinfoDAO.getStuinfoBySid(3);
		System.out.println(list.get(0).getClassinfo().getC_name()+"\t"+list.get(0).getS_name());
		
		session.close();
	}

}
