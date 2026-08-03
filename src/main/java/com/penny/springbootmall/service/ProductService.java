package com.penny.springbootmall.service;

import com.penny.springbootmall.dto.ProductRequest;
import com.penny.springbootmall.model.Product;

public interface ProductService {

    Product getProductByld(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
