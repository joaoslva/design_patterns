package com.ldts.commandpattern;

public class StringInverter implements StringTransformer{
    //Fields

    //Constructors

    //Methods
    public void execute(StringDrink stringDrink){
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder(stringDrink.getText());
        stringBuilder.reverse();
        stringDrink.setText(stringBuilder.toString());
    }
}
