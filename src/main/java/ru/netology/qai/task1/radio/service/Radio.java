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

    public void setCurrentStation(int newCurrentStation) {
        SetCurrentValue newStation = new SetCurrentValue();
        currentStation = newStation.setCurrentValue(newCurrentStation, currentStation, maxStation, minStation);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        SetCurrentValue newVolume = new SetCurrentValue();
        currentVolume = newVolume.setCurrentValue(newCurrentVolume, currentVolume, maxVolume, minVolume);
    }

    public void setLowerStation() {
        LowerValue next = new LowerValue();
        currentStation = next.setLowerValue(currentStation, maxStation, minStation);
    }

    public void setLowerVolume() {
        LowerValue prev = new LowerValue();
        currentVolume = prev.setLowerValue(currentVolume, maxVolume, minVolume);
    }

    public void setIncreaseStation() {
        IncreaseValue next = new IncreaseValue();
        currentStation = next.setIncreaseValue(currentStation, maxStation, minStation);
    }

    public void setIncreaseVolume() {
        IncreaseValue next = new IncreaseValue();
        currentVolume = next.setIncreaseValue(currentVolume, maxVolume, minVolume);
    }
}
