package br.com.isaquebrb.carlocation.adapter.persistence.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CarEntity {

    private String id;

    private String name;

    private String model;

    private String brand;

    private String identificationNumber;

    private CustomerEntity owner;
}
