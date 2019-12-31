package com.inc.emrys.rojaya.repositories;

import com.inc.emrys.rojaya.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    Optional<UserEntity> findByUserName(String userName);
}
