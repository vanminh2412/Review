package com.product.review.revier.model;

public class Product {
    private int id;
    private String producName;
    private double rating;
    private int imgproduct,imgvote1,imgvote2,imgvote3,imgvote4,imgvote5;

    public Product(int id, String producName, double rating, int imgproduct, int imgvote1, int imgvote2, int imgvote3, int imgvote4, int imgvote5) {
        this.id = id;
        this.producName = producName;
        this.rating = rating;
        this.imgproduct = imgproduct;
        this.imgvote1 = imgvote1;
        this.imgvote2 = imgvote2;
        this.imgvote3 = imgvote3;
        this.imgvote4 = imgvote4;
        this.imgvote5 = imgvote5;
    }

    public int getId() {
        return id;
    }

    public String getProducName() {
        return producName;
    }

    public double getRating() {
        return rating;
    }

    public int getImgproduct() {
        return imgproduct;
    }

    public int getImgvote1() {
        return imgvote1;
    }

    public int getImgvote2() {
        return imgvote2;
    }

    public int getImgvote3() {
        return imgvote3;
    }

    public int getImgvote4() {
        return imgvote4;
    }

    public int getImgvote5() {
        return imgvote5;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProducName(String producName) {
        this.producName = producName;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setImgproduct(int imgproduct) {
        this.imgproduct = imgproduct;
    }

    public void setImgvote1(int imgvote1) {
        this.imgvote1 = imgvote1;
    }

    public void setImgvote2(int imgvote2) {
        this.imgvote2 = imgvote2;
    }

    public void setImgvote3(int imgvote3) {
        this.imgvote3 = imgvote3;
    }

    public void setImgvote4(int imgvote4) {
        this.imgvote4 = imgvote4;
    }

    public void setImgvote5(int imgvote5) {
        this.imgvote5 = imgvote5;
    }
}
