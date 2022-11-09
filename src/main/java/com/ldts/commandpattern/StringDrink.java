package com.ldts.commandpattern;

public class StringDrink {
    //Fields
    private String string;
    //Constructors
    public StringDrink(String string){
        this.string = string;
    }
    //Methods
    public void setText(String string){
        this.string = string;
    }

    public String getText(){
        return this.string;
    }
}
