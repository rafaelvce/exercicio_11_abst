package entities;

public class Individual extends TaxPayer {

	private double healthExp;

	public Individual() {
		super();
	}

	public Individual(String name, double annualIncome, double healthExp) {
		super(name, annualIncome);
		this.healthExp = healthExp;
	}

	public double getHealthExp() {
		return healthExp;
	}

	public void setHealthExp(double healthExp) {
		this.healthExp = healthExp;
	}

	@Override
	public double tax() {
		if (getannualIncome() < 20000.0) {
			if (healthExp > 0.0) {
				return getannualIncome() * 0.15 - healthExp / 2;
			} else {
				return getannualIncome() * 0.15;
			}
		} else {
			if (healthExp > 0.0) {
				return getannualIncome() * 0.25 - healthExp / 2;
			} else {
				return getannualIncome() * 0.25;
			}
		}
	}
}
