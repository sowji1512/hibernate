package com.citi.dap.onetomanypc;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "account1")
public class Account  {
	/**
	 * 
	 */
	@Id
	private String accountNo;
	private String accHoldername;
	private long outstandingBalance;

	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<AccountTransaction> listTransaction;

	public List<AccountTransaction> getListTransaction() {
		return listTransaction;
	}

	public void setListTransaction(List<AccountTransaction> listTransaction) {
		this.listTransaction = listTransaction;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccHoldername() {
		return accHoldername;
	}

	public void setAccHoldername(String accHoldername) {
		this.accHoldername = accHoldername;
	}

	public long getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(long outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

}
