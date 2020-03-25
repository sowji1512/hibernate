package com.citi.dao.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "tra_id")
	private int tid;
	
	
	@Column(name = "account_no")
	private String accountNo;
	
	@Column(name = "benef_acc_no")
	private String beneficaryAccountNo;
	
	@Column(name = "amt")
	private long amount;
	
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getBeneficaryAccountNo() {
		return beneficaryAccountNo;
	}
	public void setBeneficaryAccountNo(String beneficaryAccountNo) {
		this.beneficaryAccountNo = beneficaryAccountNo;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	

}
