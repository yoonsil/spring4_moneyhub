package com.moneyhub.web.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyhub.web.mappers.AdminMapper;
import com.moneyhub.web.services.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminMapper adminMapper;
	@Override
	public int countAdmin() {
		System.out.println("ddddd");
		return adminMapper.countAdmin();
	}


}
