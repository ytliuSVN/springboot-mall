package com.penny.springbootmall.dao;

import com.penny.springbootmall.dto.ProductQueryParams;
import com.penny.springbootmall.dto.ProductRequest;
import com.penny.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductByld(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
