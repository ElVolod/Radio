package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int amountOfStations;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        this.amountOfStations = 10;
    }
    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
    
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume -1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation >= amountOfStations) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == amountOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }
    public void prevStation() {
        if (currentStation == 0) {
            currentStation = amountOfStations -1;
        } else {
            currentStation = currentStation - 1;
        }
    }
}
