package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    private final BusBooking bookingService;
    private final PaymentService paymentService;

    @Autowired
    public BusinessService(BusBooking bookingService, PaymentService paymentService){
        this.bookingService = bookingService();
        this.paymentService = paymentService();

    }

    public void bookTickets(){
        bookingService.bookTickets();
        paymentService.payTickets();
    }

}
