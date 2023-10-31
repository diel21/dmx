package com.ecommerce.dmx.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Company extends BaseModel {
    private String name;
    private String fantasyName;
    private String cnpj;

    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;

    @OneToMany(mappedBy = "company")
    private List<Product> products;

    @OneToMany(mappedBy = "company")
    private List<Address> addresses;

    // Construtores, getters e setters
    public Company() {}

    public Company(String name, String fantasyName, String cnpj, Image image) {
        this.name = name;
        this.fantasyName = fantasyName;
        this.cnpj = cnpj;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
