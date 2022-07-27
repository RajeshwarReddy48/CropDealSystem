package com.controller.dealerservice.model;

import java.util.List;


public class PaymentList {
	private List<Payment> paymentlist;

	public PaymentList(List<Payment> paymentlist) {
		super();
		this.paymentlist = paymentlist;
	}

	public PaymentList() {
		super();
	}

	public List<Payment> getPaymentlist() {
		return paymentlist;
	}

	public void setPaymentlist(List<Payment> paymentlist) {
		this.paymentlist = paymentlist;
	} 
	

}
