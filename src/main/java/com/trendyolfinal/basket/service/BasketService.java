package com.trendyolfinal.basket.service;

import com.trendyolfinal.basket.dto.BasketRequest;
import com.trendyolfinal.basket.model.Basket;
import com.trendyolfinal.basket.model.ProductInBasket;

import java.util.List;

public interface BasketService {
    List<Basket> getAll();

    Basket addProducts(BasketRequest request);

    void removeProduct(String userid, ProductInBasket product);



    /*
    //Kafka consumers:
    //user.create
    void createBasket
    //user.delete
    void deleteBasket

    //product.delete
    void deleteProductFromBaskets

    //stock.amountChange
    void stockAmountChange
    //stock.PriceChange
    void stockPriceChange
    */
}
