package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void setCurrentPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation -= 1;
        }
    }

    public void setCurrentStationNumber(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }

        if (newCurrentStation < 0) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void IncreaseVolume() {
        if (currentVolume < 10) {
            setCurrentVolume(currentVolume + 1);
        }


    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

}
