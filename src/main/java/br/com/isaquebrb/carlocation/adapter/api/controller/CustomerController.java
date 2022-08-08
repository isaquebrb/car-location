package br.com.isaquebrb.carlocation.adapter.api.controller;

import br.com.isaquebrb.carlocation.adapter.api.presenter.CustomerRequest;
import br.com.isaquebrb.carlocation.core.domain.Customer;
import br.com.isaquebrb.carlocation.core.usecase.CreateCustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CreateCustomerUseCase createCustomerUseCase;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody @Valid CustomerRequest customerRequest) {
        Customer customer = customerRequest.toDomain();
        return ResponseEntity.ok(createCustomerUseCase.createCustomer(customer));
    }
}
