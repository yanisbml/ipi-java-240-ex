package com.ipiecoles.java.java240;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class SpringApplication {

    @Value("${bitcoinService.forceRefresh}")
    private Boolean forceRefresh;

    @Bean(name = "refreshBitCoinService")
    public BitcoinService refreshBitcoinService(){
        return new BitcoinService(forceRefresh);
    }
    @Bean(name = "cacheBitCoinService")
    @Primary
    public BitcoinService cacheBitcoinService(){
        return new BitcoinService(false);
    }

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }

}