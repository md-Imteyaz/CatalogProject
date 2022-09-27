package com.imteyaz.category.model;

import java.util.*;

public class CategoryApplication {

    public static void main(String[] args) {

        //Catalog catobj = new Catalog();
        List<Sale> s=new ArrayList<Sale>();
        s.add(new Sale(1,1,1,232,245));
        s.add(new Sale(2,2,2,343,512));
        s.add(new Sale(3,3,3,422,500));
        s.add(new Sale(4,4,4,415,555));
        s.add(new Sale(5,5,5,455,542));


        //catobj.buildCategories(s);


        List<Integer> amount = new ArrayList<Integer>();
        for(Sale sale: s){
            if(sale.getAmount()>200){
                amount.add(sale.getAmount());
            }
        }
        System.out.println(s);

        List<Category> children=new ArrayList<Category>();
        children.add(new Category(1L,"shiava",Arrays.asList(new CategoryChild(1,"finctiional","the lightness")),2321L,33L));
        children.add(new Category(2L,"rohan",Arrays.asList(new CategoryChild(2,"thriller"," rush")),2321L,33L));
        children.add(new Category(3L,"rahul",Arrays.asList(new CategoryChild(3,"comdey","invisible")),2321L,33L));
        children.add(new Category(4L,"vijay",Arrays.asList(new CategoryChild(4,"horror comedy","illness")),2321L,33L));



    }



}
