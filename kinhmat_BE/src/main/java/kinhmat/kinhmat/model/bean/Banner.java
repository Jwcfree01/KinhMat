package kinhmat.kinhmat.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBanner;
    @ManyToOne
    @JoinColumn(name = "id_banner_category", nullable = false)
    @JsonBackReference
    private BannerCategory bannerCategory;
    private String image;

    public Banner() {
    }

    public Banner(BannerCategory bannerCategory, String image) {
        this.bannerCategory = bannerCategory;
        this.image = image;
    }

    public int getId() {
        return idBanner;
    }

    public void setId(int id) {
        this.idBanner = id;
    }

    public BannerCategory getBannerCategory() {
        return bannerCategory;
    }

    public void setBannerCategory(BannerCategory bannerCategory) {
        this.bannerCategory = bannerCategory;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
