package Selenium.SeleniumTesting;


public class BankAcaunt {

	int amount;
	
	public BankAcaunt(int initAmount){
		this.amount = initAmount;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	
	public int getAmount(){
		return this.amount;
	}
}
