package liquorInventory;
import java.text.DecimalFormat;
import java.util.*;


public class Liquor implements Comparable<Liquor>{
	String name;//�� �̸�
	int ripeYear;//�����⵵
	int price;//����
	double bottleCnt;//���
	Manager manager = new Manager();
	public Liquor() {}
	
	public Liquor(String name, int ripeYear, int price, double bottleCnt) {
		this.name = name;
		this.ripeYear = ripeYear;
		this.price = price;
		this.bottleCnt = bottleCnt;
	}

	
	@Override
	public int hashCode() {
		return (name+ripeYear+price+bottleCnt).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Liquor) {
			Liquor l = (Liquor)obj;
			return name.equals(l.name)&&ripeYear==l.ripeYear&&price==l.price&&bottleCnt==l.bottleCnt;			
		}else return false;		
	}

	@Override
	public int compareTo(Liquor o) {
		if(name.hashCode() < o.name.hashCode())return -1;
		else if(name.hashCode() == o.name.hashCode())return 0;
		else return 1;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		return name+" "+ripeYear+"��   "+df.format(price)+"��   "+bottleCnt+"��";
	}
	
	
}
