package com.ldts.commandpattern;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    //Fields
    private List<BarObserver> observers;

    //Constructors
    public Bar() {
        this.observers = new ArrayList<>();
    }

    //Methods
    abstract public boolean isHappyHour();
    abstract public void startHappyHour();
    abstract public void endHappyHour();

    public void addObserver(BarObserver observer) {
        this.observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        this.observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
