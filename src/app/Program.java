package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		//metodo de referência
		//list.removeIf(Product::noStaticProductPredicate);
		//Predicate<Product> pred = p -> p.getPrice() >=100.00;
		list.removeIf( p -> p.getPrice() >=100.00);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
