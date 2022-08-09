package br.com.isaquebrb.carlocation.adapter.api.controller;

import br.com.isaquebrb.carlocation.adapter.api.presenter.CarRequest;
import br.com.isaquebrb.carlocation.application.mapper.CarMapper;
import br.com.isaquebrb.carlocation.core.domain.Car;
import br.com.isaquebrb.carlocation.core.usecase.CreateCarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/car")
@RequiredArgsConstructor
public class CarController {

    private final CreateCarUseCase createCarUseCase;

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody @Valid CarRequest carRequest) {
        Car car = CarMapper.toDomain(carRequest);
        return ResponseEntity.ok(createCarUseCase.createCar(car, carRequest.getOwnerId()));
    }
}
