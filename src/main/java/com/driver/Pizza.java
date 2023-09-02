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
        if (isVeg) {
            price = 300;
        }else{
            price=400;
        }
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (IsBillGen==false) {
            if (!isExtraCheese) {
                price += 80;
                isExtraCheese = true;
            }
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if(!IsBillGen) {
            if (!isExtraTopping) {
                if (isVeg) {
                    price += 70;
                } else {
                    price += 120;
                }
                isExtraTopping = true;
            }
        }

    }

    public void addTakeaway() {
        if(!IsBillGen) {
            // your code goes here
            if (!BagOrdered) {
                price += 20;
                BagOrdered = true;
            }
        }
    }

    public String getBill() {
        // your code goes here
         if(IsBillGen)return bill;
                // first check for veg or not
         if(isVeg)bill="Base Price Of The Pizza: 300\n";
         else {bill="Base Price Of The Pizza: 400\n";}
               if (isExtraCheese) {
                   bill+="Extra Cheese Added: 80\n";
               }
               if (isExtraTopping) {
                   if (isVeg) {
                    bill+="Extra Toppings Added: 70\n";
                   } else {
                       bill+="Extra Toppings Added: 120\n";
                   }
               }
               if (BagOrdered) {
                   bill+="Paperbag Added: 20\n";
               }
               IsBillGen = true;
//           }
               return bill+= "Total Price: " + price +"\n";

    }

}

