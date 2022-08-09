package br.com.isaquebrb.carlocation.adapter.api.presenter;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
public class CustomerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String identificationDocument;

    @Email
    private String email;

    private String phone;
}
