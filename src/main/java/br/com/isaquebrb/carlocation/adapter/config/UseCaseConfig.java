package br.com.isaquebrb.carlocation.adapter.config;

import br.com.isaquebrb.carlocation.adapter.persistence.repository.CarRepository;
import br.com.isaquebrb.carlocation.adapter.persistence.repository.CustomerRepository;
import br.com.isaquebrb.carlocation.application.service.CreateCarService;
import br.com.isaquebrb.carlocation.application.service.CreateCustomerService;
import br.com.isaquebrb.carlocation.application.service.GetCustomerService;
import br.com.isaquebrb.carlocation.core.usecase.CreateCarUseCase;
import br.com.isaquebrb.carlocation.core.usecase.CreateCustomerUseCase;
import br.com.isaquebrb.carlocation.core.usecase.GetCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetCustomerUseCase getCustomerUseCase(CustomerRepository customerRepository){
        return new GetCustomerService(customerRepository);
    }

    @Bean
    public CreateCarUseCase createCarUseCase(CustomerRepository customerRepository, CarRepository carRepository) {
        return new CreateCarService(customerRepository, carRepository);
    }

    @Bean
    public CreateCustomerUseCase createCustomerUseCase(CustomerRepository customerRepository) {
        return new CreateCustomerService(customerRepository);
    }
}
