package com.ldts.commandpattern;

import java.util.List;



public class StringBar extends Bar{
    //Fields
    private boolean isHappyHour = false;
    //Constructors
    public StringBar(){
        super();
    }
    //Methods
    public boolean isHappyHour(){
        return this.isHappyHour;
    }
    public void startHappyHour(){
        this.isHappyHour = true;
        this.notifyObservers();
    }
    public void endHappyHour(){
        this.isHappyHour = false;
        this.notifyObservers();
    }

    public void order(StringDrink stringDrink, StringRecipe stringRecipe) {
        stringRecipe.mix(stringDrink);
    }
}
