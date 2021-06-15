package ru.netology.domain;

public class Radio {
    private int currentStation = 7;
    private int currentVolume = 0;
    private int minStationNum = 0;
    private int maxStationNum = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    // Станции

    public int stationForward() {
        if (currentStation < maxStationNum) {
            ++currentStation;
        }
        return currentStation;
    }

    public int stationReverse() {
        if (currentStation != minStationNum)
            --currentStation;

        return currentStation;
    }

    public int switchStationForward() {
        if (currentStation == maxStationNum) {
            currentStation = minStationNum;
        }
        return currentStation;
    }

    public int switchStationReverse() {

        if (currentStation == minStationNum) {
            this.currentStation = maxStationNum;
        }
        return currentStation;
    }

    public int setStation(int currentStation) {
        this.currentStation = currentStation;
        return currentStation;
    }

    // Громкость

    public int setVolumeHigher() {
        if (currentVolume < maxVolume)
            ++currentVolume;

        return currentVolume;
    }

    public int setVolumeLower() {
        if (currentVolume != minVolume)
            --currentVolume;

        return currentVolume;
    }

    public int volumeIsMax() {
        if (currentVolume == maxVolume) {
        }
        return currentVolume;
    }

    public int volumeIsLow() {
        if (currentVolume == minVolume) {
        }
        return currentVolume;
    }

    public int setVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        return currentVolume;
    }
}
