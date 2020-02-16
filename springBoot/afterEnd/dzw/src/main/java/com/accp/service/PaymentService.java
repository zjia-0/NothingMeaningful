package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Payment;
import com.accp.mapper.PaymentMapper;

@Service
@Transactional
public class PaymentService {
	@Autowired
	PaymentMapper paymentMapper;
	
	public List<Payment> paymentsel(){
		return paymentMapper.selectByExample(null);
	}

}
