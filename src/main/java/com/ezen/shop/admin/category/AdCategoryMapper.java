package com.ezen.shop.admin.category;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface AdCategoryMapper {

	// 1차 카테고리목록
	List<CategoryVO> getFirstCategoryList();
	
	// 2차 카테고리목록
	List<CategoryVO> getSecondCategoryList(Integer cate_prt_code);
	
	CategoryVO getFirstCategoryBySecondCategory(int secondCategory);
	
	// 2차카테고리의 부모인 1차카테고리 코드.  1차카테고리 목록에서 선택표시목적.
	Integer FirstCateCodeBySecondCateCode(Integer cate_code);
}
