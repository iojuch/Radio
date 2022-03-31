package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetNumberStationBelowTheMin() {
        radio.setCurrentStationNumber(-1);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStationMin() {
        radio.setCurrentStationNumber(0);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStationAboveTheMin() {
        radio.setCurrentStationNumber(1);
        assertEquals(1, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStation() {
        radio.setCurrentStationNumber(5);
        assertEquals(5, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStationBelowTheMax() {
        radio.setCurrentStationNumber(8);
        assertEquals(8, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStationMax() {
        radio.setCurrentStationNumber(9);
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStationAboveTheMax() {
        radio.setCurrentStationNumber(10);
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStationMin() {
        radio.setCurrentStationNumber(0);
        radio.setCurrentNextStation();
        assertEquals(1, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStation() {
        radio.setCurrentStationNumber(8);
        radio.setCurrentNextStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStationMax() {
        radio.setCurrentStationNumber(9);
        radio.setCurrentNextStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStationAboveTheMax() {
        radio.setCurrentStationNumber(10);
        radio.setCurrentNextStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationBelowTheMin() {
        radio.setCurrentStationNumber(-1);
        radio.setCurrentPrevStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStation() {
        radio.setCurrentStationNumber(1);
        radio.setCurrentPrevStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationMin() {
        radio.setCurrentStationNumber(0);
        radio.setCurrentPrevStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationMax() {
        radio.setCurrentStationNumber(9);
        radio.setCurrentPrevStation();
        assertEquals(8, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextVolumeMin() {
        radio.setCurrentVolume(0);
        radio.IncreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolume() {
        radio.setCurrentVolume(9);
        radio.IncreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolumeMax() {
        radio.setCurrentVolume(10);
        radio.IncreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeBelowTheMin() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolume() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMax() {
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeAboveTheMax() {
        radio.setCurrentVolume(11);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }
}