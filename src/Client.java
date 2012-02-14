import java.util.HashMap;


public class Client {
	
	private static Customer cTemp;
	private static Product pTemp;
	static HashMap<Long, Customer> customers = new HashMap<Long, Customer>();	
	static HashMap<Long, Product> products = new HashMap<Long, Product>();	

	public static Customer createCustomer(String name, long barCode, String crossVectorTeam, String studyLine){
		cTemp = new Customer(name, barCode, crossVectorTeam, studyLine);
		customers.put(barCode, cTemp);
		return cTemp;
	}
	
	public static Product createProduct(String name, String type, long barCode, int price){
		pTemp = new Product(name, type, barCode, price);
		products.put(barCode, pTemp);
		return pTemp;
	}
	
	public static Customer getCustomer(long barCode){
		return customers.get(barCode);
	}
	
	public static Product getProduct(long barCode){
		return products.get(barCode);
	}
	
	public static void main(String args[]){

		//Works but doesn't print purchases properly
		createCustomer("Thomas Hammerbak", 11223344, "Crimerider", "ITKom");
		createProduct("Tuborg Guld �l", "�l", 9999, 5);
		
		getCustomer(11223344).makePurchase(getProduct(9999), 2);
		
		System.out.println(getCustomer(11223344).getPurchaseString());
	}
	
}
