package br.com.treinaweb.asynceventsscheduling.core.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.treinaweb.asynceventsscheduling.core.events.NewUserEvent;
import br.com.treinaweb.asynceventsscheduling.core.services.MailService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GlobalListener {

    private final MailService mailService;

    @EventListener
    public void handleNewUserEvent(NewUserEvent event) {
        var email = event.getEmail();
        mailService.send(email, "E-mail pelo evento", "Corpo do e-mail");
    }
    
}
