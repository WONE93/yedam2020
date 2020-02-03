package com.yedam.shw.classes;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
		
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int amount) {
		if(amount>=10 && amount <= 100000) {
			balance=balance + amount;
		}else {
			balance = balance + 0;
		}
	}
		
		public void withdrawBalance(int amount) {
			if(amount>=10 && amount <= 10000) {
				balance=balance - amount;
			}else {
				balance = balance - 0;
			}
		}

	@Override
	public String toString() {
		return "<계좌조회>  이름: " + owner +  "  계좌번호: " + ano + "  잔액: " + balance  ;
	}
	
	public String toString2() {
		return "<계좌조회> \n 이름: " + owner +  " \n 계좌번호: " + ano + " \n 잔액: " + balance  ;
	}
	
	
	
}
