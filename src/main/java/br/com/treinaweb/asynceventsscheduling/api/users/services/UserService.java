package br.com.treinaweb.asynceventsscheduling.api.users.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.treinaweb.asynceventsscheduling.api.users.dtos.UserRequest;
import br.com.treinaweb.asynceventsscheduling.api.users.dtos.UserResponse;
import br.com.treinaweb.asynceventsscheduling.core.services.MailService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final MailService mailService;

    public UserResponse create(UserRequest userRequest) {
        // Simular o cadastro de um usuário
        var user = new UserResponse(
            UUID.randomUUID(), 
            userRequest.getName(),
            userRequest.getEmail()
        );
        // Envio de e-mail de boas vindas
        mailService.send(
            user.getEmail(),
            "Boas vindas",
            "Seja bem-vindo a nossa aplicação!"
        );
        // Finalização do método
        return user;
    }
    
}
