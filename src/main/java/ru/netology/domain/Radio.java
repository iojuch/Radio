package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int amountStation = 10;
    private int maxStation = amountStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;
    private boolean on;


    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
      maxStation = amountStation - 1;
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

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation ) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }


    public void setCurrentNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation += 1;
        }
    }

    public void setCurrentPrevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
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
