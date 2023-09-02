package com.driver;

public class  Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected Boolean isExtraCheese = false;
    protected Boolean isExtraTopping = false;

    protected Boolean BagOrdered = false;
    protected Boolean IsBillGen = false;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) price = 300;
        else price = 400;

    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!isExtraCheese) {
            price += 80;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!isExtraTopping) {
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
            isExtraTopping = true;
        }

    }

    public void addTakeaway() {
        // your code goes here
        if (!BagOrdered) {
            price += 20;
            BagOrdered = true;
        }
    }

    public String getBill() {
        // your code goes here
                // first check for veg or not
           if(!IsBillGen) {
               if (isVeg) {
                   System.out.println("Base Price Of The Pizza: 300");
               } else {
                   System.out.println("Base Price Of The Pizza: 400");
               }
               if (isExtraCheese) {
                   System.out.println("Extra Cheese Added: 80");
               }
               if (isExtraTopping) {
                   if (isVeg) {
                       System.out.println("Extra Toppings Added: 70");
                   } else {
                       System.out.println("Extra Toppings Added: 120");
                   }
               }
               if (BagOrdered) {
                   System.out.println("Paperbag Added: 20");
               }
               IsBillGen = true;
           }
               return bill = "Total Price: " + price;

    }

}

