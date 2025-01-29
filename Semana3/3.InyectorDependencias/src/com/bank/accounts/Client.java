package com.bank.accounts;

public class Client {

	//HAS-A
	private String name;
	private String surname;
	private long numberOfClient;
	private AssignedAccount assignedAccount;

	
	// Inyección por constructor
	public Client(String name, String surname, long numberOfClient, AssignedAccount assignedAccount) {
		super();
		this.name = name;
		this.surname = surname;
		this.numberOfClient = numberOfClient;
		this.assignedAccount = assignedAccount;
	}
	
	
	//Getters y Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public long getNumberOfClient() {
		return numberOfClient;
	}

	public void setNumberOfClient(long numberOfClient) {
		this.numberOfClient = numberOfClient;
	}

	public AssignedAccount getAssignedAcount() {
		return assignedAccount;
	}

	public void setAssignedAcount(AssignedAccount assignedAcount) {
		this.assignedAccount = assignedAcount;
	}


	public void registerClient() {
        System.out.println("Cliente registrado: " + name + " " + surname +"\nNúmero de cliente:" + numberOfClient);
        assignedAccount.openAccount();
    }
	
	
}
