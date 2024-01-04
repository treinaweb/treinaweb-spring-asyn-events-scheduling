package br.com.treinaweb.asynceventsscheduling.core.events;

import org.springframework.context.ApplicationEvent;

public class NewUserEvent extends ApplicationEvent {

    private String email;

    public NewUserEvent(Object source, String email) {
        super(source);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
}
