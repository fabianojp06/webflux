package br.com.fabiano.webflux.mapper;

import br.com.fabiano.webflux.entity.User;
import br.com.fabiano.webflux.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;


@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface UsersMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest request);
}
