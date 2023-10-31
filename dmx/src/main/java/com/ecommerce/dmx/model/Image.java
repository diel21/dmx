package com.ecommerce.dmx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

@Entity
public class Image extends BaseModel {
    private String link;
    private String title;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "product_id", referencedColumnName = "id"),
        @JoinColumn(name = "product_company_id", referencedColumnName = "company_id")
    })
    private Product product;

    // Construtores, getters e setters
    public Image() {}

    public Image(String link, String title, Product product) {
        this.link = link;
        this.title = title;
        this.product = product;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}