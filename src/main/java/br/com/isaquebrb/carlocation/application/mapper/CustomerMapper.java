package br.com.isaquebrb.carlocation.application.mapper;

import br.com.isaquebrb.carlocation.adapter.api.presenter.CustomerRequest;
import br.com.isaquebrb.carlocation.adapter.persistence.entity.CustomerEntity;
import br.com.isaquebrb.carlocation.core.domain.Customer;

public interface CustomerMapper {

    static Customer toDomain(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setIdentificationDocument(customer.getIdentificationDocument());
        customer.setEmail(customerRequest.getEmail());
        customer.setPhone(customerRequest.getPhone());
        return customer;
    }

    static Customer toDomain(CustomerEntity customerEntity) {
        Customer customer = new Customer();
        customer.setId(customerEntity.getId());
        customer.setName(customerEntity.getName());
        customer.setIdentificationDocument(customerEntity.getIdentificationDocument());
        customer.setEmail(customerEntity.getEmail());
        customer.setPhone(customerEntity.getPhone());

        customerEntity.getCars()
                .forEach(entity -> customer.getCars().add(CarMapper.toDomain(entity)));

        return customer;
    }

    static CustomerEntity toDomain(Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName(customer.getName());
        customerEntity.setIdentificationDocument(customer.getIdentificationDocument());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setPhone(customer.getPhone());

        customer.getCars()
                .forEach(car -> customerEntity.getCars().add(CarMapper.toEntity(car)));
        return customerEntity;
    }
}
