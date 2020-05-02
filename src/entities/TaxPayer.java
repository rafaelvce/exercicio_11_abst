package entities;

public abstract class TaxPayer {
	
	private String name;
	private double annualIncome;
	
	public TaxPayer() {
		
	}

	public TaxPayer(String name, double annualncome) {
		this.name = name;
		this.annualIncome = annualncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getannualIncome() {
		return annualIncome;
	}

	public void setannualIncome(double annualncome) {
		this.annualIncome = annualncome;
	}
	
	public abstract double tax();
	
}
