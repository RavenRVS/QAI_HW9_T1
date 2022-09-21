package ru.netology.qai.task1.radio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStationTest {

    @Test
    public void shouldCreateRadioDefault() {
        Radio radio = new Radio();

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreateRadioNotDefault() {
        Radio radio = new Radio(30);

        int expected = 29;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUpperMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLowerMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setIncreaseStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextUpperDefaultMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setIncreaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextUpperNotDefaultMaxStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);

        radio.setIncreaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setLowerStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLowerMinStationDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setLowerStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLowerMinStationNotDefault() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);

        radio.setLowerStation();

        int expected = 29;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
