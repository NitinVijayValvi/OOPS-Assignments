package com.yash.oops;

/*Create A class Fruit with following fields in it, fruitname, fruitcolor. Create subclass 
of Fruit, SweetFruit and SourFruits. You will have following fields, Calories, 
Carbohydrate, Fiber, Sugar, Fat, Protein, vitamins list will be an array of string in 
both the classes. You have to put an extra field by which you will tell why this fruit is 
sweet and sour in taste. 
You have to create array of object and insert detail of 3 fruits of each type. And print 
detail of each fruits one sweet and one sour.*/
public class SourFruits extends Fruit{

	private String calorieString;
	private String carbohydrateString;
	private String  fiberString;
	private String sugarString;
	private String fatString;
	private String proteiString;
	private String vitaminString;
	
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
	public SourFruits() {
		super();
	}
	
	
	
	

	
	public SourFruits(String fruitname, String fruitcolor, String calorieString, String carbohydrateString,
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
		return "SourFruits [calorieString=" + calorieString + ", carbohydrateString=" + carbohydrateString
				+ ", fiberString=" + fiberString + ", sugarString=" + sugarString + ", fatString=" + fatString
				+ ", proteiString=" + proteiString + ", vitaminString=" + vitaminString + ", toString()="
				+ super.toString() + "]";
	}
	public static void main(String[] args) {
		SourFruits sourfruit[] ;
		
		sourfruit = new SourFruits[3];
		
		sourfruit[0] = new SourFruits("lemon","yellow","240cal","50gm","50gm","50gm","50gm","50gm","50gm");
		
		
		sourfruit[1] = new SourFruits("grapfruit","orange","240cal","50gm","50gm","50gm","50gm","50gm","50gm");
		
		
		/*
		 * sFruits = arr[] sFruits.setFruitname("LEMON");
		 * sFruits.setFruitcolor("Yellow"); sFruits.setCalorieString("200kcal");
		 * sFruits.setCarbohydrateString("40gm"); sFruits.setFatString("30gm");
		 * sFruits.setFiberString("35gm"); sFruits.setProteiString("40gm");
		 * sFruits.setSugarString("20gm"); sFruits.setVitaminString("vitamin C");
		 */
		
		SweetFruits sweeFruits[] ;
		sweeFruits = new SweetFruits[2];
		
		sweeFruits[0] = new SweetFruits("Apple","red","240cal","50gm","50gm","100gm","50gm","50gm","50gm");
		
		sweeFruits[1] = new SweetFruits("Watermelon","red","240cal","50gm","50gm","100gm","50gm","50gm","50gm");
		
		
			System.out.println("Sourfruit:"+sourfruit[1].toString() );
		
		
		
		
	
	
}
}
