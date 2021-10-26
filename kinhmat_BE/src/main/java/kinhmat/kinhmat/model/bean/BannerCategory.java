package kinhmat.kinhmat.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "banner_category")
public class BannerCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBannerCategory;
    private String nameBannerCategory;

    @OneToMany(mappedBy = "bannerCategory")
    @JsonBackReference
    private Set<Banner> banners;

    public BannerCategory() {
    }

    public BannerCategory(String nameBannerCategory, Set<Banner> banners) {
        this.nameBannerCategory = nameBannerCategory;
        this.banners = banners;
    }

    public int getIdBannerCategory() {
        return idBannerCategory;
    }

    public void setIdBannerCategory(int idBannerCategory) {
        this.idBannerCategory = idBannerCategory;
    }

    public String getNameBannerCategory() {
        return nameBannerCategory;
    }

    public void setNameBannerCategory(String nameBannerCategory) {
        this.nameBannerCategory = nameBannerCategory;
    }

    public Set<Banner> getBanners() {
        return banners;
    }

    public void setBanners(Set<Banner> banners) {
        this.banners = banners;
    }
}
