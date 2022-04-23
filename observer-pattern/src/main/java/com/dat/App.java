package com.dat;

import java.time.LocalDate;

import com.dat.client.Observer;
import com.dat.clock.DigitalClock;
import com.dat.clock.DigitalClockView;
import com.dat.host.WeatherData;
import com.dat.view.CurrentConditionsDisplay;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        for (int i = 0; i <= 5; i++) {
            weatherData.setMeasurement(30 + i, 31 + i, 50 + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        DigitalClock digitalClock = new DigitalClock();
        DigitalClockView digitalClockView = new DigitalClockView(digitalClock);
        while (true) {
            digitalClock.ticTac();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
