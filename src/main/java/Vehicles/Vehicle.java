package Vehicles;

import Vehicles.Engine;
import Vehicles.Tyres;

public abstract class Vehicle {

    private Engine engine;
    private Tyres tyres;
    private double price;
    private String colour;
    private CarType carType;


    public Vehicle(Engine engine, Tyres tyres, double price, String colour, CarType carType){
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.carType = carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public CarType getCarType() {
        return carType;
    }
}
