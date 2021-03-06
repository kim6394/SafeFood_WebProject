package com.mybatis.dao;

import java.util.List;
import com.mybatis.vo.Save;

public interface SaveDAO {
	public List<Save> selectAll();
	public Save selectOne(String num); // scode
	public void insert(Save s);
	public List<String> selectMFoodList(String mcode);
	public void delete(String mcode, String fcode);
}
