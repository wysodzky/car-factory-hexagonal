package com.hexagonal.carfactory.domain.model;

public class Car {
    private final CarId carId;
    private final Make make;

    private Car(final CarId carId, final Make make) {
        this.carId = carId;
        this.make = make;
    }

}
