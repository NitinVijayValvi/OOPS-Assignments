package com.yash.oops;

public class Fruit {
	private String fruitname;
	private String fruitcolor;
	public Fruit() {
		
		
	}
	
	@Override
	public String toString() {
		return "Fruit [fruitname=" + fruitname + ", fruitcolor=" + fruitcolor + "]";
	}

	public Fruit(String fruitname, String fruitcolor) {
		super();
		this.fruitname = fruitname;
		this.fruitcolor = fruitcolor;
	}

	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public String getFruitcolor() {
		return fruitcolor;
	}
	public void setFruitcolor(String fruitcolor) {
		this.fruitcolor = fruitcolor;
	}
	
	
}
