package com.test;

/**
 * Created by h17 on 6/21/16.
 */
public class BMW implements Car
{
    @Override
    public String getHonkSound()
    {
        return "Pring";
    }

    @Override
    public String getBrand()
    {
        return "BMW 328XI";
    }

    @Override
    public boolean isSedan()
    {
        return true;
    }

    @Override
    public String getColor()
    {
        return "Black";
    }

    @Override
    public String getCalculatedMilesPerGalon()
    {
        return "25";
    }
}
