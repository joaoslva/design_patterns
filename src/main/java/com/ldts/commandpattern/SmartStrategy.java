package com.ldts.commandpattern;

public class SmartStrategy implements OrderingStrategy{
    //Fields
    private boolean isHappyHour = false;
    //Constructors

    //Methods
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        while (!isHappyHour);
        recipe.mix(drink);
    }
    public void happyHourStarted(StringBar bar){
        if(bar.isHappyHour()) this.isHappyHour = true;
    }
    public void happyHourEnded(StringBar bar){
        if(!bar.isHappyHour()) this.isHappyHour = false;
    }
}
