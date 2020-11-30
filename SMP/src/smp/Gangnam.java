package smp;

public class Gangnam extends HeadOffice{
	static int salesTarget = 50_000_000;
	
	public Gangnam() {}

	public Gangnam(int monthlySales, int personnelExpense, int utilityCharges, int monthlyRent) {
		super(monthlySales, personnelExpense, utilityCharges, monthlyRent, salesTarget);
	}
	
	@Override
	public String toString() {
		return "°­³²";
	}
}
