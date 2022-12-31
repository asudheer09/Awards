package com.example.award;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NationalAward implements Award{
    @Override
    public void displayAward() {
        System.out.println("National Award");
    }
}
// NationalAward nationalAward= new NationalAward();