package com.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.user.Vo.userVo;

@Mapper
@Repository
public interface userDAO {
	public List<userVo> getall();
}
