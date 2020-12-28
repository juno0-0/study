package testExample;

public class AGrade extends WirelessClass{
	private String[] custName;
	private String[] gradeCode;
	private int[] unitPrice;
	private int[] basePrice;
	private int[] useTime;
	
	

	public String[] getCustName() {
		return custName;
	}



	public void setCustName(String[] custName) {
		this.custName = custName;
	}



	public String[] getGradeCode() {
		return gradeCode;
	}



	public void setGradeCode(String[] gradeCode) {
		this.gradeCode = gradeCode;
	}



	public int[] getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(int[] unitPrice) {
		this.unitPrice = unitPrice;
	}



	public int[] getBasePrice() {
		return basePrice;
	}



	public void setBasePrice(int[] basePrice) {
		this.basePrice = basePrice;
	}



	public int[] getUseTime() {
		return useTime;
	}



	public void setUseTime(int[] useTime) {
		this.useTime = useTime;
	}



//	void aInput(String custName, String gradeCode, int useTime) {
//		//배열에 첨자 넣기
//		setCustName(custName);
//		setGradeCode(gradeCode);
//		setUseTime(useTime);
//		//this.custName=custName; 이걸 써도 되는듯
//	}
}
