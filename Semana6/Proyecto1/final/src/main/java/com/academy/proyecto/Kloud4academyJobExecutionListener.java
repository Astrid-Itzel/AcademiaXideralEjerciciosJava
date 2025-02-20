package com.academy.proyecto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/* Listener. Se ejecuta después de que el Job finaliza.
*/
public class Kloud4academyJobExecutionListener implements JobExecutionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(Kloud4academyJobExecutionListener.class);

    
    /* Método que se ejecuta después de que el Job ha finalizado.
     * Si el Job se completa con éxito, se registra un mensaje en el log.*/
    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            LOGGER.info("!!! JOB FINISHED! Time to verify the results");
        }
    }
}
