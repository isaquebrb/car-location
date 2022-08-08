package br.com.isaquebrb.carlocation.application.mapper;

import br.com.isaquebrb.carlocation.adapter.persistence.entity.CustomerEntity;
import br.com.isaquebrb.carlocation.core.domain.Car;
import br.com.isaquebrb.carlocation.core.domain.Customer;

import java.util.List;
import java.util.stream.Collectors;

public interface CustomerMapper {

    static Customer toDomain(CustomerEntity entity) {
        List<Car> cars = entity.getCars().stream()
                .map(CarMapper::toDomain)
                .collect(Collectors.toList());

        return Customer.builder()
                .id(entity.getId())
                .name(entity.getName())
                .identificationDocument(entity.getIdentificationDocument())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .cars(cars)
                .build();
    }
}
