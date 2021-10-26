package kinhmat.kinhmat.Service;

import kinhmat.kinhmat.model.bean.ProductDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public interface ProductDetailsService {
    Page<ProductDetails> findAllProductDetails(Pageable pageable);
    Page<ProductDetails> searchByname(Pageable pageable);
    void addProduct(ProductDetails productDetails);
    ProductDetails findById (int id);
    void updateProduct(ProductDetails productDetails);
    void deleteProduct(int id);
}
