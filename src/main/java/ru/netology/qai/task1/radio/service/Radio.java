package ru.netology.qai.task1.radio.service;

public class Radio {
    int currentStation;
    int maxStation = 9;
    int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentValue(int newCurrentValue, int currentValue, int maxValue, int minValue) {
        if (newCurrentValue < minValue) {
            return currentValue;
        }

        if (newCurrentValue > maxValue) {
            return currentValue;
        }
        return newCurrentValue;
    }

    public int setLowerValue(int currentValue, int maxValue, int minValue) {
        if (currentValue > minValue) {
            currentValue = currentValue - 1;
        }
        if (currentValue == minValue) {
            currentValue = maxValue;
        }
        return currentValue;
    }

    public int setIncreaseValue(int currentValue, int maxValue, int minValue) {
        if (currentValue < maxValue) {
            currentValue = currentValue + 1;
        }
        if (currentValue == maxValue) {
            currentValue = minValue;
        }
        return currentValue;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = setCurrentValue(newCurrentStation, currentStation, maxStation, minStation);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = setCurrentValue(newCurrentVolume, currentVolume, maxVolume, minVolume);
    }

    public void setLowerStation() {
        currentStation = setLowerValue(currentStation, maxStation, minStation);
    }

    public void setLowerVolume() {
        currentVolume = setLowerValue(currentVolume, maxVolume, minVolume);
    }

    public void setIncreaseStation() {
        currentStation = setIncreaseValue(currentStation, maxStation, minStation);
    }

    public void setIncreaseVolume() {
        currentVolume = setIncreaseValue(currentVolume, maxVolume, minVolume);
    }
}
