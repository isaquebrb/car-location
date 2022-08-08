package br.com.isaquebrb.carlocation.adapter.persistence.repository;

import br.com.isaquebrb.carlocation.adapter.persistence.entity.CustomerEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<CustomerEntity, String> {

}
