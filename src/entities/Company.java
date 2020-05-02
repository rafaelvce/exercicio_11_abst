package entities;

public class Company extends TaxPayer {

	private int numberEmp;

	public Company() {
		super();
	}

	public Company(String name, double annualncome, int numberEmp) {
		super(name, annualncome);
		this.numberEmp = numberEmp;
	}

	public int getNumberEmp() {
		return numberEmp;
	}

	public void setNumberEmp(int numberEmp) {
		this.numberEmp = numberEmp;
	}

	@Override
	public double tax() {
		if (numberEmp > 10) {
			return getannualIncome() * 0.14;
		} else {
			return getannualIncome() * 0.16;
		}
	}

}
