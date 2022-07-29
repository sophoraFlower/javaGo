package com.imooc.o2o.service;

import java.io.InputStream;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

public interface ShopService {
	// File类便于测试，但不利于业务逻辑实现
	// ShopExecution addShop(Shop shop, File shopImg);
	ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName);
}
