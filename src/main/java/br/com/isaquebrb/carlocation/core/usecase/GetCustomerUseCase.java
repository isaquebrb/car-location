package br.com.isaquebrb.carlocation.core.usecase;

import br.com.isaquebrb.carlocation.core.domain.Customer;

public interface GetCustomerUseCase {

    Customer getCustomer(String id);
}
