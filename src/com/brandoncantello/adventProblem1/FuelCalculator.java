package com.brandoncantello.adventProblem1;

import java.util.List;

public class FuelCalculator
{
    private final Data data = new Data();
    private int fuelRequired = 0;

    public int moduleFuelCalculator()
    {
        List moduleWeights = data.moduleWeights;

        for (Object moduleWeight : moduleWeights)
        {
            int tempFuel = ((int) moduleWeight / 3) - 2;
            int additionalFuel = 0;
            int tempAdditionalFuelMass = tempFuel;
            while (tempAdditionalFuelMass > 0)
            {
                int tempAdditionalFuel = (tempAdditionalFuelMass / 3) - 2;
                if (tempAdditionalFuel >= 0)
                {
                    additionalFuel += tempAdditionalFuel;
                    tempAdditionalFuelMass = tempAdditionalFuel;
                }
                else
                {
                    break;
                }
            }
            fuelRequired += (tempFuel + additionalFuel);
        }
        return fuelRequired;
    }
}
