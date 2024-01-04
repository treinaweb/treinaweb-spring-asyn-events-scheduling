package br.com.treinaweb.asynceventsscheduling.api.users.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.treinaweb.asynceventsscheduling.api.users.dtos.UserRequest;
import br.com.treinaweb.asynceventsscheduling.api.users.dtos.UserResponse;
import br.com.treinaweb.asynceventsscheduling.core.publishers.NewUserPublisher;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final NewUserPublisher newUserPublisher;

    public UserResponse create(UserRequest userRequest) {
        // Simular o cadastro de um usuário
        var user = new UserResponse(
            UUID.randomUUID(), 
            userRequest.getName(),
            userRequest.getEmail()
        );
        // Publicação do evento
        newUserPublisher.publish(user.getEmail());
        // Finalização do método
        return user;
    }
    
}
