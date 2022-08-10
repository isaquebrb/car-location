package br.com.isaquebrb.carlocation.adapter.persistence.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Document(indexName = "customerindex")
public class CustomerEntity {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String identificationDocument;

    @Field(type = FieldType.Text)
    private String email;

    @Field(type = FieldType.Text)
    private String phone;

    @Setter(value = AccessLevel.NONE)
    private List<CarEntity> cars = new ArrayList<>();
}
