package br.com.isaquebrb.carlocation.adapter.persistence.entity;

import lombok.Getter;

import java.util.List;

@Getter
public class CustomerEntity {

    private String id;

    private String name;

    private String identificationDocument;

    private String email;

    private String phone;

    private List<CarEntity> cars;
}
