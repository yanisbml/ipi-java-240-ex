package com.ipiecoles.java.java240;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.ipiecoles.java.java240")
public class SpringApplication {
    @Bean(name = "refreshBitCoinService")
    public BitcoinService refreshBitcoinService(){
        return new BitcoinService(true);
    }
    @Bean(name = "cacheBitCoinService")
    //@Primary
    @Qualifier("cache")
    public BitcoinService cacheBitcoinService(){
        return new BitcoinService(false);
    }
}
