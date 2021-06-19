package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void radioSetStationByUser() {
        Radio radioService = new Radio(7, 0);
        int expected = 7;
        int actual = radioService.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void radioSetStationByDefault() {
        Radio radioService = new Radio();
        int expected = 10;
        int actual = radioService.getCurrentStation();
        assertEquals(expected, actual);

    }
    @Test
    public void radioSetVolumeByUserTest() {
        Radio radioService = new Radio(0,90);
        int expected = 90;
        int actual = radioService.getCurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    public void setStationTest() {
        Radio radioService = new Radio();
        radioService.setStation(10);
        int expected = 10;
        int actual = radioService.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest() {
        Radio radioService = new Radio();
        radioService.setVolume(11);
        int expected = 11;
        int actual = radioService.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationReverseTestTrue() {
        Radio radioService = new Radio();
        radioService.setStation(0);
        int expected = 10;
        int actual = radioService.switchStationReverse();
        assertEquals(expected, actual);
    }
    @Test
    public void switchStationReverseTestFalse() {
        Radio radioService = new Radio();
        radioService.setStation(6);
        int expected = radioService.switchStationReverse();
        int actual = radioService.switchStationReverse();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationForwardTestTrue() {
        Radio radioService = new Radio();
        radioService.setStation(9);
        int expected = radioService.switchStationForward();
        int actual = radioService.switchStationForward();
        assertEquals(expected, actual);
    }
    @Test
    public void switchStationForwardTestFalse() {
        Radio radioService = new Radio();
        radioService.setStation(6);
        int expected = 7;
        int actual = radioService.stationForward();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeIsMaxTestTrue() {
        Radio radioService = new Radio();
        radioService.setVolume(10);
        int expected = 10;
        int actual = radioService.volumeIsMax();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeIsMaxTestFalse() {
        Radio radioService = new Radio();
        radioService.setVolume(7);
        int expected = radioService.setVolumeHigher();
        int actual = radioService.volumeIsMax();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeIsLowTestTrue() {
        Radio radioService = new Radio();
        radioService.setVolume(0);
        int expected = 0;
        int actual = radioService.volumeIsLow();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeIsLowTestFalse() {
        Radio radioService = new Radio();
        radioService.setVolume(5);
        int expected = radioService.setVolumeLower();
        int actual = radioService.volumeIsLow();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLowerTest() {
        Radio radioService = new Radio();
        int expected = 0;
        int actual = radioService.setVolumeLower();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeHigherTestTrue() {
        Radio radioService = new Radio();
        radioService.setVolume(8);
        int expected = 9;
        int actual = radioService.setVolumeHigher();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeHigherTestFalse() {
        Radio radioService = new Radio();
        radioService.setVolume(11);
        int expected = 12;
        int actual = radioService.setVolumeHigher();
        assertEquals(expected, actual);
    }


    @Test
    public void stationReverseTestTrue() {
        Radio radioService = new Radio();
        radioService.setStation(7);
        int expected = 6;
        int actual = radioService.stationReverse();
        assertEquals(expected, actual);
    }
    @Test
    public void stationReverseTestFalse() {
        Radio radioService = new Radio();
        radioService.setStation(0);
        int expected = 0;
        int actual = radioService.stationReverse();
        assertEquals(expected, actual);
    }


    @Test
    public void stationForwardTestTrue() {
        Radio radioService = new Radio();
        radioService.setStation(7);
        int expected = 8;
        int actual = radioService.stationForward();
        assertEquals(expected, actual);
    }
    @Test
    public void stationForwardTestFalse() {
        Radio radioService = new Radio();
        radioService.setStation(9);
        int expected = 10;
        int actual = radioService.stationForward();
        assertEquals(expected, actual);
    }


}
