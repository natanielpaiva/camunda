package com.exemplo.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BuscarCep implements JavaDelegate {

    @Autowired
    BuscarCepRepository buscarCepRepository;

    private final Logger LOGGER = LoggerFactory.getLogger(BuscarCep.class.getName());
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String cep = (String) execution.getVariable("cep");

        try{
            CepDomain cepDomain = buscarCepRepository.buscarCep(cep);

            if (!Objects.isNull(cepDomain))
                execution.setVariable("retornoCep", cepDomain);

            LOGGER.info("Cep a buscar" + execution.getCurrentActivityName() + " - " +cep);
        }catch (Exception e){
            execution.setVariable("retornoCep", "");
            LOGGER.info("Erro ao buscar CEP" + execution.getCurrentActivityName());
        }

    }
}
