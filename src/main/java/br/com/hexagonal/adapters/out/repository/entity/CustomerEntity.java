package br.com.hexagonal.adapters.out.repository.entity;

import br.com.hexagonal.application.core.domain.Address;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;
}
