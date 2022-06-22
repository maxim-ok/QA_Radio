package ru.netology.domain;

public class Radio {
    private int amountRadioStations = 10;

    private int currentVolume;
    private int currentRadioStation;

    public Radio() {
    }

    public Radio(int amountRadioStations) {
        this.amountRadioStations = amountRadioStations;

    }

    public void setRadioStation(int station) {
        if (station < 0 || station > amountRadioStations) {
            return;

        }
        if (station < amountRadioStations) {
            currentRadioStation = station;
        }

    }


    public void nextStation() {
        if (currentRadioStation < amountRadioStations - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = amountRadioStations - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > amountRadioStations - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void setAmountRadioStations(int amountRadioStations) {
        this.amountRadioStations = amountRadioStations;
    }

    public int getAmountRadioStations() {
        return amountRadioStations;
    }
}