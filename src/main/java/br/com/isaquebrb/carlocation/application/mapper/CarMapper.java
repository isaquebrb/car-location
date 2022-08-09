package br.com.isaquebrb.carlocation.application.mapper;

import br.com.isaquebrb.carlocation.adapter.api.presenter.CarRequest;
import br.com.isaquebrb.carlocation.adapter.persistence.entity.CarEntity;
import br.com.isaquebrb.carlocation.core.domain.Car;

public interface CarMapper {

    static Car toDomain(CarEntity carEntity) {
         Car car = new Car();
         car.setId(carEntity.getId());
         car.setName(carEntity.getName());
         car.setIdentificationNumber(carEntity.getIdentificationNumber());
         car.setBrand(carEntity.getBrand());
         car.setModel(carEntity.getModel());
         return car;
    }

    static CarEntity toEntity(Car car) {
        CarEntity carEntity = new CarEntity();
        carEntity.setId(car.getId());
        carEntity.setName(car.getName());
        carEntity.setIdentificationNumber(car.getIdentificationNumber());
        carEntity.setBrand(car.getBrand());
        carEntity.setModel(car.getModel());
        return carEntity;
    }

    static Car toDomain(CarRequest carRequest) {
        Car car = new Car();
        car.setName(carRequest.getName());
        car.setIdentificationNumber(carRequest.getIdentificationNumber());
        car.setBrand(carRequest.getBrand());
        car.setModel(carRequest.getModel());
        return car;
    }
}
