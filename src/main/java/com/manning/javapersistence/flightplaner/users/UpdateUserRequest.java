package com.manning.javapersistence.flightplaner.users;

import lombok.Data;

@Data
public class UpdateUserRequest {
    private String name;
    private String email;
}
