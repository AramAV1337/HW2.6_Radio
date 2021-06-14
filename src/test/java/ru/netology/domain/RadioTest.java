package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setStationTest() {
        Radio radioService = new Radio();
        int expected = 7;
        int actual = radioService.setStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest() {
        Radio radioService = new Radio();
        int expected = 5;
        int actual = radioService.setVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationReverseTest() {
        Radio radioService = new Radio();
        int expected = 7;
        int actual = radioService.switchStationReverse();
        assertEquals(expected, actual);

    }

    @Test
    public void switchStationForwardTest() {
        Radio radioService = new Radio();
        int expected = 7;
        int actual = radioService.switchStationForward();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeIsMaxTest() {
        Radio radioService = new Radio();
        int expected = 5;
        int actual = radioService.volumeIsMax();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeIsLow() {
        Radio radioService = new Radio();
        int expected = 5;
        int actual = radioService.volumeIsLow();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLowerTest() {
        Radio radioService = new Radio();
        int expected = 4;
        int actual = radioService.setVolumeLower();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeHigherTest() {
        Radio radioService = new Radio();
        int expected = 6;
        int actual = radioService.setVolumeHigher();
        assertEquals(expected, actual);
    }


    @Test
    public void stationReverseTest() {
        Radio radioService = new Radio();
        int expected = 6;
        int actual = radioService.stationReverse();
        assertEquals(expected, actual);
    }

    @Test
    public void stationForwardTest() {
        Radio radioService = new Radio();
        int expected = 8;
        int actual = radioService.stationForward();
        assertEquals(expected, actual);
    }
}
