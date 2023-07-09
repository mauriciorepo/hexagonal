package br.com.hexagonal.adapters.out.repository.mapper;

import br.com.hexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper( componentModel = "spring")
public interface CustomerEntityMapper {

    public CustomerEntity toCustomerEntity(Customer customer);
}
