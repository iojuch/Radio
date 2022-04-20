package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetNextStationMin() {
        Radio radio = new Radio(0, 5, 10, true);
        radio.setCurrentNextStation();
        assertEquals(1, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio(5, 5, 10, true);
        radio.setCurrentNextStation();
        assertEquals(6, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStationMax() {
        Radio radio = new Radio(8, 5, 10, true);
        radio.setCurrentNextStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStationAboveTheMax() {
        Radio radio = new Radio(9, 5, 10, true);
        radio.setCurrentNextStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationBelowTheMin() {
        Radio radio = new Radio(0, 5, 10, true);
        radio.setCurrentPrevStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio(5, 5, 10, true);
        radio.setCurrentPrevStation();
        assertEquals(4, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationMin() {
        Radio radio = new Radio(1, 5, 10, true);
        radio.setCurrentPrevStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationMax() {
        Radio radio = new Radio(9, 5, 10, true);
        radio.setCurrentPrevStation();
        assertEquals(8, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextVolumeMin() {
        Radio radio = new Radio(5, 0, 10, true);
        radio.IncreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }


    @Test
    public void shouldSetNextVolumeMax() {
        Radio radio = new Radio(9, 100, 10, true);
        radio.IncreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
        @Test
        public void shouldSetNextVolumeBelowTheMax() {
            Radio radio = new Radio(5, 99, 10, true);
            radio.IncreaseVolume();
            assertEquals(100, radio.getCurrentVolume());
        }

    @Test
    public void shouldSetNextVolumeAboveTheMax() {
        Radio radio = new Radio(5, 101, 10, true);
        radio.IncreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetPrevVolumeBelowTheMin() {
        Radio radio = new Radio(5, -1, 10, true);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMin() {
        Radio radio = new Radio(5, 0, 10, true);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeAboveTheMin() {
        Radio radio = new Radio(5, 1, 10, true);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolume() {
        Radio radio = new Radio(5, 50, 10, true);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMax() {
        Radio radio = new Radio(5, 99, 10, true);
        radio.decreaseVolume();
        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeAboveTheMax() {
        Radio radio = new Radio(5, 100, 10, true);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }
}