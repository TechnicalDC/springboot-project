package com.technicaldc.demo.repository;

import com.technicaldc.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
