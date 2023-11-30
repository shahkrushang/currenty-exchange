package com.example.currencyexchangeservice.controller;


import com.example.currencyexchangeservice.model.CurrencyData;
import com.example.currencyexchangeservice.model.CurrencyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.currencyexchangeservice.service.CurrencyService;

import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyController {


    @Autowired
    private CurrencyService currencyService;


    @PostMapping("/currencyConversion")
    public ResponseEntity<?> returnCurrencyConversionRate(@RequestBody CurrencyRequest currencyRequest){
        List<CurrencyData> response = currencyService.getCurrencyList(currencyRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/hello")
    public String returnString(){
        return "Hello from currency Service!!";
    }
}
