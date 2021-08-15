package com.trendyolfinal.basket.controller;

import com.trendyolfinal.basket.dto.BasketRequest;
import com.trendyolfinal.basket.model.Basket;
import com.trendyolfinal.basket.model.ProductInBasket;
import com.trendyolfinal.basket.service.BasketService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.var;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/basket")
@RequiredArgsConstructor
public class BasketController {
    private final BasketService service;

    @GetMapping
    public ResponseEntity<List<Basket>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> addProduct(@RequestBody @Valid BasketRequest request){
        return ResponseEntity.ok(service.addProducts(request));
    }

    @PostMapping("/remove")
    public ResponseEntity<?> removeProduct(@RequestBody @Valid BasketRequest request){
        String userid = request.getUserid();
        ProductInBasket product = new ProductInBasket();
        product.setProductid(request.getProductid());
        service.removeProduct(userid, product);
        return ResponseEntity.ok().build();
    }

}
