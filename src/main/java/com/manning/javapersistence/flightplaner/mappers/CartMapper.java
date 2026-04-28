package com.manning.javapersistence.flightplaner.mappers;

import com.manning.javapersistence.flightplaner.dtos.CartDto;
import com.manning.javapersistence.flightplaner.dtos.CartItemDto;
import com.manning.javapersistence.flightplaner.entities.Cart;
import com.manning.javapersistence.flightplaner.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
//    @Mapping(target = "items", source = "items")
//    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);

//    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
