package br.com.isaquebrb.carlocation.adapter.persistence.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
public class CarEntity {

    private String id;

    private String name;

    private String model;

    private String brand;

    private String identificationNumber;

    @Setter
    private CustomerEntity owner;
}
