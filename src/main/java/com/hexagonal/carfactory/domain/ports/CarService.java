package com.hexagonal.carfactory.domain.ports;

import com.hexagonal.carfactory.domain.model.Car;
import com.hexagonal.carfactory.domain.model.CarId;
import com.hexagonal.carfactory.domain.model.Make;
import com.hexagonal.carfactory.domain.model.Model;

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarId create(Make make, Model model) {
        final Car car = carRepository.save(make,model);

        return car.carId();
    }

    public Car get(CarId carId) {
        final Car car = carRepository.get(carId);
        return car;
    }
}

