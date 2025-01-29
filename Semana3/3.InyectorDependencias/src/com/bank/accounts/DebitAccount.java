package com.bank.accounts;

public class DebitAccount implements AssignedAccount{

	private String accountType;
	
	//Constructor
	public DebitAccount(String accountType) {
		super();
		this.accountType = accountType;
	}


	@Override
	public void openAccount () {
		
			System.out.println("Cuenta otorgada: " + accountType);
		}		
	}
