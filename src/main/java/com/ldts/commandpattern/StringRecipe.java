package com.ldts.commandpattern;

import java.io.StringBufferInputStream;
import java.util.List;

public class StringRecipe {
    //Fields
    private List<StringTransformer> transformers;
    //Constructors
    public StringRecipe(List<StringTransformer> transformers){
        this.transformers = transformers;
    }
    //Methods
    public void mix(StringDrink stringDrink){
        for(StringTransformer s: transformers){
            s.execute(stringDrink);
        }
    }
}
