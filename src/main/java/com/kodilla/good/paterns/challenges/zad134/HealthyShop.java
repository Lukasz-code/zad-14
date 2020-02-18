package com.kodilla.good.paterns.challenges.zad134;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements ShopService{

    private String productName;
    private Integer amount;


    @Override
    public Map<String, Integer> stanMagazynowy() {

        Map<String, Integer> stanMagazynowy = new HashMap<>();

        stanMagazynowy.put("Eco Salad", 10);
        stanMagazynowy.put("Eco Tomatoe", 10);
        stanMagazynowy.put("Eco Potatoe", 10);

        return stanMagazynowy;
    }

    @Override
    public boolean process(Product product) {
        return false;
    }
}
