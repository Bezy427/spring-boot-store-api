package com.manning.javapersistence.flightplaner.mappers;

import com.manning.javapersistence.flightplaner.dtos.OrderDto;
import com.manning.javapersistence.flightplaner.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
