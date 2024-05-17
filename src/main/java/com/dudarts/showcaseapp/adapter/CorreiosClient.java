package com.dudarts.showcaseapp.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "correios-api", url = "https://viacep.com.br/ws/")
public interface CorreiosClient {
    @GetMapping("{cep}/json/")
    AddressResponse getAddress(@RequestParam("cep") String cep);
}
