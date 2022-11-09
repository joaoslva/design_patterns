package com.ldts.commandpattern;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    //Fields
    private List<StringTransformer> transformers;

    //Constructors
    public StringTransformerGroup(List<StringTransformer> transformers){
        this.transformers = transformers;
    }
    //Methods
    public void execute(StringDrink stringDrink){
        for(StringTransformer s: transformers){
            s.execute(stringDrink);
        }
    }
}
