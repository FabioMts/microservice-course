package com.ibm.hrpayroll.services;

import com.ibm.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("bob", 200.0, days);
    }

}
