package com.bank.accounts;

public class Inyector {

	public static Client getClient() {
		
		AssignedAccount assignedAccount1 = new DebitAccount("Debit card");
		AssignedAccount assignedAccount2 = new CreditAccount("Credit card");
		AssignedAccount assignedAccount3 = new PayrollAccount("Pyroll card");

		
		return new Client("Pedro", "Gonzalez", 2027684, assignedAccount3);
	}
}
	

