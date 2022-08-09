package br.com.isaquebrb.carlocation.application.mapper;

import br.com.isaquebrb.carlocation.adapter.persistence.entity.CarEntity;
import br.com.isaquebrb.carlocation.adapter.persistence.entity.CustomerEntity;
import br.com.isaquebrb.carlocation.core.domain.Customer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerMapperTest {

    private static final CustomerEntity CUSTOMER_ENTITY = getCustomerEntity();

    @Test
    void whenEntityToDomain_shouldReturnDomainClass() {

        Customer mappedCustomer = CustomerMapper.toDomain(CUSTOMER_ENTITY);

        assertThat(CUSTOMER_ENTITY.getId()).isEqualTo(mappedCustomer.getId());
        assertThat(CUSTOMER_ENTITY.getName()).isEqualTo(mappedCustomer.getName());
        assertThat(CUSTOMER_ENTITY.getIdentificationDocument()).isEqualTo(mappedCustomer.getIdentificationDocument());
        assertThat(CUSTOMER_ENTITY.getEmail()).isEqualTo(mappedCustomer.getEmail());
        assertThat(CUSTOMER_ENTITY.getPhone()).isEqualTo(mappedCustomer.getPhone());
        assertThat(CUSTOMER_ENTITY.getCars().get(0).getId()).isEqualTo(mappedCustomer.getCars().get(0).getId());
        assertThat(CUSTOMER_ENTITY.getCars().get(0).getName()).isEqualTo(mappedCustomer.getCars().get(0).getName());
        assertThat(CUSTOMER_ENTITY.getCars().get(0).getBrand()).isEqualTo(mappedCustomer.getCars().get(0).getBrand());
        assertThat(CUSTOMER_ENTITY.getCars().get(0).getModel()).isEqualTo(mappedCustomer.getCars().get(0).getModel());
        assertThat(CUSTOMER_ENTITY.getCars().get(0).getIdentificationNumber())
                .isEqualTo(mappedCustomer.getCars().get(0).getIdentificationNumber());
    }

    private static CustomerEntity getCustomerEntity() {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId("545787");
        customerEntity.setName("Random name test");
        customerEntity.setIdentificationDocument("1788794");
        customerEntity.setEmail("random@teste.com.br");
        customerEntity.setPhone("5534999999999");

        CarEntity carEntity = getCarEntity();
        customerEntity.getCars().add(carEntity);

        return customerEntity;
    }

    private static CarEntity getCarEntity() {
        CarEntity carEntity = new CarEntity();
        carEntity.setId("car id");
        carEntity.setName("car name");
        carEntity.setIdentificationNumber("car identification");
        carEntity.setBrand("car brand");
        carEntity.setModel("car model");
        return carEntity;
    }
}
