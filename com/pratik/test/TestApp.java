package com.pratik.test;

import com.pratik.dao.M2ODAO;
import com.pratik.dao.M2ODAOFactory;
import com.pratik.utility.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {
		 //get DAO
		M2ODAO dao=null;
		dao=M2ODAOFactory.getInstance();
		//invoke methods
		dao.saveDataUsingCarModel();
		
		//close objs
		HibernateUtil.closeSession();
		HibernateUtil.closeSessionFactory();
	}//main
}//class
