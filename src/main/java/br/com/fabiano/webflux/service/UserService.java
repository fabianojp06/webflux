package br.com.fabiano.webflux.service;

import br.com.fabiano.webflux.entity.User;
import br.com.fabiano.webflux.mapper.UsersMapper;
import br.com.fabiano.webflux.model.request.UserRequest;
import br.com.fabiano.webflux.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UsersMapper mapper;
    public Mono<User> save(final UserRequest request){
        return repository.save(mapper.toEntity(request));
    }
}
