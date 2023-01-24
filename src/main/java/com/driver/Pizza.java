package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int Cheese;
    private int toppings;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill="";
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isTakeAwayAdded=false;
        this.isBillGenerated=false;
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.Cheese=80;
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            price+=Cheese;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            price+=toppings;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            price+=20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            if(isExtraCheeseAdded)
                this.bill+="Extra Cheese Added: "+this.Cheese+"\n";
            if(isExtraToppingsAdded)
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAwayAdded){
                this.bill+="Paperbag Added: "+"20"+"\n";
            }
            this.bill+="Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}