package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetNumberStationBelowTheMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetNumberStationAboveTheMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        assertEquals(1, radio.getCurrentStation());
    }
    @Test
    public void shouldSetNumberStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }
    @Test
    public void shouldSetNumberStationBelowTheMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    public void shouldSetNumberStationTheMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());

    }
    @Test
    public void shouldSetNumberStationAboveTheMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setCurrentNextStation();
        assertEquals(1, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentNextStation();
        assertEquals(6, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setCurrentNextStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStationAboveTheMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.setCurrentNextStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationBelowTheMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.setCurrentPrevStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentPrevStation();
        assertEquals(4, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setCurrentPrevStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentPrevStation();
        assertEquals(8, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolumeBelowTheMax() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolumeAboveTheMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeBelowTheMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeAboveTheMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeBelowTheMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }
}