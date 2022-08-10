package br.com.isaquebrb.carlocation.application.service;

import br.com.isaquebrb.carlocation.adapter.persistence.entity.CarEntity;
import br.com.isaquebrb.carlocation.adapter.persistence.entity.CustomerEntity;
import br.com.isaquebrb.carlocation.adapter.persistence.repository.CarRepository;
import br.com.isaquebrb.carlocation.adapter.persistence.repository.CustomerRepository;
import br.com.isaquebrb.carlocation.application.exception.NotFoundException;
import br.com.isaquebrb.carlocation.application.mapper.CarMapper;
import br.com.isaquebrb.carlocation.core.domain.Car;
import br.com.isaquebrb.carlocation.core.usecase.CreateCarUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CreateCarService implements CreateCarUseCase {

    private final CustomerRepository customerRepository;
    private final CarRepository carRepository;

    @Override
    public Car createCar(Car car, final String ownerId) {
        log.info("Searching owner id: [{}]", ownerId);

        //todo create a persistence layer
        CustomerEntity customerEntity = getCustomerEntity(ownerId);

        CarEntity carEntity = CarMapper.toEntity(car);
        carEntity.setOwner(customerEntity);

        carRepository.save(carEntity);
        log.info("Car created successfully, id: [{}]", carEntity.getId());

        return CarMapper.toDomain(carEntity);
    }

    public CustomerEntity getCustomerEntity(String id) {
        return customerRepository.findById(id).orElseThrow(() ->
                new NotFoundException("Customer entity id " + id + " not found"));
    }
}
