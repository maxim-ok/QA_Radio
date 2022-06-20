package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {
    Radio radio = new Radio();


    @Test
    void checkMinMaxRadioStation() {
        Radio radio = new Radio(0, 9);
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(9, radio.getMaxRadioStation());
    }


    @Test
    void stationValueInBoards1() {
        radio.setCurrentRadioStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void stationValueInBoards2() {
        radio.setCurrentRadioStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void stationValueIsHighBoard() {
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void stationValueIsLowBoard() {
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void stationValueIsAboveHighBoard() {
        radio.setCurrentRadioStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void stationValueIsBelowLowBoard() {
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void stationValueIsInBoards1() {
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(-3);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void stationValueIsInBoards2() {
        radio.setCurrentRadioStation(9);
        radio.setCurrentRadioStation(13);
        assertEquals(9, radio.getCurrentRadioStation());
    }


    @Test
    void increaseVolumeLeve() {
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeLeve() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void maxIncreaseVolumeLeve() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void minDecreaseVolumeLeve() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


}
