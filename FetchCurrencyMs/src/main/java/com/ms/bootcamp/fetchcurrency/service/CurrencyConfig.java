package com.ms.bootcamp.fetchcurrency.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyConfig {	
	//private static Logger logger = LoggerFactory.getLogger(CurrencyConfig.class);
	
	@Bean
	feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }

}
