package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = calculateMaxStation();
    private int minVolume = 0;
    private int maxVolume = 100;
    private boolean on;

    private int calculateMaxStation() {
        return (amountStation - 1);
    }

    public Radio() {
    }

    public Radio(int currentStation, int currentVolume, int amountStation, boolean on) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.amountStation = amountStation;
        this.maxStation = amountStation - 1;
        this.maxVolume = maxVolume;
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentNextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void setCurrentPrevStation() {
        if (currentStation == minStation) {
            currentStation = 9;
        } else {
            currentStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        } else {
            currentVolume = maxVolume;
        }


    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        } else {
            currentVolume = minVolume;
        }
    }

}
