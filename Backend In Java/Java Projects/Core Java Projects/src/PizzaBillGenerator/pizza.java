package PizzaBillGenerator;

public class pizza {
	
	private int price;
	private boolean veg;
	
	private int extraCheesePrice = 100;
	private int extraTppingsAdded = 150;
	private int backPackPrice = 20;
	private int basePizzaPrice ;
	
	private boolean isExtraCheesAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;
	
    public pizza(boolean veg) {
    	this.veg = veg;
    	if(this.veg) {
    		this.price = 300;
    		
    	}else {
    		
    		this.price = 400;
    	}
    	
    	basePizzaPrice = this.price;
    }
    
    public void addExtraCheese() {
       
    	isExtraCheesAdded = true;
    	this.price += extraCheesePrice;
    }
    
    
    public void addExtraToppings() {
    	isExtraToppingsAdded = true;
        this.price += extraTppingsAdded;
    	
    }
    
    
    public void takeAway() {
    	 isOptedForTakeAway = true;
         this.price +=  backPackPrice;
     	
     	
    	
    }
    
    
    
    public void getBill() {
    	
    	String bill =" ";
    	
    	System.out.println("Pizza"+ basePizzaPrice);
    	
    	if(isExtraCheesAdded) {
    		bill += "Extra chese added:" + extraCheesePrice+ "\n";
    	}
    	
    	if(isExtraToppingsAdded ) {
    		bill += "Extra topings added:" + extraTppingsAdded+ "\n";
    		
    }
    	
    	if( isOptedForTakeAway ) {
    		bill += "opted take away added:" + backPackPrice+ "\n";
    		
    	}
    	
    	bill += "Bill: "+this.price +"\n";
    	
    	System.out.println(bill);
    
    
    
    
    }
    
   // public void getPizzaPrice() {
    //	System.out.println(this.price);
    }

