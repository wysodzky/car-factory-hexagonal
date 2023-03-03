package com.hexagonal.carfactory.domain.ports;

import com.hexagonal.carfactory.domain.model.Car;
import com.hexagonal.carfactory.domain.model.CarId;
import com.hexagonal.carfactory.domain.model.Make;
import com.hexagonal.carfactory.domain.model.Model;

public interface CarRepository {

    Car save(Make make, Model model);

    Car get(CarId carId);
}
