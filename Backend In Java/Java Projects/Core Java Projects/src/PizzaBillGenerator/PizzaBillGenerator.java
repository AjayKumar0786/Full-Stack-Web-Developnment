package PizzaBillGenerator;

public class PizzaBillGenerator {
	
	public static void main(String[]args) {
		
		pizza basePizza = new pizza(true);
			
		//basePizza.addExtraToppings();
		//basePizza.addExtraCheese();
		//basePizza.takeAway();
		//basePizza.getBill();
		
		
		DeluxPizza dp = new DeluxPizza(true);
		dp.addExtraCheese();
		dp.addExtraToppings();
        dp.getBill();	
		
        
		
	}

}
