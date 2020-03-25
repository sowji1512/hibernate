package com.citi.dap.onetomanypc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accountTransaction1")
public class AccountTransaction  {

	

	@Id	
	@Column(name = "tra_id")
	private int tid;
	
	@ManyToOne
	@JoinColumn(name="account_No")
	private Account account;
	
	@Column(name = "benef_acc_no")
	private String beneficaryAccountNo;
	
	@Column(name = "amt")
	private long amount;
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
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
