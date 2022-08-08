package br.com.isaquebrb.carlocation.core.usecase;

import br.com.isaquebrb.carlocation.core.domain.Car;

public interface CreateCarUseCase {

    Car createCar(Car car, String ownerId);
}
