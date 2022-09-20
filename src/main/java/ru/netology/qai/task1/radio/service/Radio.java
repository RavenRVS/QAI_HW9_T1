package ru.netology.qai.task1.radio.service;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
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
            currentVolume = maxVolume;
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
            currentVolume = minVolume;
        }
    }
}
