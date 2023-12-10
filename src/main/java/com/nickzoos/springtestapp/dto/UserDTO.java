package com.nickzoos.springtestapp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {

    @NotBlank
    private String userName;

    @NotBlank
    private String password;

    private Integer userInfoId;

}
