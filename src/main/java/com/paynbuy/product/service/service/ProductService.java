package com.paynbuy.product.service.service;

import com.paynbuy.product.service.dto.ProductRequest;
import com.paynbuy.product.service.dto.ProductResponse;
import com.paynbuy.product.service.model.Product;
import com.paynbuy.product.service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;


    public void createProduct (ProductRequest productRequest){
        Product prd = Product.builder().name(productRequest.getName()).description(productRequest.getDescription()).price(productRequest.getPrice()).build();
        productRepository.save(prd);
        log.info("Product {} is saved ", prd.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> allProd = productRepository.findAll();
        return allProd.stream().map(this::mapToProductResponse).collect(Collectors.toList());

    }

    private ProductResponse mapToProductResponse(Product product) {
        return  ProductResponse.builder().id(product.getId()).name(product.getName()).description(product.getDescription()).price(product.getPrice()).build();

    }
}
