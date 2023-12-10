package com.nickzoos.springtestapp.dto;

import com.nickzoos.springtestapp.model.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
public class UserInfoDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String lastname;
    @Email
    private String email;
    @NotBlank
    @Size(max = 10)
    private String phoneNumber;

    private LocalDate dateOfBirth;

    private Role role;

    private Integer userId;

}
