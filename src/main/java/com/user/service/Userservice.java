package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Vo.userVo;
import com.user.dao.userDAO;
@Service
public class Userservice {
	
	@Autowired
	private userDAO userdao;
	
	
	public List<userVo> getall(){
		return userdao.getall();
	};
}
