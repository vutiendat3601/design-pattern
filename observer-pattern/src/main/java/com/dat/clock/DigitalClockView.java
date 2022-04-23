package com.dat.clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;
import java.util.Observer;

public class DigitalClockView implements Observer, ClockView {
    private LocalDateTime now;
    private Observable digitalClock;

    public DigitalClockView(Observable digitalClock) {
        this.digitalClock = digitalClock;
        digitalClock.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DigitalClock) {
            now = ((DigitalClock) digitalClock).getNow();
        }
        show();
    }

    @Override
    public void show() {
        System.out.println("Bay gio la " + now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
    }
}
