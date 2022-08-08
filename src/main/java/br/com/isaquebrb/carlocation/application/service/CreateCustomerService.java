package br.com.isaquebrb.carlocation.application.service;

import br.com.isaquebrb.carlocation.adapter.persistence.repository.CustomerRepository;
import br.com.isaquebrb.carlocation.core.domain.Customer;
import br.com.isaquebrb.carlocation.core.usecase.CreateCustomerUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CreateCustomerService implements CreateCustomerUseCase {

    private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        //todo implement
        return null;
    }
}
