import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetInitialVolume() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

      @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationFromMaxToMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationFromMinToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldGetInitialStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldGetStationAfterSetting() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldSetDefaultAmountOfStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());

        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCustomAmountOfStations() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);
        Assertions.assertEquals(29, radio.getCurrentStation());

        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationFromZero() {
        Radio radio = new Radio(10);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

}