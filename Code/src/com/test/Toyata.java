package com.test;

/**
 * Created by h17 on 6/21/16.
 */
public class Toyata implements Car
{
    @Override
    public String getHonkSound()
    {
        return "Pong";
    }

    @Override
    public String getBrand()
    {
        return "Toyota Camry";
    }

    @Override
    public boolean isSedan()
    {
        return false;
    }

    @Override
    public String getColor()
    {
        return "Silver";
    }

    @Override
    public String getCalculatedMilesPerGalon()
    {
        return "32";
    }
}
