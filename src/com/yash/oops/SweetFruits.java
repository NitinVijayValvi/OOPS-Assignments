package com.yash.oops;

public class SweetFruits extends Fruit{

	private String calorieString;
	private String carbohydrateString;
	private String  fiberString;
	private String sugarString;
	private String fatString;
	private String proteiString;
	private String vitaminString;
	public SweetFruits(){
		System.out.println("Default constructor");
	}
	

	public SweetFruits(String fruitname, String fruitcolor, String calorieString, String carbohydrateString,
			String fiberString, String sugarString, String fatString, String proteiString, String vitaminString) {
		super(fruitname, fruitcolor);
		this.calorieString = calorieString;
		this.carbohydrateString = carbohydrateString;
		this.fiberString = fiberString;
		this.sugarString = sugarString;
		this.fatString = fatString;
		this.proteiString = proteiString;
		this.vitaminString = vitaminString;
	}


	@Override
	public String toString() {
		return "SweetFruits [calorieString=" + calorieString + ", carbohydrateString=" + carbohydrateString
				+ ", fiberString=" + fiberString + ", sugarString=" + sugarString + ", fatString=" + fatString
				+ ", proteiString=" + proteiString + ", vitaminString=" + vitaminString + ", getFruitname()="
				+ getFruitname() + ", getFruitcolor()=" + getFruitcolor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public String getCalorieString() {
		return calorieString;
	}
	public void setCalorieString(String calorieString) {
		this.calorieString = calorieString;
	}
	public String getCarbohydrateString() {
		return carbohydrateString;
	}
	public void setCarbohydrateString(String carbohydrateString) {
		this.carbohydrateString = carbohydrateString;
	}
	public String getFiberString() {
		return fiberString;
	}
	public void setFiberString(String fiberString) {
		this.fiberString = fiberString;
	}
	public String getSugarString() {
		return sugarString;
	}
	public void setSugarString(String sugarString) {
		this.sugarString = sugarString;
	}
	public String getFatString() {
		return fatString;
	}
	public void setFatString(String fatString) {
		this.fatString = fatString;
	}
	public String getProteiString() {
		return proteiString;
	}
	public void setProteiString(String proteiString) {
		this.proteiString = proteiString;
	}
	public String getVitaminString() {
		return vitaminString;
	}
	public void setVitaminString(String vitaminString) {
		this.vitaminString = vitaminString;
	}
	
	
}
