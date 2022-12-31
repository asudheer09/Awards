package com.example.award;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OscarAward implements Award{
    @Override
    public void displayAward() {
        System.out.println("Oscar Award");
    }
}

//inside IOC container the object creation will be like following
// OscarAward oscarAward= new OscarAward();
