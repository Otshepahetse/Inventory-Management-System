package com.Otshepahetse.Inventory.Management.System.Service;

import com.Otshepahetse.Inventory.Management.System.Model.Product;
import com.Otshepahetse.Inventory.Management.System.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(()->new RuntimeException("Product Not Found!"));
    }

    public List<Product>getProductBySupplier(Long supplierId){
        return productRepository.findBySupplierId(supplierId);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product updateProduct(Long id, Product updatedProduct){
        Product existingProduct = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product Not Found!"));

        existingProduct.setName(updatedProduct.getName());
        existingProduct.setCategory(updatedProduct.getCategory());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setId(updatedProduct.getId());
        existingProduct.setProductNo(updatedProduct.getProductNo());

        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
