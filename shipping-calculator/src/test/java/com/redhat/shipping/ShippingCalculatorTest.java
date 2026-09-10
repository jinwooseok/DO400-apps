package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    // @todo: add tests
    @Test
    public void onNARegionTheCostIs100() throws RegionNotFoundException {
        // Given
        ShippingCalculator calculator = new ShippingCalculator();

        // When
        int cost = calculator.costForRegion("NA");

        // Then
        assertEquals(100, cost);
    }

    @Test
    public void onLATAMRegionTheCostIs200() throws RegionNotFoundException {
        // Given
        ShippingCalculator calculator = new ShippingCalculator();

        // When
        int cost = calculator.costForRegion("LATAM");

        // Then
        assertEquals(200, cost);
    }

    @Test
    public void onEMEARegionTheCostIs300() throws RegionNotFoundException {
        // Given
        ShippingCalculator calculator = new ShippingCalculator();

        // When
        int cost = calculator.costForRegion("EMEA");

        // Then
        assertEquals(300, cost);
    }

    @Test
    public void onAPACRegionTheCostIs400() throws RegionNotFoundException{
        // Given
        ShippingCalculator calculator = new ShippingCalculator();

        // When
        int cost = calculator.costForRegion("APAC");

        // Then
        assertEquals(400, cost);
    }

    @Test
    public void onNonSupportedRegionARegionNotFoundExceptionIsRaised() throws RegionNotFoundException{
        ShippingCalculator calculator = new ShippingCalculator();
        assertThrows(
            RegionNotFoundException.class,
            () -> calculator.costForRegion("Unknown Region")
        );
    }
}