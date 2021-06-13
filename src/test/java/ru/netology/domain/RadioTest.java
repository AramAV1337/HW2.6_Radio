package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setStationTest() {
        Radio radioService = new Radio();
        int currentStation = 7;
        radioService.setStation(currentStation);
        int expected = 7;
        int actual = radioService.setStation(currentStation);
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest() {
        Radio radioService = new Radio();
        int currentVolume = 7;
        int expected = 7;
        int actual = radioService.setVolume(currentVolume);
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationReverseTest() {
        Radio radioService = new Radio();
        int currentStation = 5;
        radioService.switchStationReverse(currentStation);
        int expected = 5;
        int actual = radioService.switchStationReverse(currentStation);
        assertEquals(expected, actual);

    }

    @Test
    public void switchStationForwardTest() {
        Radio radioService = new Radio();
        int currentStation = 5;
        radioService.switchStationForward(currentStation);
        int expected = 5;
        int actual = radioService.switchStationForward(currentStation);
        assertEquals(expected, actual);
    }

    @Test
    public void volumeIsMaxTest() {
        Radio radioService = new Radio();
        int currentVolume = 9;
        radioService.volumeIsMax(currentVolume);
        int expected = 9;
        int actual = radioService.volumeIsMax(currentVolume);
        assertEquals(expected, actual);
    }

    @Test
    public void volumeIsLow() {
        Radio radioService = new Radio();
        int currentVolume = 9;
        radioService.volumeIsLow(currentVolume);
        int expected = 9;
        int actual = radioService.volumeIsLow(currentVolume);
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLowerTest() {
        Radio radioService = new Radio();
        int currentVolume = 6;
        radioService.setVolumeLower(currentVolume);
        int expected = 5;
        int actual = radioService.setVolumeLower(currentVolume);
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeHigherTest() {
        Radio radioService = new Radio();
        int currentVolume = 7;
        radioService.setVolumeHigher(currentVolume);
        int expected = 8;
        int actual = radioService.setVolumeHigher(currentVolume);
        assertEquals(expected, actual);
    }


    @Test
    public void stationReverseTest() {
        Radio radioService = new Radio();
        int currentStation = 7;
        radioService.stationReverse(currentStation);
        int expected = 6;
        int actual = radioService.stationReverse(currentStation);
        assertEquals(expected, actual);
    }

    @Test
    public void stationForwardTest() {
        Radio radioService = new Radio();
        int currentStation = 6;
        radioService.stationForward(currentStation);
        int expected = 7;
        int actual = radioService.stationForward(currentStation);
        assertEquals(expected, actual);
    }
}
