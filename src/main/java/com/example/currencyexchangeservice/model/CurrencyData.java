package com.example.currencyexchangeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyData {

    private int currencyCountryId;
    private String countryName;
    private int currencyRateAgainstINR;
}
