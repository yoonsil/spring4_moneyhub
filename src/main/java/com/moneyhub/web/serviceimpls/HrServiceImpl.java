package com.moneyhub.web.serviceimpls;

import java.util.List;

import com.moneyhub.web.daoimpls.HrDaoImpl;
import com.moneyhub.web.domains.HrBean;
import com.moneyhub.web.services.HrService;

public class HrServiceImpl implements HrService{
	private static HrServiceImpl instance = new HrServiceImpl();
	public static HrServiceImpl getInstance() {return instance;}
	private HrServiceImpl() {}

	public void join(HrBean param) {
		System.out.println("joinService=");
		HrDaoImpl.getInstance().insertJoin(param);
	}
	
	public HrBean login(HrBean param) {
		return HrDaoImpl.getInstance().selectLogin(param);
	}

	public List<String> viewMypage() {
		return HrDaoImpl.getInstance().searchMypage();
	}
	

}
