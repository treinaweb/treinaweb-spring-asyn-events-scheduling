package br.com.treinaweb.asynceventsscheduling.core.listeners;

import org.springframework.context.ApplicationListener;

import br.com.treinaweb.asynceventsscheduling.core.events.NewUserEvent;
import br.com.treinaweb.asynceventsscheduling.core.services.MailService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NewUserListener implements ApplicationListener<NewUserEvent> {

    private final MailService mailService;

    @Override
    public void onApplicationEvent(NewUserEvent event) {
        var email = event.getEmail();
        mailService.send(email, "E-mail pelo evento", "Corpo do e-mail");
    }
    
}
