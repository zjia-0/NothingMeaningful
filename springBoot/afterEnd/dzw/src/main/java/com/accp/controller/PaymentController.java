package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Payment;
import com.accp.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/paymentsel")
	public List<Payment> paymentsel(){
		return paymentService.paymentsel();
	}
	
}
