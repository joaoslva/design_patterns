package com.ldts.commandpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrignCaseChangerText {
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        assertEquals("AbCd", drink.getText());
    }
}
