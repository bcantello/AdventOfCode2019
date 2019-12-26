package com.brandoncantello;

import com.brandoncantello.adventProblem1.FuelCalculator;
import com.brandoncantello.adventProblem2.IntComputer;

public class Main
{
    public static void main(String[] args)
    {
        /**
         * Run Solution to Problem 1:
         */
        FuelCalculator fuelCalculator = new FuelCalculator();
        System.out.println("Solution 1: " + fuelCalculator.moduleFuelCalculator());

        /**
         * Run Solution to Problem 2:
         */
        IntComputer intComputer = new IntComputer();
        System.out.println("Solution 2: " + intComputer.intCodeComputer());
    }
}
