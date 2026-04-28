package com.manning.javapersistence.flightplaner.mappers;


import com.manning.javapersistence.flightplaner.dtos.RegisterUserRequest;
import com.manning.javapersistence.flightplaner.dtos.UpdateUserRequest;
import com.manning.javapersistence.flightplaner.dtos.UserDto;
import com.manning.javapersistence.flightplaner.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    @Mapping(source = "email", target = "email")
    User toEntity(RegisterUserRequest request);

    void update(UpdateUserRequest request, @MappingTarget User user);
}
