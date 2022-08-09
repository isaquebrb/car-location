package br.com.isaquebrb.carlocation.application.service;

import br.com.isaquebrb.carlocation.adapter.persistence.entity.CustomerEntity;
import br.com.isaquebrb.carlocation.adapter.persistence.repository.CustomerRepository;
import br.com.isaquebrb.carlocation.application.mapper.CustomerMapper;
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
        CustomerEntity customerEntity = CustomerMapper.toDomain(customer);

        customerRepository.save(customerEntity);
        log.info("Customer created successfully, id: [{}]", customerEntity.getId());

        //todo check if id is updated
        return CustomerMapper.toDomain(customerEntity);
    }
}
