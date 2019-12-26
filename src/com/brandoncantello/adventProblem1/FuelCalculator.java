package com.brandoncantello.adventProblem1;

import java.util.List;

public class FuelCalculator
{
    private final ModuleData moduleData = new ModuleData();
    private int fuelRequired = 0;

    public int moduleFuelCalculator()
    {
        List moduleWeights = moduleData.moduleWeights;

        for (Object moduleWeight : moduleWeights)
        {
            int tempFuel = ((int) moduleWeight / 3) - 2;
            fuelRequired += tempFuel;
            while (tempFuel > 0)
            {
                int tempAdditionalFuel = (tempFuel / 3) - 2;
                if (tempAdditionalFuel >= 0)
                {
                    fuelRequired += tempAdditionalFuel;
                    tempFuel = tempAdditionalFuel;
                }
                else
                {
                    break;
                }
            }
        }
        return fuelRequired;
    }
}
