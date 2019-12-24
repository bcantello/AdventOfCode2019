package com.brandoncantello.problem1;

import java.util.List;

public class FuelCalculator
{
    private Data data = new Data();
    private int fuelRequired = 0;

    public int calculator()
    {
        List moduleWeights = data.moduleWeights;

        for (Object moduleWeight : moduleWeights)
        {
            int modWeight = (int) moduleWeight;
            int tempFuel = (modWeight / 3) - 2;
            fuelRequired += tempFuel;
        }
        return fuelRequired;
    }
}
