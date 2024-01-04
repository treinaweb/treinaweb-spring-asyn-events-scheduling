package br.com.treinaweb.asynceventsscheduling.core.publishers;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import br.com.treinaweb.asynceventsscheduling.core.events.NewUserEvent;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class NewUserPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void publish(String email) {
        var event = new NewUserEvent(this, email);
        applicationEventPublisher.publishEvent(event);
    }
    
}
