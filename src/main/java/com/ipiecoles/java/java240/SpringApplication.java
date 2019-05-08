package com.ipiecoles.java.java240;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ipiecoles.java.java240")
@PropertySource("classpath:application.properties")
public class SpringApplication {
    @Value("${bitcoinService.forceRefresh}")
    private Boolean forceRefresh;

    @Bean(name = "refreshBitCoinService")
    public BitcoinService refreshBitcoinService(){
        return new BitcoinService(forceRefresh);
    }
    @Bean(name = "cacheBitCoinService")
    //@Primary
    @Qualifier("cache")
    public BitcoinService cacheBitcoinService(){
        return new BitcoinService(false);
    }
}
