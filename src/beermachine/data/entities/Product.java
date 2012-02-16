package beermachine.data.entities;

import java.io.Serializable;

public class Product implements Serializable{

	private String pName;
	private String type;
	private long barCode;
	private int pPrice;
	
	public Product(String pName, String type, long barCode, int pPrice){
		
		this.pName = pName;
		this.type = type;
		this.barCode = barCode;
		this.pPrice = pPrice;
		
	}
	
	public String toString(){
		return "Navn: " + pName + ", Type: " + type + ", Productnumber: " + barCode + ", Productprice: " + pPrice;
	}
	
	public String getName(){
		return pName;
	}
	
	public long getNumber(){
		return barCode;
	}
	
}
