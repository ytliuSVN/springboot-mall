package com.penny.springbootmall.service.impl;

import com.penny.springbootmall.dao.ProductDao;
import com.penny.springbootmall.model.Product;
import com.penny.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductByld(Integer productId) {
        return productDao.getProductByld(productId);
    }
}
