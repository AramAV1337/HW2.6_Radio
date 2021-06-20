package ru.netology.domain;

public class Radio {
    private int currentStation = 10;
    private int currentVolume = 0;
    private int minStationNum = 0;
    private int maxStationNum = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int currentStation, int currentVolume, int minStationNum, int maxStationNum, int minVolume, int maxVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.minStationNum = minStationNum;
        this.maxStationNum = maxStationNum;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }


    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }


    public Radio() {

    }

}
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

    public void setStation(int currentStation) {
       if (currentStation > maxStationNum) {
           return;
       }
       this.currentStation = currentStation;
    }

    public int getCurrentStation(){
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

    public void setVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
}
