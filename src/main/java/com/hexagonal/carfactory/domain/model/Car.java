package com.hexagonal.carfactory.domain.model;

public class Car {
    private final CarId carId;
    private final Make make;

    private final Model model;

    private Car(final CarId carId, final Make make, Model model) {
        this.carId = carId;
        this.make = make;
        this.model = model;
    }

    public CarId carId() {
        return carId;
    }

    public Make make() {
        return make;
    }

    public Model model() {
        return model;
    }

}
