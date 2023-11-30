package com.example.currencyexchangeservice.service;

import com.example.currencyexchangeservice.model.CurrencyData;
import com.example.currencyexchangeservice.model.CurrencyRequest;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrencyService {

    List<CurrencyData> staticCurrencyData = Arrays.asList(
            new CurrencyData(1, "USA", 83),
            new CurrencyData(2, "CANADA", 60),
            new CurrencyData(3, "SOUTH KOREA", 45),
            new CurrencyData(4, "LONDON", 65)
    );


    public List<CurrencyData> getCurrencyList(CurrencyRequest countryName){
        return staticCurrencyData.stream().filter(currency -> currency.getCountryName().equalsIgnoreCase(countryName.getCountryName())).collect(Collectors.toList());
    }
}
