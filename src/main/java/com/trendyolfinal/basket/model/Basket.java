package com.trendyolfinal.basket.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Required;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Basket {

    private String userid;

    private Set<ProductInBasket> contents = new HashSet<>();

    public void addProduct(ProductInBasket product){
        contents.add(product);
    }

    public void removeProduct(ProductInBasket product){
        contents.remove(product);
    }
}
