package com.ipiecoles.java.java240;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ipiecoles.java.java240")
public class SpringApplication {
    @Bean(name = "refreshBitCoinService")
    public BitcoinService refreshBitcoinService(){
        return new BitcoinService(true);
    }
    @Bean(name = "cacheBitCoinService")
    public BitcoinService cacheBitcoinService(){
        return new BitcoinService(false);
    }
}
