package br.com.isaquebrb.carlocation.application.mapper;

import br.com.isaquebrb.carlocation.adapter.persistence.entity.CarEntity;
import br.com.isaquebrb.carlocation.core.domain.Car;

public interface CarMapper {

    static Car toDomain(CarEntity entity) {
        return Car.builder()
                .id(entity.getId())
                .name(entity.getName())
                .model(entity.getModel())
                .brand(entity.getBrand())
                .identificationNumber(entity.getIdentificationNumber())
                .build();
    }

    static CarEntity toEntity(Car car) {
        return CarEntity.builder()
                .name(car.getName())
                .model(car.getModel())
                .brand(car.getBrand())
                .identificationNumber(car.getIdentificationNumber())
                .build();
    }
}
