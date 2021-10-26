package kinhmat.kinhmat.Repository;

import kinhmat.kinhmat.model.bean.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Integer> {
}
