package com.imooc.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.o2o.entity.ShopCategory;

public interface ShopCategoryDao {
	
	/**
	 * 
	 * 
	 * @Title: queryShopCategoryList
	 * 
	 * @Description: 按照需求
	 * 
	 *               1.首页展示一级目录（即parent_id 为 null的商铺类别）
	 * 
	 *               2.点进去某个一级目录加载对应目录下的子目录
	 * 
	 *               所以这里需要加个入参ShopCategory，并通过MyBatis提供的注解@Param与Mapper映射文件中的SQL关联起来
	 *               ，在SQL中进行判断
	 * 
	 * @return: List<ShopCategory>
	 */
	List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);

}
