package PizzaBillGenerator;

public class DeluxPizza extends pizza {
	
	public DeluxPizza (Boolean veg) {
		super(veg);
		
		super.addExtraCheese();
		super.addExtraToppings();
		
		
	}

}
