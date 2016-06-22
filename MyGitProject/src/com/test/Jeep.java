package com.test;

/**
 * Created by h17 on 6/21/16.
 */
public class Jeep implements Car
{
    @Override
    public String getHonkSound()
    {

        return "peeeng";
    }

    @Override
    public String getBrand()
    {
        String Name = "Blac Cherokee";
        return Name;
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
