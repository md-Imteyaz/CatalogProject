package com.imteyaz.category.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private long id;
    private String name;
    private List<CategoryChild> categoryChildren;
    private long totalSales;
    private long totalQuantity;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryChild> getChildren() {
        return categoryChildren;
    }

    public void setChildren(List<CategoryChild> children) {
        this.categoryChildren = children;
    }

    public long getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(long totalSales) {
        this.totalSales = totalSales;
    }

    public long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Category(long id, String name, List<CategoryChild> children, long totalSales, long totalQuantity) {
        this.id = id;
        this.name = name;
        this.categoryChildren = children;
        this.totalSales = totalSales;
        this.totalQuantity = totalQuantity;
    }

    public Category() {
        super();
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + categoryChildren +
                ", totalSales=" + totalSales +
                ", totalQuantity=" + totalQuantity +
                '}';
    }
}
