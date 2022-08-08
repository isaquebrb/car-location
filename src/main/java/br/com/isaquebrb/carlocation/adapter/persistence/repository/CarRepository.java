package br.com.isaquebrb.carlocation.adapter.persistence.repository;

import br.com.isaquebrb.carlocation.adapter.persistence.entity.CarEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CarRepository extends ElasticsearchRepository<CarEntity, String> {

}
