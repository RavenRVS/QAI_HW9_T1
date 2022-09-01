package ru.netology.qai.task1.radio.service;

public class IncreaseValue {
    int setIncreaseValue(int currentValue, int maxValue, int minValue) {
        if (currentValue < maxValue) {
            currentValue = currentValue + 1;
        }
        if (currentValue == maxValue) {
            currentValue = minValue;
        }
        return currentValue;
    }
}
