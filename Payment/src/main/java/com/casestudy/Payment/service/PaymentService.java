package com.casestudy.Payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.Payment.model.Payment;
import com.casestudy.Payment.model.PaymentList;
import com.casestudy.Payment.repository.PaymentRepository;
//import com.controller.farmerservice.model.Farmer;
//import com.controller.farmerservice.model.FarmerList;

@Service
public class PaymentService {
@Autowired
private PaymentRepository repository;
	public Payment doPay(Payment payment) {
		
			payment.setStatus(paymentStatus());
			return repository.save(payment);
	}
	private String paymentStatus() {
		return "success";
	}
	public PaymentList getAllPayments() {
		// TODO Auto-generated method stub
		
			List<Payment> allPayments = repository.findAll();
			PaymentList listpayment= new PaymentList();
			listpayment.setPaymentlist(allPayments);
			
			//return
			return listpayment;
		}
	
}