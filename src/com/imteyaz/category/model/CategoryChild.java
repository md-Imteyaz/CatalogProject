package com.imteyaz.category.model;

public class CategoryChild {
    private int cId;
    private String cType;
    private String name;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryChild(int cId, String cType, String name) {
        this.cId = cId;
        this.cType = cType;
        this.name = name;
    }

    public CategoryChild() {
        super();
    }

    @Override
    public String toString() {
        return "CategoryChild{" +
                "cId=" + cId +
                ", cType='" + cType + '\'' +
                ", name='" + name + '\'' +
                '}';

    }
}
