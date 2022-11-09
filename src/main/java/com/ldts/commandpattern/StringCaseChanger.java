package com.ldts.commandpattern;

public class StringCaseChanger implements StringTransformer{
    //Fields

    //Constructors

    //Methods
    public void execute(StringDrink stringDrink){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < stringDrink.getText().length(); i++){
            if(Character.isLowerCase(stringDrink.getText().charAt(i))){
                stringBuilder.append(Character.toUpperCase((stringDrink.getText().charAt(i))));
            }
            else{
                stringBuilder.append(Character.toLowerCase((stringDrink.getText().charAt(i))));
            }
        }
        stringDrink.setText(stringBuilder.toString());
    }
}
