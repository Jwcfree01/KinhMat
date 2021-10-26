package kinhmat.kinhmat.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSP;
    private String name;

    @OneToMany(mappedBy = "product")
    @JsonBackReference
    private Set<ProductDetails> productDetails;

    public Product() {
    }

    public Product(int idSP, String name, Set<ProductDetails> productDetails) {
        this.idSP = idSP;
        this.name = name;
        this.productDetails = productDetails;
    }

    public Product(String name, Set<ProductDetails> productDetails) {
        this.name = name;
        this.productDetails = productDetails;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductDetails> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(Set<ProductDetails> productDetails) {
        this.productDetails = productDetails;
    }
}
