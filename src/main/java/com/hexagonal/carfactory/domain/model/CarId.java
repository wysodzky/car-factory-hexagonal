package com.hexagonal.carfactory.domain.model;

public class CarId {
    private final String value;

    private CarId(final String value) {
        this.value = value;
    }

    public static CarId of(final String carId) {
        return new CarId(carId);
    }

    public String value() {
        return value;
    }
}
