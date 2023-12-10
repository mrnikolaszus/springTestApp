package com.nickzoos.springtestapp.repository;

import com.nickzoos.springtestapp.model.UserInfo;
import com.nickzoos.springtestapp.model.enums.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface UserInfoRepository extends BaseRepository<UserInfo> {

    Page<UserInfo> findUserInfoByDateOfBirthBetweenOrPhoneNumberContaining(
            LocalDate dateStart,
            LocalDate dateEnd,
            String phoneNumberContains,
            Pageable pageable
    );

    UserInfo findUserInfoByEmail(String email);

    Page<UserInfo> findUserInfoByRole(Role role, Pageable pageable);

}
