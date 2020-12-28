package stack;

import java.util.*;

//stack은 Vector의 하위 클래스
//후입선출
public class StackEx {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getMoney());
		}
		System.out.println(coinBox.isEmpty());
		
		Stack<Car> parking = new Stack<Car>();
		parking.push(new Car("BMW"));
		parking.push(new Car("Benz"));
		parking.push(new Car("Audi"));
		parking.push(new Car("Ferarri"));
		while(!parking.isEmpty()) {
			Car car = parking.pop();
			System.out.println("출차 : "+car.getCarkind());
		}
		
	}
}
class Coin{
	private int money;
	public Coin(int money) {
		this.money=money;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}	
}

class Car{
	String carkind;

	public Car(String carkind) {
		this.carkind = carkind;
	}

	public String getCarkind() {
		return carkind;
	}

	public void setCarkind(String carkind) {
		this.carkind = carkind;
	}
	
	
	
}

