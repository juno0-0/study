package smp;

public class Cheongdam extends HeadOffice{
	static int salesTarget = 60_000_000;
	
	public Cheongdam() {}

	public Cheongdam(int monthlySales, int personnelExpense, int utilityCharges, int monthlyRent) {
		super(monthlySales, personnelExpense, utilityCharges, monthlyRent, salesTarget);
	}
	
	@Override
	public String toString() {
		return "Ã»´ã";
	}
	
	
	
}
