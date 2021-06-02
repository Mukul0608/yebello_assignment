package com.yebelo.app.dao;

import com.yebelo.app.model.Category;

import java.util.List;

public class FetchNumberDAO {

	public int getCategoryValue(String categoryCode) {
		// TODO Auto-generated method stub
		try {
			return jdbcTemplate.queryForObject("Select category_value from tblcategory where category_code = ? limit 1", new Object[] {categoryCode}, int.class);			
		} catch (Exception e) {
			return 0;
		}
	}

	public void updateCategoryValue(Category category) {
		jdbcTemplate.update("update tblcategory set category_value = ? where category_code = ?", new Object[] {category.getValue(), category.getCategoryCode()});
		
	}

}
