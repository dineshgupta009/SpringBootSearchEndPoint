package com.SpringBootSearch.Controller;

import com.SpringBootSearch.Entity.Product;
import com.SpringBootSearch.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam ("query") String query){
        return ResponseEntity.ok(productService.searchProduct(query));
    }

    @PostMapping()
    public Product createproduct(@RequestBody Product product)
    {
        return productService.createProduct(product);
    }
}
