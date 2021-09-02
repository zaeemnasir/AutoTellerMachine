package application;

public class Account {

	//Declaration of variables

	private String _customerName;
	private int _id;
	private double _balance;
	private double _annualInterestRate = 3;
	private double interestAmount;

	//Two Argument Constructor
	public Account (String customerName, int id){

	}

	//Default COnstructor
	public Account() {}

	//Getter and Setters


	public String getCustomerName() {
		return _customerName;
	}


	public void setCustomerName(String _customerName) {
		this._customerName = _customerName;
	}


	public int getId() {
		return _id;
	}


	public void setId(int _id) {
		this._id = _id;
	}


	public double getBalance() {
		return _balance;
	}


	public void setBalance(double _balance) {
		this._balance = _balance;
	}


	public double getAnnualInterestRate() {
		return _annualInterestRate;
	}


	public void setAnnualInterestRate(double _annualInterestRate) {
		this._annualInterestRate = _annualInterestRate;
	}

	//Method Deposit

	public void deposit (double amount){
		_balance += amount;
	}

	//Method Withdraw
	public void withdraw (double amount){
		_balance -= amount;
	}

	//Method to calculate monthly interest
	public void monthlyInterest (){
		interestAmount = _balance * (_annualInterestRate/12/10);
		return;
	}


	public String toString(){
		return "\nName: " + getCustomerName() + "\nAccount Balance: " + getBalance() + "\nMonthly Interest Earned: " + getAnnualInterestRate();
	}





}
