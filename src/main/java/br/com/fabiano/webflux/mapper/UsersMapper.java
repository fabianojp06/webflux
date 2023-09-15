package br.com.fabiano.webflux.mapper;

import br.com.fabiano.webflux.entity.User;
import br.com.fabiano.webflux.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(
        componentModel = "spring"
)
public interface UsersMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest request);
}
