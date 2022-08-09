package br.com.isaquebrb.carlocation.adapter.persistence.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class CustomerEntity {

    private String id;

    private String name;

    private String identificationDocument;

    private String email;

    private String phone;

    @Setter(value = AccessLevel.NONE)
    private List<CarEntity> cars = new ArrayList<>();
}
