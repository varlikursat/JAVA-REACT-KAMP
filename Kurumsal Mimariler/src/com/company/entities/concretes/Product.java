package com.company.entities.concretes;

import com.company.entities.absracts.Entity;

public class Product implements Entity {
    private int id;
    private int categoryId;
    private  String name;
    private double unitPrice;
    private int unitsStock;

    public Product(int id, int categoryId,String name,double unitPrice,int unitsStock) {
        super();
        this.id=id;
        this.categoryId=categoryId;
        this.name=name;
        this.unitPrice=unitPrice;
        this.unitsStock=unitsStock;
    }

    public int getCategoryId() {
        return categoryId;
    }
}
