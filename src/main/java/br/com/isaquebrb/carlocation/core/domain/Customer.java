package br.com.isaquebrb.carlocation.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Customer {

	private String id;

	private String name;

	private String identificationDocument;

	private String email;

	private String phone;

	private List<Car> cars;
}
