package com.test;

/**
 * Created by h17 on 6/21/16.
 */
public class MyCompany
{
    public static void main(String[] args)
    {
        MyCompany company = new MyCompany();

        company.printDetailsOnCar(new BMW());
    }


    public void printDetailsOnCar(Car car)
    {
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Color: " + car.getColor());
        System.out.println("Honk Sound: " + car.getHonkSound());
        System.out.println("Miles Per Galon: " + car.getCalculatedMilesPerGalon());
        System.out.println("Is Sedan: " + car.isSedan());

    }









}
