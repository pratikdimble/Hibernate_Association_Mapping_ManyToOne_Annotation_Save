package com.pratik.dao;

import com.pratik.dao.M2ODAO;
import com.pratik.dao.M2ODAOImpl;

public class M2ODAOFactory {
	
	public static M2ODAO  getInstance(){
		return new  M2ODAOImpl();
	}

}
