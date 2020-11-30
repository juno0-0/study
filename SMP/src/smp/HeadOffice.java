package smp;

public class HeadOffice implements SMPInterface{
	static final double standardTax=0.1;
	int monthlySales;//월매출
	int personnelExpense;//인건비
	int utilityCharges;//공과금
	int monthlyRent;//월세
	int incentive;//인센티브
	int aNetProfit;//순이익
	int salesTarget;//목표금액
	double tax;//세금
	static private String id = "bang";
	static private String pw = "1234";
	
	
	
	public static String getId() {
		return id;
	}

	public static String getPw() {
		return pw;
	}

	Cheongdam[] aC = new Cheongdam[12];
	Gangnam[] aG = new Gangnam[12];
	Hannam[] aH = new Hannam[12];
	
	public HeadOffice() {}
	
	public HeadOffice(int monthlySales, int personnelExpense, int utilityCharges, int monthlyRent, int salesTarget) {
		this.monthlySales = monthlySales;
		this.personnelExpense = personnelExpense;
		this.utilityCharges = utilityCharges;
		this.monthlyRent = monthlyRent;
		this.salesTarget = salesTarget;
		tax = tax(monthlySales);
		incentive = incentive(this.monthlySales, this.salesTarget);
		aNetProfit = aNetProfit(monthlySales, personnelExpense, utilityCharges, monthlyRent, tax)-incentive;
	}
	
	//세금
	@Override
	public double tax(int monthlySales) {
		return monthlySales*HeadOffice.standardTax;
	}
	
	//순이익
	@Override
	public int aNetProfit(int monthlySales, int personnelExpense, int utilityCharges, int monthlyRent, double tax) {
		return monthlySales - (int)(personnelExpense + utilityCharges + monthlyRent + tax);
	}
	
	//매출목표달성
	@Override
	public int incentive(int monthlySales, int salesTarget) {
		if(monthlySales>=salesTarget) {
			return (int)(monthlySales*0.1);
		}else {
			return 0;			
		}
	}
}
