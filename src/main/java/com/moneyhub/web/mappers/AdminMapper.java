package com.moneyhub.web.mappers;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.moneyhub.web.domains.MoneyhubDTO;

@Repository
public interface AdminMapper {
  //  public void insertJoin(MoneyhubDTO param);
	public int countAdmin();
  //  public MoneyhubDTO selectLogin(MoneyhubDTO param);
   // public List<String> searchMypage();
}

