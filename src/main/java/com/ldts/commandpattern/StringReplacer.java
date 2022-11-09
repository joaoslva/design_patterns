package com.ldts.commandpattern;

public class StringReplacer implements StringTransformer{
    //Fields
    private Character replace;
    private Character substitute;

    //Constructors
    public StringReplacer(Character replace, Character substitute){
        this.replace = replace;
        this.substitute = substitute;
    }
    //Methods
    public void execute(StringDrink stringDrink){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < stringDrink.getText().length(); i++){
            if(stringDrink.getText().charAt(i) == replace){
                stringBuilder.append(substitute);
            }
            else{
                stringBuilder.append(stringDrink.getText().charAt(i));
            }
        }
        stringDrink.setText(stringBuilder.toString());
    }
}
