package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJpa extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findById(Integer id);
}
