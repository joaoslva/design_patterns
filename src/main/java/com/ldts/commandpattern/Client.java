package com.ldts.commandpattern;

public interface Client extends BarObserver{
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
