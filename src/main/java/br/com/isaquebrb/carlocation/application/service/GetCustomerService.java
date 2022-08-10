package br.com.isaquebrb.carlocation.application.service;

import br.com.isaquebrb.carlocation.adapter.persistence.entity.CustomerEntity;
import br.com.isaquebrb.carlocation.adapter.persistence.repository.CustomerRepository;
import br.com.isaquebrb.carlocation.application.exception.NotFoundException;
import br.com.isaquebrb.carlocation.application.mapper.CustomerMapper;
import br.com.isaquebrb.carlocation.core.domain.Customer;
import br.com.isaquebrb.carlocation.core.usecase.GetCustomerUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetCustomerService implements GetCustomerUseCase {

    private final CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(String id) {
        CustomerEntity entity = customerRepository.findById(id).orElseThrow(() ->
                new NotFoundException("Customer entity id " + id + " not found"));
        return CustomerMapper.toDomain(entity);
    }
}
