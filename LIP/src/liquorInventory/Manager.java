package liquorInventory;

import java.util.*;

public class Manager{
	String name;
	private String id;
	private String pw;
	public Manager() {}
	
	public Manager(String name) {
		this.name = name;
	}

	private Set<Whisky> whisky = new LinkedHashSet<>();
	private Set<Vodka> vodka = new LinkedHashSet<>();
	private Set<Tequila> tequila = new LinkedHashSet<>();
	private Set<Gin> gin = new LinkedHashSet<>();
	private Set<Brandy> brandy = new LinkedHashSet<>();
	private Set<Rum> rum = new LinkedHashSet<>();
	
	public Set getLiquor(int i) {
		switch (i) {
			case 1: 
				return whisky;
			case 2: 
				return vodka;
			case 3: 
				return tequila;
			case 4: 
				return gin;
			case 5: 
				return brandy;
			case 6: 
				return rum;
			default:
				return null;
		}
	}

	public Set<Whisky> getWhisky() {
		return whisky;
	}

	public Set<Vodka> getVodka() {
		return vodka;
	}

	public Set<Tequila> getTequila() {
		return tequila;
	}

	public Set<Gin> getGin() {
		return gin;
	}

	public Set<Brandy> getBrandy() {
		return brandy;
	}

	public Set<Rum> getRum() {
		return rum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	
	
	
}
