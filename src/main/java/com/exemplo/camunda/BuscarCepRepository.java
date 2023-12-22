package com.exemplo.camunda;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "buscarCep", url = "https://viacep.com.br/ws")
public interface BuscarCepRepository {
    @GetMapping(value = "/{cep}/json")
    CepDomain buscarCep(@PathVariable("cep") String cep);
}
