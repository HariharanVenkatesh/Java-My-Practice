package com.example.schoolmanagement.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Bean
    public String schoolName(){

        return "SRVS School";
    }

    public String schoolAddress(){

        return"27/5, Walsam Road,Charring Cross,Ooty - 643001";
    }
}
