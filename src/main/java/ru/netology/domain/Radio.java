package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

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

