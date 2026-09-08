package BikeSpeed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBikeSpeedLevels {

    private BikeSpeedLevels motorcycle;

    @BeforeEach

    public void setUp() {
        motorcycle = new BikeSpeedLevels();
    }

    @Test

    public void IHaveABike_ItIsOff_TurnOnTheBike_TheBikeComesOn() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
    }

    @Test

    public void IHaveABike_ItIsOn_TurnOffTheBike_TheBikeGoesOff() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        motorcycle.turnOff();
        assertFalse(motorcycle.checkstate());
    }

    @Test

    public void IHaveBike_ItIsOff_ITurnOnTheBike_TheBikeComesOn_IAccelerateAndTheBikeSpeedIncreasesBy1() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        assertEquals(0, motorcycle.checkSpeed());
        motorcycle.putIntoGear1AndIncreaseSpeed();
        assertEquals(1, motorcycle.checkSpeed());
    }

    @Test

    public void IHaveBike_ItIsOff_ITurnOnTheBike_TheBikeComesOn_IAccelerateAndTheBikeSpeedIncreasesBy1_IDecreaseTheSpeedBy1_TheSpeedDecreasesBy1() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        assertEquals(0, motorcycle.checkSpeed());
        motorcycle.putIntoGear1AndIncreaseSpeed();
        assertEquals(1, motorcycle.checkSpeed());
        motorcycle.putIntoGear1AndDecreaseSpeed();
        assertEquals(0, motorcycle.checkSpeed());
    }

    @Test

    public void IHaveABike_ItIsOff_ITurnOnTheBike_TheBikeComesOn_IAccelerateAndTheBikeSpeedIncreasesBy2() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        assertEquals(0, motorcycle.checkSpeed());
        motorcycle.putIntoGear2AndIncreaseSpeed();
        assertEquals(2, motorcycle.checkSpeed());

    }

    @Test

    public void IHaveABike_ItIsOff_ITurnOnTheBike_TheBikeComesOn_IAccelerateAndTheBikeSpeedIncreasesBy2_WhenIDecelerateTheSpeedReducesBy2() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        assertEquals(0, motorcycle.checkSpeed());
        motorcycle.putIntoGear2AndIncreaseSpeed();
        assertEquals(2, motorcycle.checkSpeed());
        motorcycle.putIntoGear2AndReduceSpeed();
        assertEquals(0, motorcycle.checkSpeed());
    }

    @Test

    public void IHaveABike_ItIsOff_ITurnOnTheBike_THeBikeComesOn_IAccelerateAndTheBikeSpeedIncreasesBy3() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        assertEquals(0, motorcycle.checkSpeed());
        motorcycle.putIntoGear3AndIncreaseSpeed();
        assertEquals(3, motorcycle.checkSpeed());
    }

    @Test

    public void IHaveABike_ItIsOff_ITurnOnTheBike_THeBikeComesOn_IAccelerateAndTheBikeSpeedIncreasesBy3_IDecelerateAndItReducesBy3() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        assertEquals(0, motorcycle.checkSpeed());
        motorcycle.putIntoGear3AndIncreaseSpeed();
        assertEquals(3, motorcycle.checkSpeed());
        motorcycle.putIntoGear3AndReduceSpeed();
        assertEquals(0, motorcycle.checkSpeed());

    }

    @Test

    public void IHaveABike_ItIsOff_ITurnOnTheBike_THeBikeComesOn_IAccelerateAndTheBikeSpeedIncreasesBy4() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        assertEquals(0, motorcycle.checkSpeed());
        motorcycle.putIntoGear4AndIncreaseSpeed();
        assertEquals(4, motorcycle.checkSpeed());

    }

    @Test

    public void IHaveABike_ItIsOff_ITurnOnTheBike_THeBikeComesOn_IAccelerateAndTheBikeSpeedIncreasesBy4_IDecelerateAndBikeSpeedReducesBy4() {
        assertFalse(motorcycle.checkstate());
        motorcycle.turnOn();
        assertTrue(motorcycle.checkstate());
        assertEquals(0, motorcycle.checkSpeed());
        motorcycle.putIntoGear4AndIncreaseSpeed();
        assertEquals(4, motorcycle.checkSpeed());
        motorcycle.putIntoGear4AndReduceSpeed();
        assertEquals(0, motorcycle.checkSpeed());
    }

}