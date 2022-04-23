package com.dat.clock;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Observable;

public class DigitalClock extends Observable{
    private LocalDateTime now;
    
    @Override
    public void notifyObservers(Object arg) {
        // TODO Auto-generated method stub
        super.notifyObservers(arg);
    }

    public void ticTac() {
        now = LocalDateTime.now();
        setChanged();
        notifyObservers();
    }
    
    public LocalDateTime getNow() {
        return now;
    }
}
