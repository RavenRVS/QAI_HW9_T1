package ru.netology.qai.task1.radio.service;

public class LowerValue {
    int setLowerValue(int currentValue, int maxValue, int minValue) {
        if (currentValue > minValue) {
            currentValue = currentValue - 1;
        }
        if (currentValue == minValue) {
            currentValue = maxValue;
        }
        return currentValue;
    }
}
