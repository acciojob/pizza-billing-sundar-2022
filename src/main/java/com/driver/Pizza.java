package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
     boolean isToppingsAdded;
     boolean isCheeseAdded;
     boolean isTakeAwayAdded;
     boolean billgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isToppingsAdded = false;
        isTakeAwayAdded = false;
        isCheeseAdded = false;
        billgenerated = false;
        this.bill="";
        if(isVeg){
            price+=300;
            toppings = 70;
        }else{
            price+=400;
            toppings = 120;
        }
        cheese = 80;
        System.out.println("Base Price Of The Pizza: "+this.price);
    }

    public int getPrice(){

        return this.price;
    }
    public void addExtraCheese(){
       if(!isCheeseAdded){
           price+=cheese;
           isCheeseAdded = true;
       }
    }
    public void addExtraToppings(){
        if(!isToppingsAdded){
            price+=toppings;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
      if(!isTakeAwayAdded){
          price+=20;
          isTakeAwayAdded = true;
      }
    }

    public String getBill(){
        if(!billgenerated){
            if(isCheeseAdded)
                this.bill+= "Extra Cheese Added: "+this.cheese+"\n";
            if(isToppingsAdded)
                this.bill+= "Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAwayAdded)
                this.bill+= "Paperbag Added: 20"+"\n";

            this.bill+= "Total Price: "+this.price+"\n";
            billgenerated = true;
        }
        return this.bill;
    }
}
