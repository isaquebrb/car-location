package br.com.isaquebrb.carlocation.adapter.api.presenter;

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
}
