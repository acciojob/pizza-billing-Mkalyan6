package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        // when ever the customer selects deluxe pizza, then by default  ho selected cheese and toppings
        addExtraCheese();
        addExtraToppings();
    }
}
