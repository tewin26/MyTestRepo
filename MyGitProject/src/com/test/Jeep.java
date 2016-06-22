package com.test;

/**
 * Created by h17 on 6/21/16.
 */
public class Jeep implements Car
{
    @Override
    public String getHonkSound()
    {
        return null;
    }

    @Override
    public String getBrand()
    {
        return null;
    }

    @Override
    public boolean isSedan()
    {
        return false;
    }

    @Override
    public String getColor()
    {
        return "Maze";
    }

    @Override
    public String getCalculatedMilesPerGalon()
    {
        return "20";
    }
}
