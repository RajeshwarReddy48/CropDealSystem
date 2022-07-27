package com.controller.dealerservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.controller.dealerservice.model.Payment;

//import com.casestudy.Payment.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

}
