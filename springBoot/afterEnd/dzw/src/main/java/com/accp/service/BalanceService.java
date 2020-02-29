package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Account;
import com.accp.domain.AccountExample;
import com.accp.domain.Bills;
import com.accp.domain.Billstype;
import com.accp.domain.Customer;
import com.accp.domain.Invoice;
import com.accp.domain.InvoiceType;
import com.accp.domain.Personnel;
import com.accp.domain.Vip;
import com.accp.domain.VipExample;
import com.accp.mapper.AccountMapper;
import com.accp.mapper.BillsMapper;
import com.accp.mapper.BillstypeMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.InvoiceMapper;
import com.accp.mapper.InvoiceTypeMapper;
import com.accp.mapper.PersonnelMapper;
import com.accp.mapper.VipMapper;

@Service
@Transactional
public class BalanceService {

	@Autowired
	CustomerMapper custMapper;
	@Autowired
	PersonnelMapper personMapper;
	@Autowired
	BillstypeMapper bMapper;
	@Autowired
	BillsMapper billMapper;
	@Autowired
	InvoiceTypeMapper itMapper;
	@Autowired
	AccountMapper aMapper;
	@Autowired
	VipMapper vipMapper;
	@Autowired
	InvoiceMapper inMapper;

	public List<Customer> queryAllcust() {
		return custMapper.selectByExample(null);
	}

	public List<Personnel> queryAllPer() {
		return personMapper.selectByExample(null);
	}

	public List<Billstype> queryTypes() {
		return bMapper.selectByExample(null);
	}

	public List<Bills> queryAllBills() {
		return billMapper.findAllBills();
	}

	public List<Bills> findbytj(Bills bill) {
		return billMapper.findbytj(bill);
	}

	public List<InvoiceType> findAllInvoice() {
		return itMapper.selectByExample(null);
	}

	public List<Account> findByBid(String bid) {
		AccountExample example = new AccountExample();
		example.createCriteria().andBidEqualTo(bid);
		return aMapper.selectByExample(example);
	}

	public List<Vip> findByCno(String cno) {
		VipExample example = new VipExample();
		example.createCriteria().andCnoEqualTo(cno);
		return vipMapper.selectByExample(example);
	}

	public int updateAccount(Account account) {
		return aMapper.updateAccount(account);
	}

	public int addInvoice(Invoice invoice) {
		return inMapper.addInvoice(invoice);
	}

	public int updateVip(Vip vip) {
		return vipMapper.updateVip(vip);
	}

}
