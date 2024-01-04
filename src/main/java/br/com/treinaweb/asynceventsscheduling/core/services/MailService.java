package br.com.treinaweb.asynceventsscheduling.core.services;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final Logger log = LoggerFactory.getLogger(MailService.class);

    private static final Duration DELAY = Duration.ofSeconds(2);

    @Async
    public void sendAsync(String to, String subject, String body) {
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            log.error(e.getLocalizedMessage());
        }
        log.info("E-mail enviado para {}", to);
    }
    
    public void send(String to, String subject, String body) {
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            log.error(e.getLocalizedMessage());
        }
        log.info("E-mail enviado para {}", to);
    }
    
}
