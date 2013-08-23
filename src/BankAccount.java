
public class BankAccount {
	private String clientName;
	private double clientAccountNumber;
	private double clientBalance;
	private double deductMonthlyFee;
	private String explainAccountPolicy;
	
	//Overloaded constructor
	public BankAccount(String newClientName, double newClientAccountNumber, double newClientBalance, double newDeductMonthlyFee, String newExplainAccountPolicy ) {
		clientName = newClientName;
		clientAccountNumber = newClientAccountNumber;
		clientBalance = newClientBalance;
		deductMonthlyFee = newDeductMonthlyFee;
		explainAccountPolicy = newExplainAccountPolicy;
	}		
	
	//Default constructor
	public BankAccount() {
		this("unknown", 000000, 000000, 4, "see policy");
	}
	
	//Accessor methods
	public String getClientName() {
		return clientName;
	}
	
	public double getClientAccountNumber() {
		return clientAccountNumber;
	}	
	public double getClientBalance() {
		return clientBalance;
	}
	
	public double getDeductMonthlyFee() {
		return deductMonthlyFee;
	}
	
	public String getExplainAccountPolicy() {
		return explainAccountPolicy;
	}
	
	//Mutator methods
	public void setClientName(String name) {
		clientName = name;
	}	
	public void setClientAccountNumber (double newNumber) {
		clientAccountNumber = newNumber;
	}
	
	public void setClientBalance (double newBalance) {
		clientBalance = newBalance;
	}
	
	public void setDeductMonthlyFee (double newDeduct) {
		deductMonthlyFee = newDeduct;
	}
	
	public void setExpalainAccountPolicy (String newExplain) {
		explainAccountPolicy = newExplain;
	}
}

	
	