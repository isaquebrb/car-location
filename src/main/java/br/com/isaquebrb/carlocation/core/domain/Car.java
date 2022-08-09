package br.com.isaquebrb.carlocation.core.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {

    private String id;

    private String name;

    private String model;

    private String brand;

    private String identificationNumber;

    private Customer owner;
}
