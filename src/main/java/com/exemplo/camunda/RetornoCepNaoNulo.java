package com.exemplo.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetornoCepNaoNulo implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(RetornoCepNaoNulo.class.getName());
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        CepDomain cep = (CepDomain) execution.getVariable("retornoCep");

        LOGGER.info("Cep a buscar Não nulo" + execution.getCurrentActivityName() + " - " +cep);
    }
}
