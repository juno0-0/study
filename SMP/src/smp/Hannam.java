package smp;

public class Hannam extends HeadOffice{
	static int salesTarget = 40_000_000;//��ǥ����
	
	public Hannam() {}
	
	public Hannam(int monthlySales, int personnelExpense, int utilityCharges, int monthlyRent) {
		super(monthlySales, personnelExpense, utilityCharges, monthlyRent, salesTarget);
	}
	
	@Override
	public String toString() {
		return "�ѳ�";
	}
}
