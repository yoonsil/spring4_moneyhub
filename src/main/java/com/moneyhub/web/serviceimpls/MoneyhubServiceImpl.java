package com.moneyhub.web.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.moneyhub.web.domains.MoneyhubDTO;
import com.moneyhub.web.mappers.MoneyhubMapper;
import com.moneyhub.web.services.MoneyhubService;
@Service
public class MoneyhubServiceImpl implements MoneyhubService{
	@Autowired MoneyhubMapper mapper;
	
	private MoneyhubServiceImpl() {}

	public void join(MoneyhubDTO param) {
		
	}
	
	public MoneyhubDTO login(MoneyhubDTO param) {
		return null;
	}

	public List<String> viewMypage() {
		return null;
	}
	

}
