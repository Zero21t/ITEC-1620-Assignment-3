// Aman Toor - 219323724

package Assingment3;

public class customer {
	
	//private//
	private String Name;
	private double Balance;
	//parameters//
	customer(String Name, double Balance){
		this.Name=Name;
		this.Balance=Balance;
	}
	
	String GetName() {
		return Name;
	}void setName(String Name){
		this.Name =Name;
	}
	
	double GetBalance() {
		return Balance;
	}void SetBalance(double Balance){
		this.Balance = Balance;
	}
	
	
	
	
	//methods//
	public String toString() {
		String clients = new String(Name + " has \t $"+ Balance);
		return clients;
	}
	public void addpercentage() {
		Balance = Balance+(0.15*Balance);
	}

}
