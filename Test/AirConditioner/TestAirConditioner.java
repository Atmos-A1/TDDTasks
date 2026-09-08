package AirConditioner;
import AirConditoner.AirConditioner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAirConditioner {

    private AirConditioner myAirConditioner;

    @BeforeEach
    public void setup() {
        myAirConditioner = new AirConditioner();
    }

    @Test

    public void IHaveAnAC_ItIsOff_TurnOnTheAirConditioner_ItIsOn() {
        assertFalse(myAirConditioner.checkState());
        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkState());
    }

    @Test

    public void IHaveAnAC_ItIsOn_TurnOffTheAirConditioner_ItIsOff() {
        assertFalse(myAirConditioner.checkState());
        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkState());
        myAirConditioner.turnOff();
        assertFalse(myAirConditioner.checkState());
    }

    @Test

    public void IHaveAnAC_ItIsOff_I_TurnItOn_ItIsOn_I_IncreaseTheTemperature_TheTemperatureIncreases(){
        assertFalse(myAirConditioner.checkState());
        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkState());
        assertEquals(16, myAirConditioner.checkTemperature());
        myAirConditioner.increaseTemperature();
        assertEquals(17, myAirConditioner.checkTemperature());
    }

    @Test

    public void IHaveAnAC_ItIsOff_I_TurnItOn_ItIsOn_I_IncreaseTheTemperature_TheTemperatureIncreases_IDecreaseTheTemperature_TheTemperatureDecreases(){
        assertFalse(myAirConditioner.checkState());
        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkState());
        assertEquals(16, myAirConditioner.checkTemperature());
        myAirConditioner.increaseTemperature();
        assertEquals(17, myAirConditioner.checkTemperature());
        myAirConditioner.decreaseTemperature();
        assertEquals(16, myAirConditioner.checkTemperature());

    }

    @Test

    public void IHaveAnAC_ItIsOff_ITurnItOn_TheTemperatureIs16_IIncreaseTheTemperatureTo30_TheTemperatureIncreasesTo30_I_IncreaseTheTemperatureBeyond30_ItRemains30(){
        assertFalse(myAirConditioner.checkState());
        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkState());
        assertEquals(16, myAirConditioner.checkTemperature());

        for(int Increment = 1;  Increment<= 14; Increment++){
            myAirConditioner.increaseTemperature();
        }

        assertEquals(30, myAirConditioner.checkTemperature());
        myAirConditioner.increaseTemperature();
        assertEquals(30, myAirConditioner.checkTemperature());
    }

    @Test

    public void IHaveAnAC_ItIsOff_ITurnItOn_TheTemperatureIs16_IDecreaseTheTemperatureBelow16_TheTemperatureIs16(){
        assertFalse(myAirConditioner.checkState());
        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.checkState());
        assertEquals(16, myAirConditioner.checkTemperature());
        myAirConditioner.decreaseTemperature();
        assertEquals(16, myAirConditioner.checkTemperature());
    }



}
