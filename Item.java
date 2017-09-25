package rms;

import java.text.NumberFormat;

public class Item {

	//fields
	
	private double price;
	private String name;
	private String category;
	private String size;
	NumberFormat numForm=NumberFormat.getCurrencyInstance();
	
	//constructors
	public Item(String name, String category, double price) {
		this.name=name;
		this.category=category;
		this.price=price;
		
	}
	 
	//setter and getter
	public double getPrice() {
		return price;
	}
	 public void setPrice(double price) {
		 this.price=price;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size=size;
	}
	
	//tostring
    public String toString() {
    	if(size!=null) { return "(" + size + ")"  + name +  "\t" + numForm.format(price); }
    	else { return name + "\t"   +  numForm.format(price); }
    		
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
