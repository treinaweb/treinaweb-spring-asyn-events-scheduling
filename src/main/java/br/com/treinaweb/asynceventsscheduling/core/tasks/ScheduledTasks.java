package br.com.treinaweb.asynceventsscheduling.core.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    // private static final int FIXED_DELAY = 5000;
    // private static final int FIXED_RATE = 5000;
    // private static final int INITIAL_DELAY = 2000;
    private static final String CRON = "0/5 * * * * *";

    @Scheduled(cron = CRON)
    public void taskExample() throws InterruptedException {
        log.info("Task executada");
    }
    
}
