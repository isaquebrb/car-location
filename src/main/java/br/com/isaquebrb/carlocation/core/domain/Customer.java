package br.com.isaquebrb.carlocation.core.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Customer {

    private String id;

    private String name;

    private String identificationDocument;

    private String email;

    private String phone;

    @Setter(AccessLevel.NONE)
    private List<Car> cars = new ArrayList<>();
}
