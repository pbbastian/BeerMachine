package beermachine.data.tasks;

import beermachine.data.entities.Product;

public class Purchase {

	private Product product;
	private int pAmount;
	
	public Purchase(Product product, int pAmount){
		this.product = product;
		this.pAmount = pAmount;
	}
	
}
