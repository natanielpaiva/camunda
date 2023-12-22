package com.exemplo.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetornoCepNulo implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(RetornoCepNulo.class.getName());
    @Override
    public void execute(DelegateExecution execution) throws Exception {

        LOGGER.info("Cep a buscar" + execution.getCurrentActivityName() + " Tá nulo" );
    }
}
