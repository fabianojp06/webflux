package br.com.fabiano.webflux.controller.impl;

import br.com.fabiano.webflux.controller.UserController;
import br.com.fabiano.webflux.model.request.UserRequest;
import br.com.fabiano.webflux.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserControllerImpl implements UserController {

    private final UserService service;

    @Override
    public ResponseEntity<Mono<Void>> save(final UserRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.save(request).then());
    }

    @Override
    public ResponseEntity<Mono<UserRequest>> find(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Flux<UserRequest>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Mono<UserRequest>> update(String id, UserRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<Void>> delete(String id) {
        return null;
    }
}
