package com.example.demoapplication.Config;

import org.springframework.boot.cache.autoconfigure.JCacheManagerCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.CreatedExpiryPolicy;
import javax.cache.expiry.Duration;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public JCacheManagerCustomizer cacheManagerCustomizer() {
        return cacheManager -> {

            MutableConfiguration<Object, Object> config = new MutableConfiguration<>()
                    .setTypes(Object.class, Object.class)
                    .setStoreByValue(false)
                    .setStatisticsEnabled(true)
                    .setExpiryPolicyFactory(
                            CreatedExpiryPolicy.factoryOf(
                                    new Duration(TimeUnit.SECONDS, 60)
                            )
                    );


            if (cacheManager.getCache("products") == null) {
                cacheManager.createCache("products", config);
            }
        };
    }
}