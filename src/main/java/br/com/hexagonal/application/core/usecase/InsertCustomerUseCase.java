package br.com.hexagonal.application.core.usecase;

import br.com.hexagonal.application.core.domain.Customer;
import br.com.hexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {


    private  final FindAddressByZipCodeOutputPort findAddressByZipCodeoutputPort;
    private  final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeoutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort
            ) {
        this.findAddressByZipCodeoutputPort = findAddressByZipCodeoutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeoutputPort.find(zipCode);

        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);

    }
}
