package com.trendyolfinal.basket.dto;

import com.trendyolfinal.basket.model.ProductInBasket;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
public class BasketRequest {
    @NotBlank(message = "User auth failed")
    private String userid;

    @NotBlank
    private String productid;
}

