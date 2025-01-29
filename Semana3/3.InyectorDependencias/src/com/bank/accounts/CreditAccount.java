package com.bank.accounts;

public class CreditAccount implements AssignedAccount{

	private String accountType;
	
	//Constructor
	public CreditAccount(String accountType) {
		super();
		this.accountType = accountType;
	}


	@Override
	public void openAccount () {
		
			System.out.println("Cuenta otorgada: " + accountType);
		}		
	}

