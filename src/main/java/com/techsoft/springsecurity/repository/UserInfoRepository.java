package com.techsoft.springsecurity.repository;

import com.techsoft.springsecurity.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {


    Optional<UserInfo> findByName(String userName);


}
