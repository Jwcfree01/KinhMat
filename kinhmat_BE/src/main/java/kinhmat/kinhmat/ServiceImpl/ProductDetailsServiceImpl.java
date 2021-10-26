package kinhmat.kinhmat.ServiceImpl;

import kinhmat.kinhmat.Repository.ProductDetailsRepo;
import kinhmat.kinhmat.Service.ProductDetailsService;
import kinhmat.kinhmat.model.bean.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
    @Autowired
    ProductDetailsRepo productDetailsRepo;

    @Override
    public Page<ProductDetails> findAllProductDetails(Pageable pageable) {
        return this.productDetailsRepo.findAll(pageable);
    }

    @Override
    public Page<ProductDetails> searchByname(Pageable pageable) {
        return null;
    }

    @Override
    public void addProduct(ProductDetails productDetails) {
        this.productDetailsRepo.save(productDetails);
    }

    @Override
    public ProductDetails findById(int id) {
        return this.productDetailsRepo.findById(id).orElse(null);
    }

    @Override
    public void updateProduct(ProductDetails productDetails) {
        this.productDetailsRepo.save(productDetails);
    }

    @Override
    public void deleteProduct(int id) {
        this.productDetailsRepo.deleteById(id);
    }
}
