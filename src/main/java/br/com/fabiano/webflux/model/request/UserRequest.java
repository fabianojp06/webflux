package br.com.fabiano.webflux.model.request;

public record UserRequest(
        String name,
        String email,
        String password
) {
}
