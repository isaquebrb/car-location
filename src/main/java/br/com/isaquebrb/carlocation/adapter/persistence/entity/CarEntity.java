package br.com.isaquebrb.carlocation.adapter.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Setter
@Getter
@Document(indexName = "carindex")
public class CarEntity {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String model;

    @Field(type = FieldType.Text)
    private String brand;

    @Field(type = FieldType.Text)
    private String identificationNumber;

    @Field(type = FieldType.Nested)
    private CustomerEntity owner;
}
