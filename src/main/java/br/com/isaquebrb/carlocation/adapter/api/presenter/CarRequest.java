package br.com.isaquebrb.carlocation.adapter.api.presenter;

import br.com.isaquebrb.carlocation.core.domain.Car;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class CarRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String model;

    private String brand;

    @NotBlank
    private String identificationNumber;

    @NotBlank
    private String ownerId;

    public Car toDomain() {
        return Car.builder()
                .name(name)
                .model(model)
                .brand(brand)
                .identificationNumber(identificationNumber)
                .build();
    }
}
