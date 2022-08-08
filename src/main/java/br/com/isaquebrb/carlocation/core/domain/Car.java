package br.com.isaquebrb.carlocation.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
public class Car {

    private String id;

    private String name;

    private String model;

    private String brand;

    private String identificationNumber;

    @Setter
    private Customer owner;
}
