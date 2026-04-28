package com.manning.javapersistence.flightplaner.users;

import com.manning.javapersistence.flightplaner.auth.Lowercase;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserRequest {
    @NotBlank(message = "Name is required!")
    @Size(max = 255, message = "Name must be less than 255 characters")
    private String name;

    @NotBlank(message = "Email is required!")
    @Email(message = "Email must be valid")
    @Lowercase(message = "Email must be lowercase")
    private String email;

    @NotBlank(message = "Password is required!")
    @Size(min = 6, max = 25, message = "Password must be between 6 to 25 characters")
    private String password;

    public @NotBlank(message = "Name is required!") @Size(max = 255, message = "Name must be less than 255 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is required!") @Size(max = 255, message = "Name must be less than 255 characters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Password is required!") @Size(min = 6, max = 25, message = "Password must be between 6 to 25 characters") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required!") @Size(min = 6, max = 25, message = "Password must be between 6 to 25 characters") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Email is required!") @Email(message = "Email must be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required!") @Email(message = "Email must be valid") String email) {
        this.email = email;
    }
}
