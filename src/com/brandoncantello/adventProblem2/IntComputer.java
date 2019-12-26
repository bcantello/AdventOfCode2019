package com.brandoncantello.adventProblem2;

public class IntComputer
{
    private IntComputerData data = new IntComputerData();

    public int intCodeComputer()
    {
        int updatedValue = 0;

        for (int i = 0; i < data.intComputerValues.length; i++)
        {
            int opcode = data.intComputerValues[i];
            int position1 = data.intComputerValues[i + 1];
            int position2 = data.intComputerValues[i + 2];
            int destination = data.intComputerValues[i + 3];

            if (opcode == 1)
            {
                data.intComputerValues[destination] =
                        data.intComputerValues[position1] + data.intComputerValues[position2];
                updatedValue = data.intComputerValues[destination];
                i = i + 3;
            }
            else if (opcode == 2)
            {
                data.intComputerValues[destination] =
                        data.intComputerValues[position1] * data.intComputerValues[position2];
                updatedValue = data.intComputerValues[destination];
                i = i + 3;
            }
            else if (opcode == 99)
            {
                break;
            }
        }
        return updatedValue;
    }
}
