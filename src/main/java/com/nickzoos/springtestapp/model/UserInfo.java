package com.nickzoos.springtestapp.model;

import com.nickzoos.springtestapp.model.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_info")
public class UserInfo extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "lastname", nullable = false)
    private String lastname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column
    private LocalDate dateOfBirth;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private Role role;

}
