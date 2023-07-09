package br.com.hexagonal.application.ports.out;

import br.com.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
