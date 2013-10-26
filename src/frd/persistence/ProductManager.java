package frd.persistence;

import java.util.List;

import frd.model.Product;

public class ProductManager extends DataManager {

	public static List<Product> getAll() {
		return DataManager.getAll(Product.class);
		//return new ArrayList<Product>();
	}

}
