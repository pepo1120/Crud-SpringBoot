package com.pepo1120.drkrpr.product;

import java.time.LocalDate;

public class Product {
    private Long idProduct;
    private String nameProduct;
    private float priceProduct;
    private LocalDate dateManufacture;
    private int ageProduct;

    public Product() {
    }


    public Product(Long idProduct, String nameProduct, float priceProduct, LocalDate dateManufacture, int ageProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.dateManufacture = dateManufacture;
        this.ageProduct = ageProduct;
    }

    public Product( String nameProduct, float priceProduct, LocalDate dateManufacture, int ageProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.dateManufacture = dateManufacture;
        this.ageProduct = ageProduct;
    }
    

    public Long getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPriceProduct() {
        return this.priceProduct;
    }

    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public LocalDate getDateManufacture() {
        return this.dateManufacture;
    }

    public void setDateManufacture(LocalDate dateManufacture) {
        this.dateManufacture = dateManufacture;
    }

    public int getAgeProduct() {
        return this.ageProduct;
    }

    public void setAgeProduct(int ageProduct) {
        this.ageProduct = ageProduct;
    }

}
