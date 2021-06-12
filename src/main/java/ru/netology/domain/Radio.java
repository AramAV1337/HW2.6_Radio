package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStationNum = 0;
    private int maxStationNum = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    // Станции

    public int stationForward(int currentStation) {
        if (currentStation < maxStationNum) {
            this.currentStation = currentStation++;
        }
        return currentStation;
    }

    public int stationReverse(int currentStation) {
        if (currentStation != minStationNum) {
            this.currentStation = currentStation--;
        }
        return currentStation;
    }

    public int switchStationForward(int currentStation) {
        if (currentStation == maxStationNum) {
            currentStation = minStationNum;
        }
        return currentStation;
    }

    public int switchStationReverse(int currentStation) {

        if (currentStation == minStationNum) {
            currentStation = maxStationNum;
        }
        return currentStation;
    }

    public int setStation(int currentStation) {

        this.currentStation = currentStation;

        return currentStation;
    }

    // Громкость

    public int setVolumeHigher(int currentVolume) {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume++;
        }
        return currentVolume;
    }

    public int setVolumeLower(int currentVolume) {
        if (currentVolume != minVolume) {
            this.currentVolume = currentVolume--;
        }
        return currentVolume;
    }

    public int volumeIsMax(int currentVolume) {
        if (currentVolume == maxVolume) {
        }
        return currentVolume;
    }

    public int volumeIsLow(int currentVolume) {
        if (currentVolume == minVolume) {
        }
        return currentVolume;
    }

    public int setVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        return currentVolume;
    }

}
