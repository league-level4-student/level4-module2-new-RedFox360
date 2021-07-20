package _02_Generics_Store;

public class GoShopping {
	public static void main(String[] args) {
		// 1. Create 2 Cart objects(Candy, Cereal)
//		Cart<Candy> candyCart = new Cart<Candy>();
//		Cart<Cereal> cerealCart = new Cart<Cereal>();
//		// 2. Add items to each cart
//		candyCart.add(new Candy());
//		candyCart.add(new Candy());
//		candyCart.add(new Candy());
//		
//		cerealCart.add(new Cereal());
//		cerealCart.add(new Cereal());
//		cerealCart.add(new Cereal());
//		// 3. Call the showCart() method on each cart
//		candyCart.showCart();
//		cerealCart.showCart();
		// 4. Run the code
		
		// 5. Comment out the code you have so far
		// 1. Create 2 Cart objects(Candy, Cereal)
				Cart candyCart = new Cart();
					Cart cerealCart = new Cart();
				// 2. Add items to each cart
				candyCart.add(new Clothing());
				candyCart.add(new Clothing());
				candyCart.add(new Clothing());
				
				cerealCart.add(new Toy());
				cerealCart.add(new Toy());
				cerealCart.add(new Toy());
				// 3. Call the showCart() method on each cart
				candyCart.showCart();
				cerealCart.showCart();
		// 6. Repeat steps 1-3 for a Clothing Cart and a Toy Cart
		
		// Why are there errors?
		
		// 7. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 8. Run the code. Does it work?
		
	}
}
