package com.bank.accounts;

public class PayrollAccount implements AssignedAccount {

private String accountType;
	
	//Constructor
	public PayrollAccount(String accountType) {
		super();
		this.accountType = accountType;
	}


	@Override
	public void openAccount () {
		
			System.out.println("Cuenta otorgada: " + accountType);
		}		
	}

