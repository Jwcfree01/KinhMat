package kinhmat.kinhmat.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_details")
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSPCT;
    private String nameSP;
    private String quantity;
    private String price;
    private String promotionPrice;
    private String imageUrl;
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_sp", nullable = false)
    @JsonBackReference
    private Product product;

    @ManyToMany(mappedBy = "productDetails")
    @JsonBackReference
    private Set<Bill> bills;

    public ProductDetails() {
    }

    public ProductDetails(String nameSP, String quantity, String price, String promotionPrice, String imageUrl, String description, Product product) {
        this.nameSP = nameSP;
        this.quantity = quantity;
        this.price = price;
        this.promotionPrice = promotionPrice;
        this.imageUrl = imageUrl;
        this.description = description;
        this.product = product;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
