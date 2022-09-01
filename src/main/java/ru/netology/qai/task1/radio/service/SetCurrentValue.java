package ru.netology.qai.task1.radio.service;

public class SetCurrentValue {
    int setCurrentValue(int newCurrentValue, int currentValue, int maxValue, int minValue) {
        if (newCurrentValue < minValue) {
            return currentValue;
        }

        if (newCurrentValue > maxValue) {
            return currentValue;
        }
        return newCurrentValue;
    }
}
