package com.example.springsecuritymvc.dto;

import com.example.springsecuritymvc.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Role userRole;
}
