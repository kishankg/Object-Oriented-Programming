import java.io.*;

/**
 * The class implements a simple bank account system.
 * @author Varun Yeligar, Omkar Kanade
 * @version 24-1-2019
 */

public class Account {

	private int acc_num;
	private String acc_name;
	private String date_created;
	private double balance;
	private double rate_of_interest;


	public Account(int acc_num, String acc_name, String date_created, double balance, double rate_of_interest) {
		this.acc_num = acc_num;
		this.acc_name = acc_name;
		this.date_created = date_created;
		this.balance = balance;
		this.rate_of_interest = rate_of_interest;
	}

	
	public long getBalance() {
		
	}


	public boolean deposit(double amount) {
		
	}


	public boolean withdraw (double amount) {
		
	}


	public long interestOnDeposit(int num_of_years) {
		
	}


	public long takeLoan(double amount, float rate_of_interest, int num_of_years) {
		
	}



}