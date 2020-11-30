package smp;

public interface SMPInterface {
	int incentive(int monthlySales, int salesTarget);
	int aNetProfit(int monthlySales, int personnelExpense, int utilityCharges, int monthlyRent, double tax);
	double tax(int monthlySales);
}
