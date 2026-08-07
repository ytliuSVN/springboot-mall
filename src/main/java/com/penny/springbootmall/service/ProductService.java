package com.penny.springbootmall.service;

import com.penny.springbootmall.constant.ProductCategory;
import com.penny.springbootmall.dto.ProductRequest;
import com.penny.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductByld(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
