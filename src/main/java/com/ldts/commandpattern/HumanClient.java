package com.ldts.commandpattern;

public class HumanClient implements Client{
    //Fields
    private boolean isDrinkingTime = false;
    private OrderingStrategy orderingStrategy;
    //Constructors
    public HumanClient(OrderingStrategy orderingStrategy){
        this.orderingStrategy = orderingStrategy;
    }
    //Methods
    @Override
    public void happyHourEnded(Bar bar) {
        this.isDrinkingTime = false;

    }

    @Override
    public void happyHourStarted(Bar bar) {
        this.isDrinkingTime = true;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        orderingStrategy.wants(drink, recipe, bar);
    }
}
