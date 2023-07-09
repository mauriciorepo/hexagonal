package br.com.hexagonal.adapters.out.client;

import br.com.hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "hexagonal.client.address.url"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(String zipCode);
}
