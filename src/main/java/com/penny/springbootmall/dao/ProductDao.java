package com.penny.springbootmall.dao;

import com.penny.springbootmall.dto.ProductRequest;
import com.penny.springbootmall.model.Product;

public interface ProductDao {

    Product getProductByld(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
