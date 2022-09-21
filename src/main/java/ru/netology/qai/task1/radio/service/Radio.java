package ru.netology.qai.task1.radio.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int minStation = 0;
    private int countStation = 10;
    private int maxStation = minStation + countStation - 1;
    private int currentStation = minStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int countStation) {
        this.countStation = countStation;
        this.maxStation = minStation + countStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }

        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }

        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setLowerStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
    }

    public void setLowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            return;
        }
    }

    public void setIncreaseStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
    }

    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            return;
        }
    }
}