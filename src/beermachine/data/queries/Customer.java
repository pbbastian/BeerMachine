package beermachine.data.queries;

import beermachine.data.entities.Product;
import beermachine.data.tasks.Purchase;

import java.util.HashMap;


public class Customer {

	private String cName;
	private long cBarCode;
	private int purchaseNr;
	private String cVectorTeam;
	private String cCrossVectorTeam;
	private String cStudyLine;
	private HashMap<Integer, Purchase> purchase = new HashMap<Integer, Purchase>();
	private Purchase newPurchase;
	
	public Customer(String cName, long cBarCode, String cCrossVectorTeam, String cStudyLine){
		
		this.cName = cName;
		this.cBarCode = cBarCode;
		this.cCrossVectorTeam = cCrossVectorTeam;
		this.cStudyLine = cStudyLine;
		purchaseNr = 0;
		
	}
	
	public String toString(){
		return "Name: " + cName + ", Barcode: " + cBarCode + ", Studyline: " + 
			   cStudyLine + ", Cross vector team: " + cCrossVectorTeam;
	}
	
	public Purchase makePurchase(Product product, int pAmount){
		newPurchase = new Purchase(product, pAmount);
		purchase.put(purchaseNr, newPurchase);
		purchaseNr++;
		return newPurchase;
	}
	
	public HashMap<Integer, Purchase> getPurchase(){
		return (HashMap<Integer, Purchase>) purchase;
	}
	
	public String getPurchaseString(){
		String hMap = null;
		for(int i = 0; i < purchase.size(); i++){
			hMap = purchase.toString();
		}
		return hMap;
	}
	
	public String getName(){
		return cName;
	}
	
	public long getBarCode(){
		return cBarCode;
	}
	
	public String getCrossVectorTeam(){
		return cCrossVectorTeam;
	}
	
	public String getStudyLine(){
		return cStudyLine;
	}
	
}
