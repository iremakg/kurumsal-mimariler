package nLayeredDemo.Entities.Concretes;

import nLayeredDemo.Entities.Abstracts.Entity;

public class Product implements Entity {
    private int id;
    private double unitPrice;
    private int categoryId;
    private String name;
    private int unitsInStock;


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Product(){}

    public Product(int id,String name,int categoryId,double unitPrice,int unitsInStock) {
        super();
        this.id = id;
        this.name=name;
        this.categoryId=categoryId;
        this.unitPrice=unitPrice;
        this.unitsInStock=unitsInStock;
    }



}
