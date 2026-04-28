package service;

import service.BusinessService;
import service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BusBooking bookingService(){
        return new BusBooking();
    }

    @Bean
    public PaymentService paymentService(){
        return new PaymentService();
    }
}
